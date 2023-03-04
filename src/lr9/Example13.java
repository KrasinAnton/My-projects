package lr9;

public class Example13 {
    public static void main(String[] args) { //аргумент main args - значение не присвоено
        try {
            int l = args.length; //int l присваивается значение аргумента main args = 0
            System.out.println("размер массива= " + l); //печатает "размер массива = 0"

            int h=10/l; //при расчете h - деление на 0
            args[l + 1] = "10"; //эта строка пропушена из-за ошибки
        } catch (ArithmeticException e) {//исключение перехвачено и обработано, печатает "деление на ноль"
            System.out.println("Деление на ноль");
        } catch (ArrayIndexOutOfBoundsException e) { // эта часть кода пропущена
            System.out.println("Индекс не существует");
        }
    }
}
