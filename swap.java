public class swap {
    public static void main(String[] args) {
        // Declare variables for the values to be swapped
        int a,b, temp;

        //Assing values to variables a and b
        a=15;
        b=25;

        //Print the values before swapping

        System.out.println("Before swapping : a,b = " + a + ", " + b);

        //Perform the swap using the temporary variabls

        temp = a;
        a = b;
        b = temp;

        //Print the values after swapping

        System.out.println("After swapping : a, b = " + a + ", " + b);

    }
}
