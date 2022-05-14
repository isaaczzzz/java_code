package NET;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class udpReceive {
    public static void main(String[] args) throws IOException {
        //创建接收socket对象
        DatagramSocket ds = new DatagramSocket(10000);
        byte[] bys = new byte[1024];
        //创建接受数据包
        DatagramPacket dp = new DatagramPacket(bys, bys.length);
        ds.receive(dp);
        //解析数据并输出
        String data = new String(dp.getData(), 0, dp.getLength());
        System.out.println(data);
        ds.close();
    }
}