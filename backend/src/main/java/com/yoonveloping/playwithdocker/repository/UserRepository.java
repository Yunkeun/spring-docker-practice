package com.yoonveloping.playwithdocker.repository;

import com.yoonveloping.playwithdocker.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
