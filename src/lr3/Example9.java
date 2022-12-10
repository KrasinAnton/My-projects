package lr3;

import java.util.Random;
import java.util.Scanner;
public class Example9 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int Size = id.nextInt();
        System.out.println("Размер массива равен " + Size);
        int[] num = new int[Size];
        Random random = new Random();
        for (int i = 0; i < num.length; i++) {
            num[i] = random.nextInt(200); // Присвоение i-тому элементу массива случайного значения
            System.out.println("Элемент массива [" + i + "] = " + num[i]);
        }
        System.out.println("Конец массива num[i]\n");
        int[] min_count = new int[Size]; // создание массива для отслеживания индекса
        int[] min_num = new int[Size]; // создание массива для отслеживания повторяющегося минимального значения
        int min = num[0]; // создание переменной с минимальным значением
        for (int l = 0; l < 2; l++) { // расчет минимальных значений
            for (int j = 0; j < num.length; j++) {
                if (min >= num[j]) {
                    min_count[j] = j;
                    min = num[j];
                    min_num[j] = num[j];
                } else {
                    min_count[j] = 0;
                    min_num[j] = 0;
                }
            }
        }
        for (int k = 0; k < num.length; k++) { // Вывод итогового сообщения
            if (min_num[k] == min && min_count[k] != 0) {
                System.out.println("Элемент массива [" + min_count[k] + "]" + min_num[k] + "- минимальное значение");
            }
        }
    }
}
/*Напишите программу, в которой создается массив и заполняется
случайными числами. Массив отображается в консольном окне. В этом
массиве необходимо определить элемент с минимальным значением. В
частности, программа должна вывести значение элемента с минимальным
значением и индекс этого элемента. Если элементов с минимальным
значением несколько, должны быть выведены индексы всех этих элементов.*/