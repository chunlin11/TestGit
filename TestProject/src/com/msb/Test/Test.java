package com.msb.Test;

public class Test {
    public static void main(String[] args) {
        Person zs = new Person();
        zs.age = 10;
        zs.name = "zhangsan";

        System.out.println(zs.name);
        zs.eat();
    }
}
