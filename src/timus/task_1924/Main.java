package timus.task_1924;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in;
        in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();

        int res = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) res += i + 1;
            else res -= i + 1;
        }
        if (res % 2 == 0)
            out.println("black");
        else
            out.println("grimy");
        out.flush();
    }
}
