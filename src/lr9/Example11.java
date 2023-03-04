package lr9;

public class Example11 {
    public static void main(String[] args) {
        try {
            System.out.println("0"); //печатает "0"
            throw new NullPointerException("ошибка");
        }
        catch (NullPointerException e) {
            System.out.println("1 "+e );} //исключение перехвачено и обработано, печатает "1" и исключение
        finally { //т.к. finally - выполняется еще эта часть кода
            System.out.println("2" ); } //печатает "2"
        System.out.println("3");//печатает "3"
    }
}
