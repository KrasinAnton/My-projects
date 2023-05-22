package lr13;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new MyThread("Поток 1"));
        Thread thread2 = new Thread(new MyThread("Поток 2"));
        thread1.start();
        thread2.start();
        Thread.sleep(10000); // ждем 10 секунд
        thread1.interrupt(); // прерываем первый поток
        thread2.interrupt(); // прерываем второй поток
    }

    private static class MyThread implements Runnable {
        private final String name;

        public MyThread(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            while (!Thread.interrupted()) { // пока поток не прерван
                System.out.println(name + ": " + new java.util.Date());
                try {
                    Thread.sleep(1000); // ждем одну секунду
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt(); // сохраняем флаг прерывания
                }
            }
        }
    }
}
