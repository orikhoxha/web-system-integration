package com.websystemintegration.ecommerce.repository;

import com.websystemintegration.ecommerce.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

    User findByUsernameAndPassword(String username, String password);

}
