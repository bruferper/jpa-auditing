package com.bfz.jpaauditing.service;

import com.bfz.jpaauditing.entity.User;

import java.util.List;

/**
 * @author bruferper
 */

public interface IUserService {

    List<User> findAll();
    User create(User user);
    User update(Long id, User user);

}
