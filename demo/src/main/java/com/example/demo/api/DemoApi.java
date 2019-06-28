package com.example.demo.api;

import com.example.demo.client.DemoClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author louwang
 * @date 2019/6/28
 */
@RestController
@RequestMapping(value = "/demo")
public class DemoApi {

    @Autowired
    private DemoClient demoClient;

    @RequestMapping(value = "/info",method = RequestMethod.GET)
    public String getInfo(){
        return demoClient.getOwnClient();
    }
}
