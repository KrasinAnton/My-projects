package lr4;

public class Example1 {
    public static void main(String[] args) {
        int rows = 11;
        int columns = 23;
        int z;
        for (int i = 1 ; i <= rows; i++){
            z = 0;
            for (int j = 1; j <=columns; j++){
                System.out.print("+");
                z = z + 1;
            }
            System.out.println();
        }
    }
}
/*Напишите программу, которая выводит в консольное окно
прямоугольник, размеры сторон которого, ширина: 23 колонки, высота: 11
строк*/

