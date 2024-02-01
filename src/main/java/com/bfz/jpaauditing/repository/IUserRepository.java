package com.bfz.jpaauditing.repository;

import com.bfz.jpaauditing.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author bruferper
 */

public interface IUserRepository extends JpaRepository<User, Long> { }
