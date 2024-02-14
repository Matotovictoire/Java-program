import java.net.*;
import java.io.*;
public class net4 {
    public static void main(String[] args) {
        try{InetAddress Ip1= InetAddress.getLocalHost();
            System.out.println("the ip address is: " +Ip1);
            byte[] Ip2= Ip1.getAddress();
           byte[] Ip = {(byte)192,(byte)168,0,50};
           for(int i=1; i<=254; i++){
            Ip2[3] = (byte)i;
            InetAddress Ip3=InetAddress.getByAddress(Ip2);
            if(Ip3.isReachable(1200)){
                System.out.println("the ip: "+ Ip3 +" is up");
             }
           else {
                System.out.println("the ip: "+Ip3+" is down");
            }
           }

        }catch (Exception e){System.out.println(e);}
    }
}
