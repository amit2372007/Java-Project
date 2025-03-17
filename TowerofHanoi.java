// Tower of Hanoi (Way to solve for n blocks in 3 Towers )-->
import java.util.*;
public class TowerofHanoi {
   public static void TowerofHanoi(int n,String src,String helper,String dest) {
      if (n == 1) {
         System.out.println("Transfer disk "+ n +" from "+ src + " to "+ dest);
         return;
      }
      TowerofHanoi(n-1, src, dest, helper);
      System.out.println("Transfer disk "+ n +" from "+ src + " to "+ dest);
      TowerofHanoi(n-1,helper,src,dest);
   }
   public static void main (String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the Given Number of Disks : ");
      int n = sc.nextInt();
      TowerofHanoi(n,"Source", "Helper", "Destination"); 
   }
}