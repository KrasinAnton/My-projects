package lr9;

public class Example10 {
    public static int m(){
        try {
            System.out.println("0"); //печатает "0"
            return 15; //выход из метода с присвоением значения "15"
        }  finally { //т.к. finally - выполняется еще эта часть кода
            System.out.println("1"); //печатает "1"
            return 20; //выход из метода с заменой значения "15" на "20"
        }
    }
    public static void main(String[] args) {
        System.out.println(m()); //печатает значение метода "20"
    }
}
