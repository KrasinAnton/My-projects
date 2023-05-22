package lr13;

public class Task6 {
    public static int sum(int[] arr) throws InterruptedException {
        int processors = Runtime.getRuntime().availableProcessors();
        int chunkSize = arr.length / processors;
        int[] sumValues = new int[processors];
        SummingThread[] threads = new SummingThread[processors];

        // Создаем потоки
        for (int i = 0; i < processors; i++) {
            threads[i] = new SummingThread(arr, i * chunkSize, (i + 1) * chunkSize, sumValues, i);
            threads[i].start();
        }

        // Ждем завершения всех потоков
        for (int i = 0; i < processors; i++) {
            threads[i].join();
        }

        // Находим сумму элементов из сумм в каждом потоке
        int sum = 0;
        for (int i = 0; i < processors; i++) {
            sum += sumValues[i];
        }
        return sum;
    }

    private static class SummingThread extends Thread {
        private final int[] arr;
        private final int start;
        private final int end;
        private final int[] sumValues;
        private final int index;

        public SummingThread(int[] arr, int start, int end, int[] sumValues, int index) {
            this.arr = arr;
            this.start = start;
            this.end = end;
            this.sumValues = sumValues;
            this.index = index;
        }

        public void run() {
            int sum = 0;
            for (int i = start; i < end; i++) {
                sum += arr[i];
            }
            sumValues[index] = sum;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        int[] arr = {1, 5, 3, 6, 2, 7, 9, 8, 4};
        int sum = sum(arr);
        System.out.println("Сумма элементов: " + sum);
    }
}
