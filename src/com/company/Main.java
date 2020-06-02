package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
    System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in); //читает из консоли введеное число
        int a = Scanner.nextInt(); // переменная (контейнер хранение данных) пишем туда значение полченные из сканера
        System.out.println("a = " +a); //выводим значение переменной на экрон
    }
}
