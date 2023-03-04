package lr9;

public class Example9 {
    public static int m(){
        try {
            System.out.println("0"); //печатает "0"
            return 55; //выход из метода с присвоением значения "55"
        }
        finally { //т.к. finally - выполняется еще эта часть кода
            System.out.println("1"); } //печатает "1"
    }
    public static void main(String[] args) { System.out.println(m()); } //печатает значение метода "55"
}
