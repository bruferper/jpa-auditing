package com.bfz.jpaauditing.service.impl;

import com.bfz.jpaauditing.entity.User;
import com.bfz.jpaauditing.repository.IUserRepository;
import com.bfz.jpaauditing.service.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author bruferper
 */
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements IUserService {

    private final IUserRepository userRepository;

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User create(User user) {
        return userRepository.save(user);
    }

    @Override
    public User update(Long id, User user) {
        User userToUpdate = userRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("User not found"));
        userToUpdate.setFirstName(user.getFirstName());
        userToUpdate.setLastName(user.getLastName());
        return userRepository.save(userToUpdate);
    }

}
