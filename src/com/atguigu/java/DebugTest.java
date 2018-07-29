package com.atguigu.java;

import java.util.HashMap;
import java.util.Map;

public class DebugTest {
    public static void main(String[] args) {

        Map<String,String> map = new HashMap<>();
        map.put("aa","AA");
        map.put("bb","BB");
        map.put("cc","CC");
        map.put("dd","DD");

        String a = map.get("aa");
        System.out.println("a = " + a);

        map.remove("bb");
        System.out.println(map);

    }
}
