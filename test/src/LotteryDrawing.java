import java.util.Arrays;
import java.util.Scanner;

public class LotteryDrawing {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("How many number do you want to draw?");
        int k = in.nextInt();

        System.out.println("What is the highest number you need to draw?");
        int n = in.nextInt();

        int[] number = new int[n];
        for(int i = 0; i < number.length; i++)
            number[i] = i + 1;

        int[] result = new int[k];
        for(int i = 0; i < result.length; i++){
            int r = (int)(Math.random() * n);

            result[i] = number[r];

            number[r] = number[n - 1];//抽出后，将最后一个元素放入，n--，防止重复
            n--;
        }

        System.out.println("The results are:");
        Arrays.sort(result);
        for(int each : result)
            System.out.print(each + " ");
    }

}
