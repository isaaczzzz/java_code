import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FileOutPutStreamDemo {
    public static void main(String[] argc) throws IOException {
        FileOutputStream fos = new FileOutputStream("outputFiles\\fileDemo.txt");

        HashMap<String, String> hm = new HashMap<>();
        hm.put("ljy", "114514");
        hm.put("zlm", "1919810");

        byte[] bys = new byte[1024];
        Set<Map.Entry<String,String>> entrySet = hm.entrySet();
        for(Map.Entry<String,String> me : entrySet) {
            bys = me.getKey().getBytes();
            fos.write(bys);
            fos.write(":".getBytes());
            bys = me.getValue().getBytes();
            fos.write(bys);
            fos.write("\r\n".getBytes());
        }
        fos.close();
    }
}
