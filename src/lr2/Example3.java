package lr2;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {

        System.out.println("Введите число: ");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();

        if (x % 4==0 && x > 10) {
            System.out.printf("Число  %d делится на 4, число больше 10\n", x);
        }
        else {
            System.out.printf("Число  %d не удовлетворяет одному из условий: число делится на 4, число больше 10\n", x);
        }
        in.close();
        }



    }

/*Напишите программу, которая проверяет, удовлетворяет ли введенное
пользователем число следующим критериям: число делится на 4, и при
этом оно не меньше 10.*/