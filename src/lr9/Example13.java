package lr9;

public class Example13 {
    public static void main(String[] args) { //�������� main args - �������� �� ���������
        try {
            int l = args.length; //int l ������������� �������� ��������� main args = 0
            System.out.println("������ �������= " + l); //�������� "������ ������� = 0"

            int h=10/l; //��� ������� h - ������� �� 0
            args[l + 1] = "10"; //��� ������ ��������� ��-�� ������
        } catch (ArithmeticException e) {//���������� ����������� � ����������, �������� "������� �� ����"
            System.out.println("������� �� ����");
        } catch (ArrayIndexOutOfBoundsException e) { // ��� ����� ���� ���������
            System.out.println("������ �� ����������");
        }
    }
}
