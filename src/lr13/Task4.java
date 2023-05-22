package lr13;

public class Task4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            Thread thread = new Thread(new NumberPrintingThread(i));
            thread.start();
        }
    }

    private record NumberPrintingThread(int threadNumber) implements Runnable {

        @Override
        public void run() {
            System.out.println("Поток " + threadNumber + " запущен");
        }
    }
}
