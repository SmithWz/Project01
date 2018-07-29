package com.atguigu.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class HellowWorld {
    List list = new ArrayList();
    public static void main(String args[]){
        System.out.println("Hello 霍总");
        System.out.println();
        try {
            FileInputStream fis = new FileInputStream("haha");
            System.out.println(fis);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("args = " + args);
    }

    /*
    * 虎牙
    * 斗鱼
    * 全民
    * 熊猫
    *
    * */
public List getList() {
        return list;
        }

public void setList(List list) {
        this.list = list;
        }
        }
