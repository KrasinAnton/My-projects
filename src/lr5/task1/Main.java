package lr5.task1;

public class Main {
    public static void main(String[] args) {

        Task1 task1 = new Task1();

        task1.setCh1('K');
        System.out.println("getCodeSymbol " + task1.getCodeSymbol());

        task1.showCodeValue();

    }
}
/*Напишите программу с классом, в котором есть закрытое символьное поле
и три открытых метода. Один из методов позволяет присвоить значение полю.
Еще один метод при вызове возвращает результатом код символа. Третий
метод позволяет вывести в консольное окно символ (значение поля) и его код.*/