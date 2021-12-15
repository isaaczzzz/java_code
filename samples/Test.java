public class Test{
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

        for(int i = 0; i < 10; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }
}