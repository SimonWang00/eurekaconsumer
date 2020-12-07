package com.bwjf.data.server.service.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
@FeignClient(value = "TORNADO-SERVER")
public interface TornadoFeignTest {

    @GetMapping("/hello")
    void test ();
}
