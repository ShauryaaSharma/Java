package Second_Session;

import java.util.Scanner;

public class caseCheck {
    public static void main(String[] args) {
        System.out.print("Enter a Word: ");
        Scanner in = new Scanner(System.in);
        // Since there is no such thing as in.nextChar() hence we need to take input as a string and then consider its first letter.
        // trim removes all extra spaces at the end of these words. charAt(0) means that we are only considering the character at the 0th index.
        char ch = in.next().trim().charAt(0);

        System.out.print("The first letter of the provided word is: ");
        System.out.println(ch);

        if (ch >= 'a' && ch <= 'z'){
            System.out.println("LowerCase");
        } else {
            System.out.println("UpperCase");
        }
    }
}
