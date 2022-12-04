package lr2;

import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число: ");
        int x = in.nextInt();

        if (x / 1000 != 0){
            x = x / 1000;
            System.out.println("Количество тысяч в числе: " + x);
        } else {
            System.out.println("В числе нет тысяч" );
            in.close();
        }
    }
}
/*Напишите программу, которая проверяет, сколько тысяч во введенном
пользователем числе (определяется четвертая цифра справа в десятичном
представлении числа)*/