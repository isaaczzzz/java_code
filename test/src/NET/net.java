package NET;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class net {
    public static void main(String[] args) throws UnknownHostException {
        byte[] host = {(byte)106, (byte)55, (byte)28, (byte)228};
        byte[] localhost = {(byte)127, (byte)0, (byte)0, (byte)1};
        //InetAddress address = InetAddress.getByAddress(host);
        InetAddress address = InetAddress.getByName("acer");
        String hostName = address.getHostName();
        String ipAddress = address.getHostAddress();

        System.out.println("主机名: "+hostName);
        System.out.println("ip地址: "+ipAddress);
    }
}
