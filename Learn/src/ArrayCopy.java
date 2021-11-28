import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args){
        int[] a = new int[10];
        // <==> int[] a = {...}
        int[] b = new int[5];

        for(int i = 0; i < 5; i++) {
            a[i] = (int) (Math.random() * 100);
            System.out.print(a[i] + " ");
        }
        System.out.println();
        for(int i = 0; i < 5; i++) {
            b[i] = (int) (Math.random() * 100);
            System.out.print(b[i] + " ");
        }
        System.out.println();

        System.arraycopy(b, 0, a, 5, 5); //b拼接到a后
        int[] c = Arrays.copyOfRange(b, 0, 5); //b复制到c

        System.out.print("a + b: ");
        for(int each : a)
            System.out.print(each + " ");
        System.out.println();
        System.out.print("c: ");
        for(int each : c)
            System.out.print(each + " ");
        System.out.println();
    }
}
