package com.testcase;

import org.junit.After;
import org.junit.jupiter.api.*;

/**
 * Created by feimo on 2020/2/25.
 */
@DisplayName("junit5y用例集")
public class Junit5Demo1Test {

    @BeforeAll
    @Disabled
    public static void BeforeAll() {
        System.out.println("BeforeAll");
    }


    @BeforeEach
    public void BeforeEach() {
        System.out.println("BeforeEach");
    }


    @Test
    @DisplayName("测试用例1")
    @RepeatedTest(3)
    @Disabled
    void run1() {
        System.out.println("fun1");
    }

    @Test
    @DisplayName("测试用例2")
    void run2() {
        System.out.println("fun2");
    }

    @AfterAll
    public static void AfterAll() {
        System.out.println("AfterAll");
    }
}
