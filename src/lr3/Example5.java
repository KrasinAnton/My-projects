package lr3;

import java.util.Random;
import java.util.Scanner;

public class Example5 {

    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Ввведите количество чисел в сумме");
        int x = id.nextInt();

        CalcNum.WhileCalcNum(x);
        CalcNum.ForCalcNum(x);
    }

    private static class CalcNum {
        private static void WhileCalcNum(int x) {
            System.out.println("\n\nверсия программы на основе оператора \"while\"");
            int sum = 0;
            Random random = new Random();
            int x1 = x;
            while (x1 > 0) {
                int num = random.nextInt(1000);
                if (num % 5 == 2 || num % 3 == 1) {
                    System.out.printf("%d, ", num);
                    sum = sum + num;
                    x1--;
                }
            }
            System.out.printf("сумма чисел: %d", sum);
        }

        private static void ForCalcNum(int x) {
            System.out.println("\n\nверсия программы на основе оператора \"for\"");
            int sum = 0;
            for (int i = 0; x > 0; i++) {
                if (i % 5 == 2 || i % 3 == 1) {
                    System.out.printf("%d, ", i);
                    sum = sum + i;
                    x--;
                }
            }
            System.out.printf("сумма чисел: %d", sum);
        }
    }
}
/*Напишите программу, в которой вычисляется сумма чисел,
удовлетворяющих таким критериям: при делении числа на 5 в остатке получается 2,
или при делении на 3 в остатке получается 1. Количество чисел в сумме
вводится пользователем. Программа отображает числа, которые
суммируются, и значение суммы. Предложите версии программы,
использующие разные операторы цикла.
*/