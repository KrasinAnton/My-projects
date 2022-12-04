package lr2;

import java.util.Scanner;

public class Example2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите любое целое число");
        int x = in.nextInt();

        int result = x % 5;
        int result1 = x % 7;

        System.out.println("result = " +result);
        if (result == 2)  {
            System.out.println("Введеное число делится на 5 с остатком 2");
        }
        else {
            System.out.println("Введеное число не делится на 5 с остатком 2");

        }
        System.out.println("result = " +result1);
        if (result1 == 1) {
            System.out.println("Введеное число делится на 7 с остатком 1");
        }
        else {
            System.out.println("Введеное число не делится на 7 с остатком 1");
        }
        in.close();
        }

        }

/*Напишите программу, которая проверяет, удовлетворяет ли введенное
пользователем число следующим критериям: при делении на 5 в остатке
получается 2, а при делении на 7 в остатке получается 1.*/