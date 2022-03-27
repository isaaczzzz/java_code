import java.util.*;

//使用HashMap计算字符串中元素出现次数(使用TreeMap可实现有序排列)
public class StringNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String line = sc.nextLine();

        TreeMap<Character, Integer> hm = new TreeMap<Character, Integer>();

        for(int i = 0; i < line.length(); i++){
            char key = line.charAt(i);
            Integer value = hm.get(key);

            if(value == null) {
                hm.put(key, 1);
            } else {
                value++;
                hm.put(key, value); //++会将value解包, 需重新加入
            }
        }

        Set<Map.Entry<Character,Integer>> entrySet = hm.entrySet();
        for(Map.Entry<Character,Integer> me : entrySet) {
            char key = me.getKey();
            int value = me.getValue();
            System.out.print(key + "(" + value + ")");
        }
    }
}
