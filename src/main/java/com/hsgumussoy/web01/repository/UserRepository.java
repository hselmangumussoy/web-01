package com.hsgumussoy.web01.repository;

import com.hsgumussoy.web01.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository <User, Integer>{

    public  User findByUserNameAndPassword(String username, String password);
    public User findUserByUserNameEqualsAndPasswordEquals(String username);

}
