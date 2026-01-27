package Second_Session;

import java.util.Scanner;

public class Fibonacci_Numbers {
    public static void main(String[] args) {
        //Fibonacci numbers are a sequence of integers where each number is the sum of the two preceding ones, usually starting with 0 and 1. The sequence follows the pattern \(0,1,1,2,3,5,8,13,21,34,55,\dots \) and continues infinitely.
        System.out.print("Which Fibonacci Number do you want? ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = 0;
        int i = 1;
        int count = 2;

        while (count <= n){
            int temp = i;
            i = i+ p;
            p = temp;
            count ++;
        }

        System.out.println(i);
    }
}
