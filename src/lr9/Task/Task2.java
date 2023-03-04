package lr9.Task;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("������� ���������� ����� �������: ");
            int rows = scanner.nextInt();
            System.out.print("������� ���������� �������� �������: ");
            int cols = scanner.nextInt();

            int[][] matrix = new int[rows][cols];

            System.out.println("������� �������� �������:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    matrix[i][j] = scanner.nextInt();
                }
            }
            System.out.print("������� ����� ������� ��� ������: ");
            int column = scanner.nextInt();

            if (column < 0 || column >= cols) {
                throw new IllegalArgumentException("������� � ������� " + column + " �� ����������");
            }
            System.out.println("������� " + column + ":");
            for (int i = 0; i < rows; i++) {
                System.out.println(matrix[i][column]);
            }
        } catch (InputMismatchException e) {
            System.out.println("������: ��������� ������ �� �������� ������");
        } catch (NumberFormatException e) {
            System.out.println("������: ��������� ������ �� �������� ������");
        } catch (IllegalArgumentException e) {
            System.out.println("������: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("������: " + e.getMessage());
        }
    }
}
/*� ���������, ��� ��������� �� ������� ������� ������� � �������, �������� � ����������, ����� ��������� ������ � ��������� �������:
�	���� ������ ������ �����;
�	��� ������� � ����� �������.
*/