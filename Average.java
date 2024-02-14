import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        double oop;
        double os;
        double marks;
        Scanner mark = new Scanner(System.in);
        System.out.println("Enter the marks of oop");
        oop = mark.nextInt();
        System.out.println("Enter the marks of Os: ");
        os = mark.nextInt();
        marks = (oop + os)/2;
        if (marks >=70) {
            System.out.println("You've been Awared");
        }else{
            System.out.println("You're transfered to accounting");
        }
    }
}
