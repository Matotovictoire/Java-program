import java.net.*;
import java.io.*;

public class net {
    public static void main(String[] args) {
        
        try{InetAddress Ip= InetAddress.getLocalHost();
            // For printing the host name with the host address 
        System.out.println("the result is:" +Ip);
        // for printing just the host name
        System.out.println("Host Name: "+Ip.getHostName());
        // for printing the host address
        System.out.println("Ip Address: "+Ip.getHostAddress());
        
        }catch(Exception e){System.out.println(e);}
            
        }

    }
