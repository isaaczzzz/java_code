import java.util.Scanner;

public class Spiral {
   public static void main(String [] args) {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      in.close();

      int[][] arr = new int[n][n];

      int side = 1;//up
      int i = 0;
      int j = 0;
      for(int num = 1; num <= Math.pow(n, 2); num++) {
         switch (side) {
            case 1: //up
               if(j < n && arr[i][j] == 0)
                  arr[i][j++] = num;
               else {
                  side = 2;
                  j--;
                  i++;   
                  num--;
               }
               break;
            case 2: //right
               if(i < n && arr[i][j] == 0)
                  arr[i++][j] = num;
               else {
                  side = 3;
                  j--;
                  i--;   
                  num--;
               }
               break;
            case 3: //down
               if(j >= 0 && arr[i][j] == 0)
                  arr[i][j--] = num;
               else {
                  side = 4;
                  j++;
                  i--;   
                  num--;
               }
               break;
            default://left
               if(i >= 0 && arr[i][j] == 0)
                  arr[i--][j] = num;
               else {
                  side = 1;
                  j++;
                  i++;   
                  num--;
               }
               break;
         }
      }

      for(i = 0; i < n; i++) {
         for(j = 0; j < n; j++)
            System.out.print(arr[i][j] + " ");
         System.out.println();
      }
   }
}