package lr11.Task3;

import java.util.Scanner;

public class RecursiveArrayInputOutput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод размерности массива
        System.out.print("Введите размерность массива: ");
        int size = scanner.nextInt();

        // Создание массива
        int[] arr = new int[size];

        // Ввод элементов массива
        System.out.println("Введите элементы массива:");
        inputArray(arr, 0, size, scanner);

        // Вывод элементов массива
        System.out.println("Элементы массива:");
        outputArray(arr, 0, size);
    }

    // Рекурсивный метод для ввода элементов массива
    public static void inputArray(int[] arr, int index, int size, Scanner scanner) {
        if (index < size) {
            arr[index] = scanner.nextInt();
            inputArray(arr, index + 1, size, scanner);
        }
    }

    // Рекурсивный метод для вывода элементов массива
    public static void outputArray(int[] arr, int index, int size) {
        if (index < size) {
            System.out.print(arr[index] + " ");
            outputArray(arr, index + 1, size);
        }
    }
}
