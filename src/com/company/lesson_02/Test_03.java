package com.company.lesson_02;
//Метод - совокупность кодя предназначенная для выполнения определенной операции
//Методы созданы для того чтобы минимизировать повторяющийся код
//Минимизировать повторяющийся код
//Улучшить читабельность кода
//Разбить монолит
public class Test_03 {
    public static void main (String[] args){

        System.out.println("text1");
//Можно создавать переменную для метода сам в мейне
        int res = sum(15, 25);
        System.out.println(res);

        int res1 = sum(67, 28);
        System.out.println(res1);
 //можно вывести сам метод через принтлн
        System.out.println(sum(237, 125));

        String res2 = convert("Tutor");

        System.out.println(convert("Happy"));
        System.out.println(res2);

        printTwoTimes("Hello!");
    }

    public static int sum(int number1, int number2){
        int res = number1 + number2;
        return res;

    }
    private static String convert(String str){
        String res = str + " end";
        return res;
    }
    protected static void printTwoTimes(String str){
        System.out.println(str);
        System.out.println(str);
    }

}
