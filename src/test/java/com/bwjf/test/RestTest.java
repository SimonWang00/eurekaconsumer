package com.bwjf.test;

import org.junit.Test;
import com.bwjf.framework.base.util.HttpUtil;

import java.util.*;

public class RestTest{

    @Test
    public void golang() {
        HashMap params = new HashMap<>();
        String content = HttpUtil.doGet("http://localhost:9002/test/golang", params, 5000);
        System.out.printf("golang res:%s",content);
    }

    @Test
    public void tornado() {
        HashMap params = new HashMap<>();
        String content = HttpUtil.doGet("http://localhost:9002/test/tornado", params, 5000);
        System.out.printf("tornado res:%s",content);
    }

}
