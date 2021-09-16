import java.util.Scanner;

public class Test {
   public String Scan(){
      String sn;
      Scanner scan = new Scanner(System.in);
      sn = scan.nextLine();
      scan.close();
      return sn;
   }
   public static void main(String [] args) {
      String s;
      int []num = {0};
      Test sn = new Test();
      s = sn.Scan();
      
      for(int i = 0; i < s.length() - 1; i++)
      {
         System.out.println(s.charAt(i));
         int k = s.charAt(i) - '0';
         num[k]++;
      }
      for(int x : num){
         System.out.println(x);
         System.out.println(' ');
      }
   }
}
