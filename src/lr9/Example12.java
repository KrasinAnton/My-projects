package lr9;

public class Example12 {
    public static void m(String str, double chislo) {
        if (str == null) {
            throw new IllegalArgumentException("Строка введена неверно");//т.к. str == null исключение создано не будет перехвачано, т.к. нет соответствующего catch, будет выведена ошибка
        }
        if (chislo > 0.001) { //эта часть кода не работает, т.к. есть ошибка IllegalArgumentException
            throw new IllegalArgumentException("Неверное число");
        }
    }

    public static void main(String[] args) {
        try {
            m(null, 0.000001); //в метод передаются аргументы String "null" & double "0.000001"
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}