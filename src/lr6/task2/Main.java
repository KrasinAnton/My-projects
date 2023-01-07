package lr6.task2;

public class Main {
    public static void main(String[] args) {
        Task2 myex = new Task2();
        myex.view();
        myex.view();
        myex.view();
        myex.view();
        myex.view();
    }
}
 class Task2 {
    private static int val1;
    public static void view() {
        System.out.println(val1);
        val1++;
    }
}
/*Напишите программу с классом, в котором есть закрытое статическое
целочисленное поле с начальным нулевым значением. В классе должен быть описан
статический метод, при вызове которого отображается текущее значение статического
поля, после чего значение поля увеличивается на единицу.
*/
