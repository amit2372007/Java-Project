import java.util.*;
class Main {
  public static void main (String[] arg) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter n : ");
        int n = sc.nextInt();                                           // print a pattern of star using Loop                          
        int m = 2 * n;                                                  //   *             *
        // Outer Loop -->                                               //   * *         * *
        for (int i = 1;i <= n;i++) {                                    //   * * *     * * *
        // Inner Loop -->                                               //   * * * * * * * *
        for (int j = 1;j <= m;j++) {                                    //   * * * * * * * *
           if (j <= i) {System.out.print("*"+" "); }                    //   * * *     * * *
           else if (j + i > m) {System.out.print("*"+" ");}             //   * *         * *
           else {System.out.print(" "+" " );}                           //   *             * 
      }
        System.out.println();
      }
      // Outer Loop for reverse the pattern
      for (int i = n ; i >= 1;i--) {
      // Inner Loop
      for ( int j = 1; j <= m;j++) {
       if (j <= i) {System.out.print("*" + " ");}
       else if (j + i > m) {System.out.print("*" + " ");}
       else {System.out.print(" "+" ");}
      }
        System.out.println();
      }
  }}
 