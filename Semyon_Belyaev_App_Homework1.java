package homework1;

import javax.swing.*;
import java.util.Scanner;

public class Semyon_Belyaev_App_Homework1  {

    public static void main(String[] args) // задание 1
    {
        int a = 2;//задание 2
        short b = 1;//задание 2
        byte c = 10;//задание 2
        long i = 5000L;//задание 2
        int d = 5;//задание 2
        float g = 1.5f;//задание 2
        double r = 1234;//задание 2
        char u ='H';//задание 2
        int h = a * (b + (c / d));
        int p = calculate(2, 1, 10, 5);// задание 3
        boolean v = addition(8, 6);// задание 4
        int o = 8;//задание 4
        int m = 6;//задание 4
        int k = read (15);// задание 5
        boolean z = getNumber(8);// задание 6
        printHello("Vanya");// задание 7


        if (k >= 0) // задание 5
        {
            System.out.println(k + " is positive");
        } else {
            System.out.println(k + " is negative");
        }


        System.out.println(h);
        System.out.println(p);//задание 3
        System.out.println(v);//задание 4
        System.out.println(z);//задание 6

        System.out.print("Enter year");// задание 8
        Scanner input = new Scanner(System.in);
        short year = input.nextShort();
        determineLeapYear(year);
    }
    static int calculate(int a, int b, int c, int d) //3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,где a, b, c, d – входные параметры этого метода;
    {
        return a * (b + (c / d));
    }

    static boolean addition(int o, int m) // 4. Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;
    {
        if (o + m >= 10 && o + m <= 20) {
            return true;
        } else {
            return false;
        }
    }
    static int read(int k) // 5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль положительное ли число передали, или отрицательное; Замечание: ноль считаем положительным числом
    {
        return k = 15;
    }
    static boolean getNumber(int z) //6. Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true, если число отрицательное;
    {
        if (z < 0){
            return true;
        } else {
            return false;
        }
    }
    static void printHello(String name) //7. Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
    {
        System.out.println("Hello," + name + "!");
    }
    static void determineLeapYear(short year)
    {
    if ((year % 4 == 0) && ((year % 100 != 0) && (year % 400 == 0)))
    {
        System.out.println(year + " year is leap year");
    }else
        {
            System.out.println(year + " year is not leap year");
    }
    }
}