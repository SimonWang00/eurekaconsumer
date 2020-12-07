package com.bwjf.data.server.rest;

import com.bwjf.data.server.service.feign.GolangFeignTest;
import com.bwjf.data.server.service.feign.TornadoFeignTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {

    @Autowired
    private GolangFeignTest golangFeignTest;

    @Autowired
    private TornadoFeignTest tornadoFeignTest;

    @GetMapping("golang")
    public void golang(){
        golangFeignTest.test();
    }

    @GetMapping("tornado")
    public void tornado(){
        tornadoFeignTest.test();
    }
}
