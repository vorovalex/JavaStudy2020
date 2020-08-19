package com.company.home_work_02;
/*
1) Создать метод sum, который должен суммировать 2 числа.
1) Создать метод multy, который должен умножить 2 числа.
1) Создать метод subt, который должен вычесть второе число из первого.
1) Создать метод div, который должен делить 2 числа.
*/

/*
1) Создать метод convert, который должен конвертировать евро в доллары. В метод должен приходить один аргумент (к-во евро). Метод должен возвращать к-во долларов.
2) Создать метод percent, который принимает один аргумент (число) и возвращает это же число + 10% от него.
3) Создать метод print, который принимает один аргумент (строку) и выводит эту строку 4 раза в консоль.
*/
public class HW_02 {
    public static void main(String[] args){
        int finalSum = sum(25, 35);
        System.out.println(finalSum);

        int finalMulty = multy(25, 10);
        System.out.println(finalMulty);

        int finalSubt = subt(25, 10);
        System.out.println(finalSubt);

        double finalDiv = div(25, 13);
        System.out.println(finalDiv);

        double finalConvert = convert(30);
        System.out.println(finalConvert);

        double finalPercent = percent(100);
        System.out.println(finalPercent);

        print("Ho, ho, ho");




    }
    public static int sum (int number1, int number2){

        return number1 + number2;
    }
    public static int multy(int number1, int number2){
        int res = number1 * number2;
        return res;
    }
    public static int subt(int number1, int number2){
        int res = number1 - number2;
        return res;
    }
    public static double div(double number1, double number2){
        double res = number1 / number2;
        return res;
    }
    public static double convert( double euro){
        double dollar = euro * 1.15;
        return dollar;
    }
    public static double percent( double number) {
        double res = number + number / 10;
        return res;
    }
    public static void print (String str){
        System.out.println(str);
        System.out.println(str);
        System.out.println(str);
        System.out.println(str);

    }
}
