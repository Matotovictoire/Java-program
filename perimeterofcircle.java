import java.util.Scanner;
public class perimeterofcircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rayon of the circle:");
        double r = sc.nextInt();
        double perimeter = 2 * Math.PI * r;
        double area = Math.PI * r * r;
        System.out.println("the Area of the circle is: " +area);
        System.out.println("the perimeter of the circle is: " +perimeter);

        sc.close(); 
    }
    
}
