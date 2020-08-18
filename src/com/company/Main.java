package com.company;

import java.util.concurrent.SynchronousQueue;
// public protected deafault private
public class Main {
    public static int a = 30;//[30] статик переменная создается в 1 екземпляре. если гдето поменять изменится везде
    public int age = 20; //[][][][][] нон статик создается ячейка для каждого обьекта

    public static void main(String[] args) {
        byte b = 127; // ot -128 do 127 1 byte = 8bit\ 2*8 = 256 zna4eniy klass obertka = Byte
        short s = 32000; // 2 bute 16 bit 2*16 stepeni klass obertka = Short
        char c = '%'; // 2 byte 16 bit klass obertka = Charakter
        int  i = 21545; // 4 byte 32 bit 2*32 stepeni klass obertka = Integer
        boolean bool = false; // libo true/false 4 byte 32 bit 2*32 stepeni = Boolean
        float fl = 12.4f; // nado zakastit'bukvoy 'f' 4 byte 32bit = Float
        long l = 1222555222l;// nado zakastit bukvoy 'L' 8byte 32 bit 2*64 stepeni = Long
        double d = 12.3; // 8 byte = Double

        String str = "50";
        Integer num = new Integer (435);
        System.out.println("Hello World!");
        int nm = Integer.parseInt(str);
        System.out.println( nm*2);
        System.out.println("Sum = "+ (nm+2)+ ", "+ str);
        System.out.format("Sum = %d, %s, %f", nm+2, str, fl); // %d - eto 4islo, %s - eto stroka, %f -eto float
        System.out.println();




        System.out.println((25+23));
        System.out.println(sum(20,30));
        System.out.println(sum(50,320));
        System.out.println("________________________");

        Main m1 = new Main();
        Main m2 = new Main();
        System.out.println(m1.age);//20
        System.out.println(m2.age);//20
        System.out.println(m1.a);//30
        System.out.println(m2.a);//30
        m1.age = 50;
        m1.a = 70;
        System.out.println(m1.age);//50
        System.out.println(m2.age);//20
        System.out.println(m1.a);//70
        System.out.println(m2.a);//70
        System.out.println("__________________________");



    }

    public static int sum(int number1, int number2){
        return number1 + number2;


    }}
