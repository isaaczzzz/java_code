package NET;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class tcpClient {
    public static void main(String[] args) throws IOException {
        //创建客户端socket对象
        Socket s = new Socket("113.54.246.252", 10000);
        //获取输出流，写入数据
        OutputStream os = s.getOutputStream();
        os.write("Hello TCP".getBytes(StandardCharsets.UTF_8));

        //接收服务器反馈
        InputStream is = s.getInputStream();
        byte[] bys = new byte[1024];
        int len = is.read(bys);
        String data = new String(bys, 0, len);
        System.out.println("客户端: " + data);

        s.close();
    }
}
