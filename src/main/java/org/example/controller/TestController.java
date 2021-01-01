package org.example.controller;

import org.example.model.JSONResponcse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author xiaogege
 * @描述：
 * @date 2020/12/26
 * @time 10:42
 */
@Controller
@RequestMapping("/test")
public class TestController {
    @RequestMapping("/1")
    public String test1() {
//        转发，一次请求url不变 服务端把资源作为响应体直接返回
        return "forward:/home.html";
    }

    @RequestMapping("/2")
    public String test2() {
//        重定向，两次请求，url会变 响应3xx+location 浏览器自动跳转
        return "redirect:/home.html";
    }
    @RequestMapping("/3")
    @ResponseBody
    public String test3(){
        return "redirect:/home.html";
    }

    @RequestMapping("/4")
    @ResponseBody
    public Object test4() {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"name");
        map.put(2,"age");
        map.put(3,"sex");
        return map;
    }
//    只提供get，post方法
    @RequestMapping(value = "/4_1",method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public Object test4_1() {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"name");
        map.put(2,"age");
        map.put(3,"sex");
        return map;
    }

    @RequestMapping(value = "/4_2")
    @ResponseBody
    public Object test4_2() {
        JSONResponcse resp = new JSONResponcse();
        resp.setCode("LOG001");
        resp.setMessage("hahah");
        resp.setData(new Date());
        return resp;
    }

    @RequestMapping("/5")
    @ResponseBody
    public Object test5() {
        Map<String,Object> map = new HashMap<>();
        String[] str = {"id=1","name=魏涛"};
        map.put("success",true);
        map.put("data", str);
        map.put("content","屋里哇啦");
        return map;
    }
    @RequestMapping("/6")
    public ResponseEntity test6() {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"name");
        map.put(2,"age");
        map.put(3,"sex");
        return ResponseEntity.status(200).body(map);
    }

}
