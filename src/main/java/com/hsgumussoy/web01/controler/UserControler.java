package com.hsgumussoy.web01.controler;


import com.hsgumussoy.web01.dto.UserDto;
import com.hsgumussoy.web01.entity.User;
import com.hsgumussoy.web01.response.UserResponse;
import com.hsgumussoy.web01.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "users")
public class UserControler {

    @Autowired // gereksiz olarak class new lemiyi ,JVM den alan işgal etmesi gibi performans sorunlarının önüne geçer.
    private UserService userService;

    @PostMapping
    public UserResponse createUser(@RequestBody UserDto user){
        UserDto result = userService.createUser(user);
        return toResponse(result);
    }
    @PostMapping
    public UserResponse login(@RequestBody UserDto user){
        UserDto result = userService.login(user);

        return toResponse(result);
    }

    public UserResponse toResponse(UserDto userDto){
        UserResponse  response = new UserResponse();
        response.user = userDto;
        return response;
    }
}
