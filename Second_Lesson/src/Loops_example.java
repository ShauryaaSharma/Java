
import java.util.Scanner;

public class Loops_example {
    public static void main(String[] args) {
        // For Loop
        // Print numbers from 1 to 5
        System.out.println("===================================================");
        System.out.println("Example of For Loop");
        System.out.println("===================================================");
        for (int num = 1;num <= 5; num+= 1){
            System.out.println(num);
        }

        // Print numbers from 1 to N
        System.out.print("Please enter the Value of N: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int x = 1; x <= n; x++){
            System.out.println(x);
        }

        // While Loop
        System.out.println("===================================================");
        System.out.println("Example of While Loop");
        System.out.println("===================================================");
        int num = 1;
        while (num <= 5){
            System.out.println(num);
            num += 1;
        }


        //DoWhile Loop
        System.out.println("===================================================");
        System.out.println("Example of DoWhile Loop");
        System.out.println("===================================================");
        int z = 1;
        do{
            System.out.println(z);
            z++;
        } while (z <= 5);
    }
}
