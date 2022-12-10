package lr3;

import java.util.Scanner;

public class Example6 {

    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Введите размер массива");
        if (id.hasNextInt()) {
            int Size = id.nextInt();
            if (Size > 0) {
                System.out.println("Размер массива равен "+ Size);
                int[] num = new int[Size];
                int x = 0;
                int i = 0;
                while (x<Size) {
                    i++;
                    if (i%5 == 2) {
                        num[x] = i;
                        System.out.println("Элемент массива ["+x+"] = " + num[x]);
                        x++;
                    }
                }
                System.out.println("конец массива");
            }
            else {
                System.out.println("некорректное значенние");
            }
        }
        else {
            System.out.println("некорректное значенние");
        }
    }
}
/*Напишите программу, в которой создается одномерный числовой
массив и заполняется числами, которые при делении на 5 дают в остатке 2
(числа 2, 7,12,17 и так далее). Размер массива вводится пользователем.
Предусмотреть обработку ошибки, связанной с вводом некорректного
значения.*/