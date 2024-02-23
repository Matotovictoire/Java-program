import java.net.InetAddress;

public class net2 {
    public static void main(String[] args) {
        // The program to print the ip of a given hostname
        try{InetAddress ip = InetAddress.getByName("auca.ac.rw");
        System.out.println("The Host ip is: " +ip);
      //  System.out.println("auca.ac.rw/197.243.26.123");
    }catch (Exception e) {System.out.println(e);}
    }
}
