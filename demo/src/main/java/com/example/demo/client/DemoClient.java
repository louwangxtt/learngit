package com.example.demo.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;


/**
 * @author louuwang
 * @date 2019/6/28
 */
@Component
@FeignClient(name = "DemoClient", url = "http://127.0.0.1:10102")
public interface DemoClient {
    /**
     * 获取注册中心里所调用的OWNLIENTC的数据信息
     * @return
     */
    @GetMapping(value = "/study/test")
    String  getOwnClient();
}
