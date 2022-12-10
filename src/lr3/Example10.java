package lr3;

import java.util.Random;
import java.util.Scanner;

public class Example10 {

    public static void main(String[] args) {
        Scanner id = new Scanner(System.in); // Создание объекта класса Scanner для считывания числа введённого к консоль
        System.out.println("Введите размер массива");
        int Size = id.nextInt(); // Запись в переменную Size (нужная для того чтобы задать размер массива)
        System.out.println("Размер массива равен "+ Size);
        int[] num = new int[Size]; // Создание массива с размером введённым из консоли
        Random random = new Random(); // Создание объекта класса Random для генерации "случайного" числа
        for (int i = 0 ; i < num.length ; i++ ){
            num[i] = random.nextInt(200); // Присвоение i-тому элементу массива случайного значения
            System.out.println("Элемент массива ["+i+"] = " + num[i]);
        }
        for(int i = num.length ; i >= 0 ; i--) {
            for (int j = 0; j < i; j++) {
                if (num[j] < num[j + 1]) {
                    int tmp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = tmp; // Сортировка массива по убыванию его элементов
                }
            }
        }
        System.out.println("Произведена сортировка массива");
        for (int i = 0 ; i < num.length ; i++ ){
            System.out.println("Элемент массива ["+i+"] после сортировки =" + num[i]);
        }
    }
}
/*Напишите программу, в которой создается целочисленный
массив, заполняется случайными числами и после этого значения элементов в
массиве сортируются в порядке убывания значений.*/