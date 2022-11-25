package lr1;



import java.util.Calendar;
import java.util.Scanner;

 public class Example10 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите Ваш год рождения: ");
        int yearOfBirth = in.nextInt();

        int year = Calendar.getInstance().get(Calendar.YEAR)- yearOfBirth;
        System.out.print(year + " лет");

        in.close();
    }
}
/*
Напишите программу, в которой по году рождения определяется возраст пользователя.
*/