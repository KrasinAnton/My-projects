package lr13;

public class Task3 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new EvenNumbersThread());
        Thread thread2 = new Thread(new OddNumbersThread());
        thread1.start();
        thread2.start();
    }

    private static class EvenNumbersThread implements Runnable {
        @Override
        public void run() {
            for (int i = 2; i <= 10; i += 2) {
                System.out.println("Четные числа: " + i);
            }
        }
    }

    private static class OddNumbersThread implements Runnable {
        @Override
        public void run() {
            for (int i = 1; i <= 9; i += 2) {
                System.out.println("Нечетные числа: " + i);
            }
        }
    }
}
