package lr12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task8 {
    public static List<Integer> getNumbersGreaterThan(List<Integer> inputList, int threshold) {
        List<Integer> result = new ArrayList<>();
        for (Integer number : inputList) {
            if (number > threshold) {
                result.add(number);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> inputList = Arrays.asList(1, 3, 5, 7, 9, 11);
        int threshold = 5;
        List<Integer> result = getNumbersGreaterThan(inputList, threshold);
        System.out.println(result);

    }
}
