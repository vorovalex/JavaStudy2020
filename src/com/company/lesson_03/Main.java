package com.company.lesson_03;

public class Main {
    public static void main(String[] args){
        User user = new User();
        user.age = 35;
        user.name = "Den";
        user.passportData = "passport";
        System.out.println(user.name);
        user.talk("i'm happy!!!");

        User user1 = new User();
        user1.age = 43;
        user1.name = "Denim";
        user1.passportData = "passport01";
        System.out.println(user1.age);
        user1.talk("i'm sad!!!");

    }
}
