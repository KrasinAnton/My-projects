package lr12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task6 {
    public static List<Integer> getNumbersDivisibleBy(List<Integer> inputList, int divisor) {
        List<Integer> result = new ArrayList<>();
        for (Integer num : inputList) {
            if (num % divisor == 0) {
                result.add(num);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> inputList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int divisor = 3;
        List<Integer> result = getNumbersDivisibleBy(inputList, divisor);
        System.out.println(result);

    }
}
