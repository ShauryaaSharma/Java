public class Loops {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("If Statement");
        if (a == 10){
            System.out.println("Hello World");
        }

        int count = 0;
        System.out.println("While Loop");
        while(count != 5){
            System.out.println(count);
            count++;
        }

        System.out.println("For Loop");
        for (int num = 1; num != 5; num++){
            System.out.println(num);
        }
    }
}
