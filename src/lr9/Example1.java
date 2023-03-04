package lr9;

public class Example1 {
    public static void main(String[] args) {
        try {
            System.out.println("0"); // печатает "0 "
            throw new RuntimeException("Непроверяемая ошибка");
        } catch (RuntimeException e) {
            System.out.println("1 "+ e); // исключение перехвачено обработано, печатает "1" и исключение
        }
        System.out.println("2"); //печатает "2"
    }
}
