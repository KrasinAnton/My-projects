package lr1;

import java.util.Calendar;
import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите Ваш возраст: ");
        int age = in.nextInt();

        int year = Calendar.getInstance().get(Calendar.YEAR)- age;
        System.out.print("Ваш год рождения: " +year);

        in.close();
    }

}
/*Напишите программу, в которой по возрасту определяется год рождения.*/