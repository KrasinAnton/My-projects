package lr9;

public class Example2 {
    public static void main(String[] args) {
        try {
            System.out.println("0"); // �������� "0"
            throw new RuntimeException("������������� ������");
            //System.out.println("1"); // ��� ����� ���� �� �����������
        }
        catch (Exception e) {
            System.out.println("2 "+ e ); // ���������� ����������� ����������, �������� "1" � ����������
        }
        System.out.println("3"); // �������� "3"
    }
}
