package Practice;

import java.util.Scanner;

public class SplitSolution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.

        if (s.trim().isEmpty()) {
            System.out.println(0); // No tokens
            return;
        }
        String[] tokens = s.trim().split("[ !,?._'@]+");

        // Print the number of tokens
        System.out.println(tokens.length);

        // Print each token on a new line
        for (String token : tokens) {
            System.out.println(token);
        }


        scan.close();
    }
}

