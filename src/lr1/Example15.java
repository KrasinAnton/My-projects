package lr1;

import java.util.Scanner;

public class Example15 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int firstNumber; int secondNumber;
        int sum; int sum2;

        System.out.println("Введите первое число: ");
        firstNumber = in.nextInt();
        System.out.println("Введите второе число: ");
        secondNumber = in.nextInt();

        sum = firstNumber + secondNumber;
        sum2 = firstNumber - secondNumber;

        System.out.println("Сумма этих чисел: "  +sum);
        System.out.println("Разность этих чисел: " +sum2);
        in.close();
    }

}
/*Напишите программу, в которой Пользователь вводит два числа,
а программой вычисляется и отображается сумма и разность этих чисел.*/