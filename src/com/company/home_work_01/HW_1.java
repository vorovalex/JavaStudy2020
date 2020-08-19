package com.company.home_work_01;
/*
1) Создать три переменных (number1, number2, number3) типа int, присвоить им значение 10, 18, 21 соответственно.
2) Не используя чисел, сделать так, чтобы значение у переменной number1 изменилось на 18
2) Не используя чисел, сделать так, чтобы значение у переменной number2 изменилось на 21
2) Не используя чисел, сделать так, чтобы значение у переменной number3 изменилось на 10
3) Вывести значение каждой переменной в консоль, каждое значение выводить с новой строки.
*/

/*
1) Создать по одной переменной каждого типа данных, который ты знаешь.
2) Присвоить каждой переменной значение в диапазоне типа.
3) Вывести значение каждой переменной в консоль, каждое значение выводить с новой строки.
*/

public class HW_1 {
    public static void main(String [] args){

        int number1 = 10;
        int number2 = 18;
        int number3 = 21;
        int number = number1;
        number1 = number2;
        number2 = number3;
        number3 = number;
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);

        byte b = 127;
        System.out.println(b);
        short s = 12345;
        System.out.println(s);
        char c ='Y';
        System.out.println(c);
        int i = 1321546;
        System.out.println(i);
        boolean bool = true;//false
        System.out.println( bool );
        float f = 12.5F;
        System.out.println(f);
        double d = 12.5;
        System.out.println(d);
        long l = 1321546465465L;
        System.out.println(l);



    }
}
