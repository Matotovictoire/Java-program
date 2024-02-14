import java.util.Scanner;
public class Marks {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks: ");
         a = sc.nextInt();

        if(a>=80 && a<=100){
            System.out.println("You're Excellent");
        }else if(a>=70 && a<=80){
            System.out.println("You're so Very Good");
        }else if(a>=50 && a<=69){
            System.out.println("You are Good");
        }else{
             System.out.println("You failed");
         }
        sc.close();
    }
}
