package Second_Session;

import java.util.Scanner;

public class Largest_Number_Problem {
    public static void main(String[] args) {
        System.out.println("Enter 3 Numeric Values: ");
        Scanner inn = new Scanner(System.in);

        int a = inn.nextInt();
        int b = inn.nextInt();
        int c = inn.nextInt();

        int max = a;
        if (b > a){
            max = b;
        }
        if (c > b){
            max = c;
        }

        System.out.println(max);


        //OR

        System.out.println(Math.max(34, 57));

    }
}
