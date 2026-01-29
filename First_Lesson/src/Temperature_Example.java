package First_Lesson;

import java.util.Scanner;

public class Temperature_Example {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your temperature in C: ");
        float tempC = input.nextFloat();
        float tempF = (tempC * 1.8f) + 32;
        System.out.println(tempF);
    }
}
