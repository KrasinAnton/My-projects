package lr12;

import java.util.Arrays;

public class Task2 {
    public static int[] getCommonElements(int[] arr1, int[] arr2) {
        int[] tempArr = new int[Math.min(arr1.length, arr2.length)];
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    tempArr[count] = arr1[i];
                    count++;
                    break;
                }
            }
        }
        int[] resultArr = Arrays.copyOf(tempArr, count);
        return resultArr;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 5, 6, 7};
        int[] commonArr = getCommonElements(arr1, arr2);
        System.out.println(Arrays.toString(commonArr));

    }
}