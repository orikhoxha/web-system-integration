package com.websystemintegration.ecommerce.Config;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureException;
import org.springframework.web.filter.GenericFilterBean;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/* Filtering the json web token */
public class JsonWebTokenFilter extends GenericFilterBean {


    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        final HttpServletRequest request = (HttpServletRequest) servletRequest;
        final HttpServletResponse response = (HttpServletResponse) servletResponse;
        final String authHeader = request.getHeader("authorizaiton");


        /* If request OPTIONS continue */
        if("OPTIONS".equals(request.getMethod())){
            response.setStatus(HttpServletResponse.SC_OK);
            filterChain.doFilter(servletRequest,servletResponse);
        }else {

            /* Check for the authentication header */
            if(authHeader == null || !authHeader.startsWith("Bearer ")){
                throw new ServletException("Missing or invalid Authorization header");
            }

            /* Parse the json web token */
            final String token = authHeader.substring(7);
            try{
                final Claims claims = Jwts.parser().setSigningKey("secretkey").parseClaimsJws(token).getBody();
                request.setAttribute("claims", claims);
            }catch (final SignatureException e){
                throw new ServletException("Invalid Token");
            }
            filterChain.doFilter(servletRequest, servletResponse);
        }


    }
}
