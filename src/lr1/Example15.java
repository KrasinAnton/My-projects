package lr1;

import java.util.Scanner;

public class Example15 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int firstNumber; int secondNumber;
        int sum; int sum2;

        System.out.println("������� ������ �����: ");
        firstNumber = in.nextInt();
        System.out.println("������� ������ �����: ");
        secondNumber = in.nextInt();

        sum = firstNumber + secondNumber;
        sum2 = firstNumber - secondNumber;

        System.out.println("����� ���� �����: "  +sum);
        System.out.println("�������� ���� �����: " +sum2);
        in.close();
    }

}
/*�������� ���������, � ������� ������������ ������ ��� �����,
� ���������� ����������� � ������������ ����� � �������� ���� �����.*/