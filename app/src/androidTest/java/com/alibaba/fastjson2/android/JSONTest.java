package com.alibaba.fastjson2.android;

import org.junit.Test;

import static org.junit.Assert.*;

import com.alibaba.fastjson2.JSON;

public class JSONTest {

    @Test
    public void test_parseObject() {
        User user = JSON.parseObject(
            "{\"id\":1,\"name\":\"kraity\"}", User.class
        );

        assertEquals(1, user.id);
        assertEquals("kraity", user.name);
    }

    static class User {
        public int id;
        public String name;
    }

}
