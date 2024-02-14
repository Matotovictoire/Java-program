import java.util.Scanner;

public class CheckAge{
    public static void main(String[] args) {
        int age;
        Scanner ag = new Scanner(System.in);
        System.out.println("Enter your age: ");
        age = ag.nextInt();

        //The ternary operator is a shorthand for an if-else statement in Java.
        // It takes three operands: a condition, a value if the condition is true, 
        //and a value if the condition is false. This operator can be a bit tricky to master, 
        //but once you do, it can make your code more concise and readable.
        String result = (age > 20) ? "You're Old" : "You're so young";
        System.out.println(result);
    }
}