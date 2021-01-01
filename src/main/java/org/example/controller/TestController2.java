package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author xiaogege
 * @描述：
 * @date 2020/12/26
 * @time 10:51
 */
@Controller
public class TestController2 {
    @RequestMapping("/test3")
    public String test3(){
        return "forward:/home.html";
    }
}
