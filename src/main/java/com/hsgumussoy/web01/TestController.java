package com.hsgumussoy.web01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //dışarı açıyor
@RequestMapping(path = "/test") //dışarı açılırken hangi uçtan açılacağını belirtmek için
public class TestController {

    //herhangi bir configirasyon yapmak istersen resourses ın altındaki application.yml yapıp orada düzenleme yapabilirsin


    @GetMapping("/login")
    public String hello(){
        return  "Merhaba Dünya Login Oldun.";
    }

    @GetMapping("/register")
    public String register(){
        return  "Merhaba Dünya Kayıt Oldun.";
    }

    //bizim makinemizin ip sinin domaini: localhost -> 127.0.0.1

    @GetMapping("/tutorial/{myParam}")
    public String tutorial(@PathVariable(name = "myParam") String myParam){
        return "Merhaba Dünya Tutorial Oldun";
    }


}
