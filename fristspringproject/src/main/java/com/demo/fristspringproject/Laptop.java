package com.demo.fristspringproject;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer{
  public void compile(){
      System.out.println("compile code in laptop");
  }
}
