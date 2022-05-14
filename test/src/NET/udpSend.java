package NET;

import java.io.IOException;
import java.net.*;
import java.nio.charset.StandardCharsets;

public class udpSend {
    public static void main(String[] args) throws IOException {
        //创建发送端socket对象
        DatagramSocket ds = new DatagramSocket();
        byte[] bys = "Hello, UDP".getBytes(StandardCharsets.UTF_8);
        String address = "113.54.246.252";
        //数据打包
        DatagramPacket dp = new DatagramPacket(bys, bys.length, InetAddress.getByName(address), 10000);

        ds.send(dp);

        ds.close();
    }
}
