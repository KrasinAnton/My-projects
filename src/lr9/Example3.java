package lr9;

public class Example3 {
    public static void main(String[] args) {
        try {
            System.out.println("0"); // �������� "0"
            throw new RuntimeException("������");
        }
        catch (NullPointerException e) {
            System.out.println("1 "+e ); //��� ����� ���� ������������
        }
        catch (RuntimeException e) {
            System.out.println("2 "+e);  // ���������� ����������� ����������, �������� "2" � ����������
        }
        catch (Exception e) {
            System.out.println("3 "+e ); //��� ����� ���� ������������, ���������� ��� ����������
        }
        System.out.println("4"); // �������� "4"
    }
}
