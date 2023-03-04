package lr9.Task;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte[] arr = null;
        int sum = 0;
        try {
            System.out.print("¬ведите размер массива: ");
            int size = scanner.nextInt();
            arr = new byte[size];
            for (int i = 0; i < size; i++) {
                System.out.print("¬ведите элемент " + (i + 1) + ": ");
                arr[i] = scanner.nextByte();
                sum += arr[i];
            }
        } catch (NumberFormatException e) {
            System.out.println("ќшибка: введенна€ строка не может быть преобразована в число типа byte");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ќшибка: выход за пределы массива");
        } catch (ArithmeticException e) {
            System.out.println("ќшибка: попытка делени€ на ноль");
        }
        if (arr != null) {
            System.out.println("—умма элементов массива: " + sum);
        }
    }
}
/*¬ программе, вычисл€ющей сумму элементов типа byte одномерного массива, вводимого с клавиатуры, могут возникать ошибки в следующих случа€х:
Ц	ввод строки вместо числа;
Ц	ввод или вычисление значени€ за границами диапазона типа.
*/