package lr1;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input week: ");
        String  week = in.nextLine();

        System.out.println("Input month: ");
        String month = in.nextLine();

        System.out.println("Input date: ");
        int date = in.nextInt();

        System.out.printf("week: %s date: %s moth: %s", week, date, month);
        in.close();

    }
}
/*Напишите программу, в которой Пользователь последовательно вводит название текущего дня недели,
название месяца и дату (номер дня в месяце).
Программа выводит сообщение о сегодняшней дате (день недели, дата, месяц).*/