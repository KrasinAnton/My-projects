package lr12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task3 {
    public static List<String> getStringsStartingWithCapitalLetter(List<String> inputList) {
        List<String> result = new ArrayList<>();
        for (String str : inputList) {
            if (str != null && !str.isEmpty() && Character.isUpperCase(str.charAt(0))) {
                result.add(str);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> inputList = Arrays.asList("Apple", "banana", "Orange", "peach", "Grape");
        List<String> result = getStringsStartingWithCapitalLetter(inputList);
        System.out.println(result);
    }

}