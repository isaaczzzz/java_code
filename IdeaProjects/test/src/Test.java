public class Test{
    public static void main(String[] args){
        int[] a = new int [10];

        for(int i = 0; i < 10; i++)
            a[i] = (int) (Math.random() * 100);
        for(int i = 0; i < 10; i++)
            System.out.print(a[i] + " ");
        System.out.println();
        for(int i = 9; i >= 0; i--)
            System.out.print(a[i] + " ");
    }
}