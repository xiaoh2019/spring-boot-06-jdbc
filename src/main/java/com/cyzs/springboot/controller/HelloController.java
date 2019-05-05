package com.cyzs.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * @author xiaoH
 * @create 2019-05-05-14:53
 */
@Controller
public class HelloController {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @ResponseBody
    @RequestMapping("/hello")
    public Map<String ,Object> hello(){
        List<Map<String, Object>> list = jdbcTemplate.queryForList("select * from department");

        return list.get(0);
    }
}
