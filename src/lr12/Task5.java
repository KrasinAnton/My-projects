package lr12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task5 {
    public static List<String> getStringsContainingSubstring(List<String> inputList, String substring) {
        List<String> result = new ArrayList<>();
        for (String str : inputList) {
            if (str != null && str.contains(substring)) {
                result.add(str);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> inputList = Arrays.asList("apple", "banana", "orange", "peach", "grape");
        String substring = "an";
        List<String> result = getStringsContainingSubstring(inputList, substring);
        System.out.println(result);

    }

}