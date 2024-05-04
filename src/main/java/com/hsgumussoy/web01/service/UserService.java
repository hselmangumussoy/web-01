package com.hsgumussoy.web01.service;

import com.hsgumussoy.web01.dto.UserDto;
import com.hsgumussoy.web01.entity.User;
import com.hsgumussoy.web01.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    //service dediğimiz şey bir java classı değildir. bir spring bean dir

    @Autowired
    private UserRepository repository;

    public UserDto createUser(UserDto dto){
        User user= toUser(dto);
        user =  repository.save(user);
        return  fromUser(user);
    }
    public User toUser(UserDto userDto){//user dan dto ya çevirir.
        User user =new User();
        user.setUserName(userDto.userName);
        user.setFullName(userDto.fullName);
        user.setBirthDay(userDto.birthDay);
        user.setEmail(userDto.email);
        user.setPassword(userDto.password);
        return user;
    }
    public UserDto fromUser(User user){//dto dan user a çevirir.
        UserDto userDto = new UserDto();
        userDto.userName = user.getUserName();
        userDto.fullName= user.getFullName();
        userDto.birthDay = user.getBirthDay();
        userDto.email = user.getEmail();
        userDto.password = user.getPassword();

        return userDto;
    }
    public UserDto login(UserDto dto){
        User  user1 = repository.findByUserNameAndPassword(dto.userName, dto.password);
        return fromUser(user1) ;
    }

}
