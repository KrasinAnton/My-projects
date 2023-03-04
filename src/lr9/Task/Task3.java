package lr9.Task;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte[] arr = null;
        int sum = 0;
        try {
            System.out.print("������� ������ �������: ");
            int size = scanner.nextInt();
            arr = new byte[size];
            for (int i = 0; i < size; i++) {
                System.out.print("������� ������� " + (i + 1) + ": ");
                arr[i] = scanner.nextByte();
                sum += arr[i];
            }
        } catch (NumberFormatException e) {
            System.out.println("������: ��������� ������ �� ����� ���� ������������� � ����� ���� byte");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("������: ����� �� ������� �������");
        } catch (ArithmeticException e) {
            System.out.println("������: ������� ������� �� ����");
        }
        if (arr != null) {
            System.out.println("����� ��������� �������: " + sum);
        }
    }
}
/*� ���������, ����������� ����� ��������� ���� byte ����������� �������, ��������� � ����������, ����� ��������� ������ � ��������� �������:
�	���� ������ ������ �����;
�	���� ��� ���������� �������� �� ��������� ��������� ����.
*/