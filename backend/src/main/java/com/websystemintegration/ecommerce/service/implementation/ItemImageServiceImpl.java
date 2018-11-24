package com.websystemintegration.ecommerce.service.implementation;

import com.websystemintegration.ecommerce.service.ItemImageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


@Service
public class ItemImageServiceImpl implements ItemImageService {

    private Logger log = LoggerFactory.getLogger(this.getClass().getName());
    private final Path rootLocation = Paths.get("itemImages");

    @Override
    public void store(MultipartFile file) {
        try{
            Files.copy(file.getInputStream(),this.rootLocation.resolve(file.getOriginalFilename()));
        }catch (Exception e){
            throw new RuntimeException("Fail! -> message = " + e.getMessage());
        }
    }

    @Override
    public Resource loadFile(String fileName) {
        try{
            Path file = rootLocation.resolve(fileName);
            Resource resource = new UrlResource(file.toUri());
            if(resource.exists() || resource.isReadable()){
                return resource;
            }else{
                throw new RuntimeException("Fail!");
            }
        }catch(MalformedURLException e){
            throw new RuntimeException("Error! -> message = " + e.getMessage());
        }
    }

    @PostConstruct
    public void init() {
        try{
            log.info("Creating the folder");
            if(Files.exists(this.rootLocation)){
                return;
            }
            Files.createDirectory(rootLocation);
        }catch (IOException ex){
            throw new RuntimeException("Could not initialize storage!");
        }
    }


}
