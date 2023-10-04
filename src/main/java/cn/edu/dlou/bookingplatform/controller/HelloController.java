package cn.edu.dlou.bookingplatform.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String handle(){
        System.out.println("请求处理");
        return "OK";
    }
}
