package lr11.Task2;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int decimal = scanner.nextInt();
        String binary = decimalToBinary(decimal);
        System.out.println(decimal + " в двоичной системе: " + binary);
    }

    public static String decimalToBinary(int decimal) {
        if (decimal == 0) {
            return "0";
        } else if (decimal == 1) {
            return "1";
        } else {
            int quotient = decimal / 2;
            int remainder = decimal % 2;
            return decimalToBinary(quotient) + Integer.toString(remainder);
        }
    }
}
