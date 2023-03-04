package lr9;

public class Example14 {
    public static void m(int x) throws ArithmeticException{ //из-за расширения метода исключение будет перехвачено
        int h=10/x; //при расчете h - деление на 0
    }
    public static void main(String[] args) { //аргумент main args - значение не присвоено
        try {
            int l = args.length; //int l присваивается значение аргумента main args = 0
            System.out.println("размер массива= " + l); //печатает "размер массива = 0"
            m(l); //в метод передан аргумент l = "0"
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: Деление на ноль"); //исключение перехвачено и обработано, печатает "Ошибка: деление на ноль"
        }
    }
}
