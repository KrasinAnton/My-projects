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
                    if (arr[i].matches("(?ui:[^аеЄиоуыэю€]).*")) {
                        out.print(arr[i] + " ");
                        rowCount++;
                    }
                }
                out.println("\n  олличество слов в строке " + lineCount + ": " + rowCount);
            }
        } catch (IOException e) {
            System.out.println("ќшибка !!!!!!!!");
        } finally {
            br.close();
            out.flush();
            out.close();
        }
    }
}
/*—оздать проект, позвол€ющий из одного текстового файла,
содержащего несколько строк (тип String) заранее подготовленного текста
на русском €зыке (ѕушкин, Ћермонтов или другой российсмки классик на
¬аш вкус), построчно переписать в другой текстовый файл слова
начинающиес€ с согласных букв..
“ребовани€:
Ц слова из предложени€ выдел€ть методом split();
Ц в новом файле следует указать номер строки, в которой иско- мые
слова находились в исходном файле;
Ц дл€ каждой строки указать количество выбранных слов.*/