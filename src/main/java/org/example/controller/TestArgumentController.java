package org.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xiaogege
 * @描述：
 * @date 2021/1/1
 * @time 9:21
 */
@RestController
@RequestMapping("/arg")
public class TestArgumentController {

    private static final Logger log = LoggerFactory.getLogger(TestArgumentController.class);

    @GetMapping("/holiday/{day}")
    public Object holiday(@PathVariable String day) {
        log.debug("获取到请求路径参数" + day);
        Map<String,Object> map = new HashMap<>();
        map.put("OK",true);
        return map;
    }

    @PostMapping("/login")
    public Object login(@RequestParam String username,@RequestParam String password){
        log.debug("获取到请求路径参数:" + "username=" + username , "password=" + password);
        Map<String,Object> map = new HashMap<>();
        map.put("OK",true);
        return map;
    }

    @PostMapping("/login2")
    public Object login2(@RequestParam(required = false) int i){
        log.debug("获取到请求路径参数: i = " + i);
        Map<String,Object> map = new HashMap<>();
        map.put("OK",true);
        return map;
    }


}
