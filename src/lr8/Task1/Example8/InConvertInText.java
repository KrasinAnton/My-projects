package lr8.Task1.Example8;

import java.io.*;
import java.net.URL;

public class InConvertInText {
    public static void readAllByByte(Reader in) throws IOException {
        while (true) {
            int oneByte = in.read(); // ������ 1 ����
            if (oneByte != -1) { // ������� ����� �����
                System.out.print((char) oneByte);
            } else {
                System.out.print("\n" + " ����� ");
                break;
            }
        }
    }

    public static void main(String[] args) {
        try {
            // � ������� ������ ����
            InputStream inFile = new FileInputStream("src\\lr8\\Task1\\Example8\\MyFile1.txt");// �������� �����
            Reader rFile= new InputStreamReader(inFile,"cp1251");// ���������� �����
            readAllByByte(rFile);
            System.out.print("\n\n\n");
            inFile.close();
            rFile.close();
            // � ������� ������� ��������-��������
            InputStream inUrl = new URL("http://google.com").openStream(); // �������� �����
            Reader rUrl=new InputStreamReader(inUrl, "cp1251");// ���������� �����
            readAllByByte(rUrl);
            System.out.print("\n\n\n"); inUrl.close();
            rUrl.close();
            // � ������� ������ ������ ���� byte
            InputStream inArray = new ByteArrayInputStream( new byte[] {5, 8, 3, 9, 11});
            Reader rArray=new InputStreamReader(inArray,"cp1251" ); // ���������� �����
            readAllByByte(rArray);
            System.out.print("\n\n\n");
            inArray.close();
            rArray.close();
        }
        catch (Exception e) {
            System.out.println("������: "+ e);
        }
    }
}
/*��������� � ������� �� ����� ���������� �� ���� ����������: �����
�� �����, ��������-�������� � ������� ������ ���� byte. ������� ���������,
�������������� ���������. (�������� � ������� ���������, ����������� �
������� 2.)
*/