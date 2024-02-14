import java.util.Scanner;
import java.io.*;
import java.net.*;

public class net3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //write a program which request you to enter an ip address amd then the program tells you whether, the ip address is "up or not"
        
        System.out.println("Enter the ip address: ");
        String input = scan.nextLine();
        //this line is used to translate the input of the user into another thing
        try{InetAddress ip = InetAddress.getByName(input);
            if(ip.isReachable(1200)){
                System.out.println("the ip you entered is up");
            }else{
                System.out.println("the ip you entered isn't up");
            }
        }catch (Exception e){System.out.println(e);}
        scan.close();
    }
}
