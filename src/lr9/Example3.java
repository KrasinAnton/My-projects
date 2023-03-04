package lr9;

public class Example3 {
    public static void main(String[] args) {
        try {
            System.out.println("0"); // печатает "0"
            throw new RuntimeException("ошибка");
        }
        catch (NullPointerException e) {
            System.out.println("1 "+e ); //эта часть кода пропускается
        }
        catch (RuntimeException e) {
            System.out.println("2 "+e);  // исключение перехвачено обработано, печатает "2" и исключение
        }
        catch (Exception e) {
            System.out.println("3 "+e ); //эта часть кода пропускается, исключение уже обработано
        }
        System.out.println("4"); // печатает "4"
    }
}
