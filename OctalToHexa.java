import java.util.Scanner;
public class OctalToHexa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter an Octal Number =");
        String inputNumber = sc.nextLine();
        OctToHex(inputNumber);

    }
    //user defined method to convert the octal number into hexadecimal number
    public static void OctToHex(String octalNumber) {
        //declare a variable
        //convert the given Octal number to Hexadecimal number and store it into that variable
        int decimalNumber = Integer.parseInt(octalNumber, 8);
        //declare a variable
        //now convert Decimal number to Hexadecimal number and store it into that variable
        String hexadecimalNumber = Integer.toHexString(decimalNumber);
        System.out.println("The Hexadecimal value of " + octalNumber + " is " +hexadecimalNumber);
    }
}
