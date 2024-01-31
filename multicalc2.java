import java.util.Scanner;
public class multicalc2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input the first number");
        int n1 = sc.nextInt();
        System.out.println("Input the second number");
        int n2 = sc.nextInt();
        // sum
        System.out.println(n1 + " + " + n2 + " = " + (n1+n2));
        // Multiplication
        System.out.println(n1 + " x " + n2 + " = " + (n1*n2));
        //Substraction
        System.out.println(n1 + " - " + n2 + " = " + (n1-n2));
        //Division
        System.out.println(n1 + " / " + n2 + " = " + (n1/n2));
        // Reminder
        System.out.println(n1 + " % " + n2 + " = " + (n1%n2));

        sc.close(); 

    }
}
