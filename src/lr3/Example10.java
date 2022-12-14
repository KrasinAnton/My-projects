package lr3;

import java.util.Random;
import java.util.Scanner;
public class Example10 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int Size = id.nextInt();
        System.out.println("Размер массива равен "+ Size);
        int[] num = new int[Size];
        Random random = new Random();
        for (int i = 0 ; i < num.length ; i++ ){
            num[i] = random.nextInt(200);
            System.out.println("Элемент массива ["+i+"] = " + num[i]);
        }
        for(int i = num.length ; i >= 0 ; i--) {
            for (int j = 0; j < i; j++) {
                if (num[j] < num[j + 1]) {
                    int tmp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = tmp;
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