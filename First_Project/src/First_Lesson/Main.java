package First_Lesson;

// ~ Class is a named group of properties and functions.
// ~ Public mean that the main class can be accessed from anywhere.
// ~ Convention: Since a .java file is class itself. So the class inside the file should have the same name. Also Starting the class name from capital is a convention.
// ~ First_Lesson.Main function is a block of code, and this is where the program starts. Without this main function we cannot run our code in Java.//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    // ~ Since the main function should be logically available to be executed from anywhere, hence the keyword "public" is used for main function.
    // ~ If main is the first function to run, hence we should not be forced to created an object of the class its inside. Any function which can run without its object being created is a static function. Heace the keyword "Static".
    // ~ "Void" is the return type of the function. In this case we dont want it to give any value. Hence "Void".
    // ~ "String[] args" These are command line arguments. So basically whatever we put in the CMD as an argument, that will we stored in that variable as a String.
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println(args[1]);
    }
}