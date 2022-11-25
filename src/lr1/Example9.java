package lr1;

import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите номер месяца: ");
        int month = in.nextInt();

        if (month == 1) System.out.println("Январь содержит 30 дней");
        else if (month == 2) System.out.println("Февраль содержит 28 дней");
        else if (month == 3) System.out.println("Март содержит 31 день");
        else if (month == 4) System.out.println("Апрель содержит 30 дней");
        else if (month == 5) System.out.println("Май содержит 31 день");
        else if (month == 6) System.out.println("Июнь содержит 30 дней");
        else if (month == 7) System.out.println("Июль содержит 31 день");
        else if (month == 8) System.out.println("Август содержит 31 день");
        else if (month == 9) System.out.println("Сентябрь содержит 30 дней");
        else if (month == 10) System.out.println("Октябрь содержит 31 день");
        else if (month == 11) System.out.println("Ноябрь содержит 30 дней");
        else if (month == 12) System.out.println("Декабрь содержит 31 день");
        else System.out.println("Неверный номер месяца");
        in.close();

    }
}
/*Напишите программу, в которой пользователю предлагается ввести название месяца и количество дней в этом месяце.
 Программа выводит сообщение о том, что соответствующий месяц содержит указанное количество дней.*/