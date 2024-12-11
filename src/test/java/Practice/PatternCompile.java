package Practice;

import java.util.Scanner;
import java.util.regex.*;

public class PatternCompile
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        if (!in.hasNextInt()) {
            System.out.println("No input provided");
            in.close();
            return;
        }
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){

            if (!in.hasNextLine()) {
                break; // Exit the loop if no more lines are available
            }
            String pattern = in.nextLine();
            try {
                // Try to compile the regex
                Pattern.compile(pattern);
                System.out.println("Valid");
            } catch (Exception e) {
                // If an exception is thrown, it means the regex is invalid
                System.out.println("Invalid");
            }
        }

    }
}

