import java.util.Scanner;

public class countingOccurrences_Problem {
    public static void main(String[] args) {
        System.out.print("Provide a number: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        //There is one more way that we can convert the number to a string, and then we can iterate over the whole number. Try solving it on yourself.

        int count = 0;
        while (num > 0){
            int rem = num % 10;
            if (rem == 5){
                count++;
            }
            num = num / 10;
        }

        System.out.println(count);
    }
}
