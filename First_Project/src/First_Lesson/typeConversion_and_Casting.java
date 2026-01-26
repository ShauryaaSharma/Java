package First_Lesson;

import java.util.Scanner;

public class typeConversion_and_Casting {
    public static void main(String[] args) {

        //Here even if I enter an Integer value it will still give no error and the output will be a Float. This is called TypeConversion.
        //Conditions for TypeConversion are:
        // 1) The input and output type should be compatible.
        // 2) The destination type should be greater than the source type.

        Scanner input = new Scanner(System.in);
        float num = input.nextFloat();
        System.out.println(num);

        //If 2 types are not compatible as per the above criterias then comes the topic of Type Casting.
        //It is also called Narrow Conversion. For Example, Narrow the float into the Integer.

        int val = (int)(67.87f);
        System.out.println(num);

        //Automatic Type Promotion in expressions
        //In the below example we know the limit of byte is 256. When we multiply 50*40 we get 2000. We also know that a byte*byte gives a byte. So how are we storing this 2000 value in byte?
        // In this case Java automatically promotes the byte datatype to Int for storing this 2000 value. This is called Automatic Type Promotion.

        byte a = 40;
        byte x = 40;
        byte y = 100;
        int z = (a*x)/y;

        System.out.println(z);

        //Java follows Unicode Values.
        //Hence you can print multiple languages in Java

        System.out.println("नमस्ते दुनिया");
        System.out.println("こんにちは 世界");

        //Example of TypeCasting

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f*b) + (i/c) + (d*s);
        //By TypeCasting Individually converts the result equation to:
        // float + int - double = double, byte is smaller than float, character is smaller than integer, short is smaller than double.
        System.out.println((f*b) + " " + (i/c) + " " + (d*s));
        System.out.println(result);

    }
}
