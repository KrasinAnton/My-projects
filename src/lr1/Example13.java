package lr1;

import java.util.Scanner;

public class Example13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int firstNumber; int secondNumber ;
        int sum;
        System.out.println("Введите первое число: ");
        firstNumber = in.nextInt();
        System.out.println("Введите второе число: ");
        secondNumber = in.nextInt();

        sum = firstNumber + secondNumber;

        System.out.println("Сумма двух чисел равна: " +sum);
        in.close();
    }

}
/*Напишите программу для вычисления суммы двух чисел.
Оба числа вводятся пользователем. Для вычисления суммы используйте оператор +.*/