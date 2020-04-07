package com.testcase;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class LoginTest {
    private static HashMap<String, Object> hm = new HashMap<>();

    @Test
    void LoginTest() {
        hm.put("login", "登陆成功");
    }



    @Nested
    class PayTest {
        @Test
        void payTest() {
            if (null!=hm.get("buy")){
                System.out.println("正在支付，请等待");
            }
            else{
                System.out.println("你还没有购买课程，赶紧去买");
            }
        }
    }

    @Nested
    class BuyTest {
        @Test
        void BuyTest() {
            if (hm.get("login").equals("登陆成功")) {
                System.out.println("登录成功，可以购买");
                hm.put("buy", "购买了名企课程");
            } else {
                System.out.println("请登录");
            }
        }
    }



}
