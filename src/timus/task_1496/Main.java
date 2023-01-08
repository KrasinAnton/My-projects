package timus.task_1496;

import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n=in.nextInt();
        HashSet<String> teams = new HashSet<String>();
        HashSet<String> spams = new HashSet<String>();

        for (int i = 0; i <n; i++) {
            String name = in.next();
            if (teams.contains(name))
            {
                spams.add(name);
            }
            else teams.add(name);

        }

        for (String spammer: spams)
        {
            out.println(spammer);
        }
        out.flush();
    }
}
