import java.util.Scanner;

public class typeConversion_and_Casting {
    public static void main(String[] args) {

        //Here even if I enter an Integer value it will still give no error and the output will be a Float. This is called TypeConversion.
        //Conditions for TypeConversion are:
        // 1) The input and output type should be compatible.
        // 2) The 
        Scanner input = new Scanner(System.in);
        float num = input.nextFloat();
        System.out.println(num);
    }
}
