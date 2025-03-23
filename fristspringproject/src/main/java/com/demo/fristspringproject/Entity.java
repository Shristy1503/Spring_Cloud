package com.demo.fristspringproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Entity {

    private int age;
    private Computer com;

    public Entity(){
        System.out.println("Entity object...");
    }
    public Computer getCom() {
        return com;
    }



    public void setCom(Computer com) {
        this.com = com;
    }



    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        System.out.println("Age Assigned");
        this.age = age;
    }

    public void code()
    {
        System.out.println("Im Coding..");
        com.compile();
    }
}
