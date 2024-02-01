public class swaptwovariable{
    public static void main(String[] args) {
        // Declare variable for the values to be swapped
        int a, b, temp;

        //Assign values to variables a and b
        a = 15;
        b = 27;

        // Print the values before swapping
        System.out.println("Before swapping : a,b = " + a + ", " + b);

        // Perform the swap using a temporaey variable

        temp = a;
        a = b;
        b = temp;

        // Print the values after Swapping
        System.out.println("After Swapping : a,b = " + a + ", " + b);
    }
}