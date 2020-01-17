package ru.popovich.chapter01.task01;

import java.util.Scanner;

import static java.lang.Math.*;

public class Main {

    public static void main(String[] args) {

        // Определение переменных: начальной и результата
        double r, y;

        // Описание программы
        System.out.println("!!!ПРОГРАММА ПОДСЧЕТА ПЛОЩАДИ ОКРУЖНОСТИ!!!");

        // Ввод данных пользователя с командной строки
        Scanner scanner = new Scanner(System.in);

        // Приглашение к вводу данных
        System.out.println("Введите значение радиуса (мм): r = ");

        // инициализация ввода
        r = scanner.nextDouble();

        // вычисление результата
        y = squareForCircle(r);

        // Вывод результата
        System.out.println("Площадь окружности: " + y + " мм в кв.");

    }

    // Метод (функция) подсчета площади окружности
    public static double squareForCircle(double r){

        double result = 2 * PI * r * r;

        return result;
    }
}
