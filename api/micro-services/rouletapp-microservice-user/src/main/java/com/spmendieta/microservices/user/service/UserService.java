package com.spmendieta.microservices.user.service;

import com.spmendieta.microservices.user.model.entity.User;
import java.util.Optional;

/**
 * @author spmendietadev
 */
public interface UserService {

    public Iterable<User> findAll();

    public Optional<User> findById(Integer id);

    public User save(User user);

    public void deleteById(Integer id);
}
