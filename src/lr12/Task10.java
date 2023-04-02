package lr12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task10 {
    public static List<Integer> getNumbersLessThan(List<Integer> inputList, int value) {
        List<Integer> result = new ArrayList<>();
        for (Integer num : inputList) {
            if (num < value) {
                result.add(num);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> inputList = Arrays.asList(1, 3, 5, 7, 9, 11);
        List<Integer> result = getNumbersLessThan(inputList, 6);
        System.out.println(result);

    }
}