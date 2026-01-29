package Second_Session;

public class conditionalStatements {
    public static void main(String[] args) {
        int salary = 125000;
        if (salary > 250000){
            salary = salary + 5000;
        } else if (salary < 50000) {
            salary = salary + 1000;
        } else {
            salary = salary + 1000;
        }

        System.out.println(salary);
    }
}
