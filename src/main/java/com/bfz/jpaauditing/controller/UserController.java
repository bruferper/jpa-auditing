package com.bfz.jpaauditing.controller;

import com.bfz.jpaauditing.dto.UserRequestDto;
import com.bfz.jpaauditing.dto.UserResponseDto;
import com.bfz.jpaauditing.entity.User;
import com.bfz.jpaauditing.service.IUserService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author bruferper
 */

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {

    private final IUserService userService;
    private final ModelMapper modelMapper;

    @GetMapping
    public ResponseEntity<List<UserResponseDto>> findAll() {
        List<User> userList = userService.findAll();
        return ResponseEntity.ok(userList.stream().map(user -> modelMapper.map(user, UserResponseDto.class)).toList());
    }

    @PostMapping
    public ResponseEntity<User> create(@RequestBody UserRequestDto request) {
        return ResponseEntity.ok(userService.create(modelMapper.map(request, User.class)));
    }

    @PutMapping("/{id}")
    public ResponseEntity<User> update(@PathVariable("id") Long id, @RequestBody UserRequestDto request) {
        return ResponseEntity.ok(userService.update(id, modelMapper.map(request, User.class)));
    }

}
