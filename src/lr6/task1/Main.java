package lr6.task1;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Task1 myex = new Task1();
        myex.SetField('A');
        myex.SetField("B");
        char[] CharArray1 = {'�','�','�','�','�','�'};
        char[] CharArray2 = {'C'};
        myex.SetField(CharArray1);
        myex.SetField(CharArray2);

    }
}
class Task1 {
        //���� ��� ����: ���������� � ���������.
        private char ch;
        private String str;
        //���� ����� ���������� � ���������� ����������, �� ��������������� �������� ������������� ����������� ����.

        public void SetField(char c) {
            ch = c;
            System.out.print("\n ����� ������ SetField c ���������� char. ch ="+ch);
        }
        //���� ����� ���������� � ��������� ����������, �� �� ���������� �������� ���������� ����.

        public void SetField(String s) {
            str = s;
            System.out.print("\n ����� ������ SetField c ���������� string. str ="+str);
        }
        //���� ������ ������� �� ������ ��������, �� �� ���������� �������� ����������� ����.
        public void SetField(char [] CharArray) {
            if (CharArray.length == 1){
                ch = CharArray[0];
                System.out.print("\n ����� ������ SetField c �������� char. ch ="+ch);
            }
            else{
                //���� � ������� ������ ������ ��������) �� �������� ������� ����������� ��������� ������ � ������������� ��������� ���������� ����.
                str=new String(CharArray);
                System.out.print("\n ����� ������ SetField c �������� string. str ="+str);}
        }
}
/*�������� ��������� � �������, � ������� ���� ��� ����: ���������� � ���������.
� ������ ������ ���� ������������� ����� ��� ������������ �������� �����. ���� �����
���������� � ���������� ����������, �� ��������������� �������� �������������
����������� ����. ���� ����� ���������� � ��������� ����������, �� �� ����������
�������� ���������� ����. ������ ���������� ����� ����� ������������ ����������
������. ���� ������ ������� �� ������ ��������, �� �� ���������� �������� �����������
����. � ��������� ������ (���� � ������� ������ ������ ��������) �� �������� �������
����������� ��������� ������ � ������������� ��������� ���������� ����.*/