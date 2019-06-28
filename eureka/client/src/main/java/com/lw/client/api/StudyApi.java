package com.lw.client.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author louwang
 * @date 2019/6/28
 */
@RestController
@RequestMapping("/study")
public class StudyApi {
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String test(){
        return "这是测试eureka注册中心 OWNCLIENT 是否远程调用到";
    }

}
