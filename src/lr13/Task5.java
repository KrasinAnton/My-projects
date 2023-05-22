package lr13;

public class Task5 {
    public static int findMax(int[] arr) throws InterruptedException {
        int processors = Runtime.getRuntime().availableProcessors();
        int chunkSize = arr.length / processors;
        int[] maxValues = new int[processors];
        MaxFinderThread[] threads = new MaxFinderThread[processors];

        // Создаем потоки
        for (int i = 0; i < processors; i++) {
            threads[i] = new MaxFinderThread(arr, i * chunkSize, (i + 1) * chunkSize, maxValues, i);
            threads[i].start();
        }

        // Ждем завершения всех потоков
        for (int i = 0; i < processors; i++) {
            threads[i].join();
        }

        // Находим максимальный элемент из максимальных значений в каждом потоке
        int max = maxValues[0];
        for (int i = 1; i < processors; i++) {
            if (maxValues[i] > max) {
                max = maxValues[i];
            }
        }
        return max;
    }

    private static class MaxFinderThread extends Thread {
        private final int[] arr;
        private final int start;
        private final int end;
        private final int[] maxValues;
        private final int index;

        public MaxFinderThread(int[] arr, int start, int end, int[] maxValues, int index) {
            this.arr = arr;
            this.start = start;
            this.end = end;
            this.maxValues = maxValues;
            this.index = index;
        }

        public void run() {
            int max = arr[start];
            for (int i = start + 1; i < end; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            maxValues[index] = max;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        int[] arr = {1, 5, 3, 6, 2, 7, 9, 8, 4};
        int max = findMax(arr);
        System.out.println("Максимальный элемент: " + max);
    }
}
