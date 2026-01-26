package First_Lesson;

import java.util.Scanner;

public class Scanner_input {
    public static void main(String[] args) {
        //Scanner is basically a input class that specifies the input stream. And allows to take input
        //System.in allows java to take input by default such as keyboard.
        // Since Java is a NON-Static class hence we need to create a object before using it. Hence "new Scanner" creates an object which can be used to take input.
        Scanner input = new Scanner(System.in);
        //Here input is a variable which is pointing to the object of the Scanner class.
        System.out.println(input.nextInt());
    }
}
