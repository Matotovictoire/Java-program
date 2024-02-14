import java.util.Scanner;
public class HexaToOctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Hexadecimal number: ");
        String hexNumber = sc.nextLine();

        //Convert hexadecimal to decimal
        int decimalNumber = Integer.parseInt(hexNumber, 16);

        //Convert decimal to octal
        String octalNumber = Integer.toOctalString(decimalNumber);

        //display the octal equivalent
        System.out.println("Octal equivalent: " + octalNumber);

        sc.close();
    }
}
