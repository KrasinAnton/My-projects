package lr12;

import java.util.Arrays;

    public class Task1 {
        public static int[] getEvenNumbers(int[] arr) {
            int[] evenArr = new int[arr.length];
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 0) {
                    evenArr[count] = arr[i];
                    count++;
                }
            }
            int[] resultArr = Arrays.copyOf(evenArr, count);
            return resultArr;
        }

        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
            int[] evenArr = getEvenNumbers(arr);
            System.out.println(Arrays.toString(evenArr));
        }
    }
