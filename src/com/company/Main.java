package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        System.out.println("Введите операцию");
        System.out.println("1. Сложение");
        System.out.println("2. Вычитание");
        System.out.println("3. Умножение");
        System.out.println("4. Деление/Деление");
        Scanner scanner = new Scanner(System.in);
        int operation = scanner.nextInt();
        System.out.println("Введите первое число");
        int a = scanner.nextInt();
        System.out.println("Введите второе число");
        int b = scanner.nextInt();
        int result;
        if(operation ==1)
        {result = a + b;}
        else if (operation ==2)
        {result = a - b;}
        else  (operation == 3)
        {result = a * b;}
        else (operation == 4)
        {result = a / b;}
        System.out.println("Результат = " + result);
//    System.out.println("Введите число");
//        Scanner scanner = new Scanner(System.in); //читает из консоли введеное число
//        int a = Scanner.nextInt(); // переменная (контейнер хранение данных) пишем туда значение полченные из сканера
//        System.out.println("a = " +a); //выводим значение переменной на экрон
    }
}
