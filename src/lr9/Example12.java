package lr9;

public class Example12 {
    public static void m(String str, double chislo) {
        if (str == null) {
            throw new IllegalArgumentException("������ ������� �������");//�.�. str == null ���������� ������� �� ����� �����������, �.�. ��� ���������������� catch, ����� �������� ������
        }
        if (chislo > 0.001) { //��� ����� ���� �� ��������, �.�. ���� ������ IllegalArgumentException
            throw new IllegalArgumentException("�������� �����");
        }
    }

    public static void main(String[] args) {
        try {
            m(null, 0.000001); //� ����� ���������� ��������� String "null" & double "0.000001"
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}