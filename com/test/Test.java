package com.test;

import com.dao.Student;

public class Test {
    public static void main(String[] args) {
        System.out.println("info: ");
        for(String str : Student.GetAll()) {
            System.out.println(str);
        }
    }
}
