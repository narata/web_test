package com.common;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List list1 = new ArrayList();
        list1.add(1);
        list1.add("bbb");
        Object a = list1.get(1);
        System.out.println(a.toString());
    }


}
