import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] a = new int[] {1, 7, 9, 11, 13, 15, 17, 19};
        int[] b = new int[] {2, 4, 6, 8, 10};
        int[] c = new int[a.length + b.length];
        System.arraycopy(a, 0, c, 0, a.length);
        System.arraycopy(b, 0, c, a.length, b.length);
        Arrays.sort(c);

        for(int each : c)
            System.out.print(each + " ");
        System.out.println();
    }
}
