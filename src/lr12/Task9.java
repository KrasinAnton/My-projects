package lr12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task9 {
    public static List<String> getStringsContainingOnlyLetters(List<String> inputList) {
        List<String> result = new ArrayList<>();
        for (String str : inputList) {
            if (str.matches("[a-zA-Z]+")) {
                result.add(str);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> inputList = Arrays.asList("abc123", "def456", "ghi", "jkl@#$");
        List<String> result = getStringsContainingOnlyLetters(inputList);
        System.out.println(result);

    }

}
