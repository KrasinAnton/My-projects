package lr8.Task1.Example6;

import java.io.*;

public class File_RW_byByte {
    public static void main(String[] args) throws IOException {
        Reader in=null; // можно сразу записать FileReader in=null;
        Writer out=null; // можно сразу записать FileWriter out =null;
        try {
            in = new FileReader("src\\lr8\\Task1\\Example6\\MyFile1.txt"); // файл дл€ чтени€
            out= new FileWriter("src\\lr8\\Task1\\Example6\\MyFile2.txt", true); // файл дл€ записи
            // ƒанные считываютс€ и записываютс€ побайтно, как и дл€
            // InputStream/OutputStream
            int oneByte; // переменна€, в которую считываютс€ данные
            while ((oneByte = in.read()) != -1) {
                // out.write((char)oneByte); // запись с уничтожением ранее существующих данных
                out.append((char)oneByte); // запись с добавлением данных в конец
                System.out.print((char)oneByte);
            }
        }
        catch (IOException e) { System.out.println("ќшибка!!!! ");
        }
        finally{
            in.close();
            out.close();
        }
    }
}
//„тение из одного файла и запись в другой файл данных посимвольно.
