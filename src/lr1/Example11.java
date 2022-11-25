package lr1;

import java.util.Calendar;
import java.util.Scanner;

public class Example11 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите имя: ");
        String name = in.nextLine();

        System.out.println("Введите Ваш год рождения: ");
        int yearOfBirth = in.nextInt();

        int year = Calendar.getInstance().get(Calendar.YEAR)- yearOfBirth;
        System.out.print(name+" "+ year + " лет");

        in.close();
    }
}
/*Напишите программу, в которой Пользователь вводит имя и год рождения,
а программа отображает сообщение содержащее имя пользователя и его возраст.*/