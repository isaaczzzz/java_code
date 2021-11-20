public class MaxMin {
    public static void main(String[] args){
        int[] num = new int[10];
        int max, min;

        for(int i = 0; i < 10; i++) {
            num[i] = (int) (Math.random() * 100);
            System.out.print(num[i] + " ");
        }
        System.out.println();

        max = min = num[0];
        for(int each : num) {
            max = Math.max(max, each);
            min = Math.min(min, each);
        }
        System.out.println("Max is: " + max);
        System.out.println("Min is: " + min);
    }
}
