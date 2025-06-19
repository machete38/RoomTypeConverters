package com.machete3845.roomtypeconverters.reflection;

import java.lang.reflect.Constructor;

public class ReflectionExample {
    public static void main(String[] args) {
        try{
            Class<?> clazz1 = Class.forName("java.util.ArrayList");
            Constructor<?> constructor = clazz1.getConstructor();
            Object instance = constructor.newInstance();
            System.out.println("created instance: "+ instance);
        } catch (Exception e) {
           e.printStackTrace();
        }
    }
}
