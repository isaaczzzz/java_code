import java.util.Arrays;

public class ArrayClass {
    public static void main(String[] args){
        int[] a = new int[] { 18, 62, 68, 82, 65, 9 };
        int[] b = Arrays.copyOfRange(a, 0, 5); //复制a到b
        //<==>System.arraycopy(a, 0, b, 0, 5 );

        Arrays.sort(a); //排序
        System.out.println("排序后: " + Arrays.toString(a));
        //String content = Arrays.toString(a);
        // 转换为String

        System.out.println("数字62出现的位置:"+Arrays.binarySearch(a, 62));//必须先排序

        int[] c = new int[5];
        Arrays.fill(a, 1);
        System.out.println("c: " + Arrays.toString(a));
    }
}
