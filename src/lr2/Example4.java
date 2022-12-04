package lr2;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите любое целое число: ");
        int x = in.nextInt();

        if  (x >= 5 && x <= 10){
            System.out.println("Введеное число в диапазоне от 5 до 10");
        }
        else {
            System.out.println("Введеное число не в диапазоне от 5 до 10");
        }
        in.close();

    }
}
/*Напишите программу, которая проверяет, попадает ли введеное
пользователем число в диапазон от 5 до 10 включительно*/