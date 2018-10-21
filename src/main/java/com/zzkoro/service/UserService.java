package com.zzkoro.service;

import com.zzkoro.model.User;

import java.util.List;

/**
 * Created by junemp on 2018. 10. 20..
 */
public interface UserService {
    User save(User user);
    List<User> findAll();
    void delete(long id);
}
