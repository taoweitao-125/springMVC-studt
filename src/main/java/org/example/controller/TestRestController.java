package org.example.controller;

import org.example.model.JSONResponcse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author xiaogege
 * @描述：
 * @date 2020/12/26
 * @time 12:05
 */
@RestController
@RequestMapping("/rest")
public class TestRestController {
    @GetMapping("/1")
    public Object test1() {
        JSONResponcse resp = new JSONResponcse();
        resp.setCode("LOG001");
        resp.setMessage("hahah");
        resp.setData(new Date());
        return resp;
    }
}
