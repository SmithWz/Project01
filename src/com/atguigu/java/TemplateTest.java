package com.atguigu.java;

import java.util.ArrayList;
import java.util.List;

public class TemplateTest {
    private int a;
    private static final String ID = "UAOFSKX";

   public void test(){
       System.out.println("TemplateTest.test");
   }

    public static void main(String[] args) {
        int a = 3;
        System.out.println(a);
        System.out.println("a = " + a);
        System.out.println("TemplateTest.main");
        System.err.println();

        String str[] = new String[]{"aa","bb","cc","dddddddddddd"};
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }

        for (String s : str) {
            System.out.println(s);
        }

        for (int i = 0; i < str.length; i++) {
            String s = str[i];
            System.out.println(s);
        }


       List<String> list = new ArrayList<>();
       list.add("yiyi");list.add("erer");list.add(null);list.add("sansan");
        for (String s : list) {
            if (s == null) {
                break;
            }
            System.out.println(s);

        }  
    }
}
