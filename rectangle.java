import java.util.Scanner;
public class rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the longueur: ");
        double L = sc.nextInt();
        System.out.println("Enter the Largeur: ");
        double l = sc.nextInt();
        double area = L * l;
        double perimeter = 2*(L+l);
        System.out.println("the area of this rectangle is: "+area);
        System.out.println("Enter perimeter of this rectangle is: "+perimeter);

        sc.close();  
    } 
}