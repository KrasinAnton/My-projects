package lr11.Task1.Example5;

public class Recursion {
    public static void main(String[] args) {
        System.out.println(fact(5, 0));
    }

    public static int fact(int n, int level) {
        String indent = "";
        for (int i = 0; i < level; i++) {
            indent += "  ";
        }
        System.out.println(indent + "fact(" + n + ")");
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            int result = fact(n - 2, level + 1) + fact(n - 1, level + 1);
            System.out.println(indent + "  return " + result);
            return result;
        }
    }
}
