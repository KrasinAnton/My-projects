package lr9;

public class Example14 {
    public static void m(int x) throws ArithmeticException{ //��-�� ���������� ������ ���������� ����� �����������
        int h=10/x; //��� ������� h - ������� �� 0
    }
    public static void main(String[] args) { //�������� main args - �������� �� ���������
        try {
            int l = args.length; //int l ������������� �������� ��������� main args = 0
            System.out.println("������ �������= " + l); //�������� "������ ������� = 0"
            m(l); //� ����� ������� �������� l = "0"
        } catch (ArithmeticException e) {
            System.out.println("������: ������� �� ����"); //���������� ����������� � ����������, �������� "������: ������� �� ����"
        }
    }
}
