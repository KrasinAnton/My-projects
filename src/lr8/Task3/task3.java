package lr8.Task3;

import java.io.*;

public class task3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        PrintWriter out = null;
        try {
            br = new BufferedReader(new InputStreamReader(new FileInputStream("src\\lr8\\Task3\\MyFile1.txt")));
            out = new PrintWriter("src\\lr8\\Task3\\MyFile2.txt");
            int lineCount = 0;
            String s;
            while ((s = br.readLine()) != null) {
                lineCount++;
                String[] arr = s.split(" ");
                int rowCount = 0;
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i].matches("(?ui:[^���������]).*")) {
                        out.print(arr[i] + " ");
                        rowCount++;
                    }
                }
                out.println("\n ����������� ���� � ������ " + lineCount + ": " + rowCount);
            }
        } catch (IOException e) {
            System.out.println("������ !!!!!!!!");
        } finally {
            br.close();
            out.flush();
            out.close();
        }
    }
}
/*������� ������, ����������� �� ������ ���������� �����,
����������� ��������� ����� (��� String) ������� ��������������� ������
�� ������� ����� (������, ��������� ��� ������ ���������� ������� ��
��� ����), ��������� ���������� � ������ ��������� ���� �����
������������ � ��������� ����..
����������:
� ����� �� ����������� �������� ������� split();
� � ����� ����� ������� ������� ����� ������, � ������� ����- ���
����� ���������� � �������� �����;
� ��� ������ ������ ������� ���������� ��������� ����.*/