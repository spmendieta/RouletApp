package com.spmendieta.microservices.user.model.repository;

import com.spmendieta.microservices.user.model.entity.User;
import org.springframework.data.repository.CrudRepository;

/**
 * @author spmendietadev
 */
public interface UserRepository extends CrudRepository<User, Integer>{
    
}
