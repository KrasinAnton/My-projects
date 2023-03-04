package lr8.Task1.Example7;

import java.io.*;

public class Buf_RW_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        BufferedWriter out = null;
        try {
            //создание файловых символьных потоков для чтения и записи
            br = new BufferedReader(new FileReader("src\\lr8\\Task1\\Example7\\MyFile1.txt"), 1024);
            out = new BufferedWriter(new FileWriter("src\\lr8\\Task1\\Example7\\MyFile2.txt"));
            int lineCount = 0; //счетчик строк
            String s;
            //переписывание информации из одного файла в другой
            while ((s=br.readLine())!= null){
                lineCount++;
                System.out.println(lineCount + ": " + s);
                out.write(s);
                out.newLine(); //переход на новую строку
            }
        } catch (IOException e) {
            System.out.println("Ошибка!!!!"+e);
        }
        finally {
            br.close();
            out.flush();
            out.close();
        }
    }
}
// Чтение из одного файла и запись в другой файл данных построчно с использованием буфера в 1 килобайт.