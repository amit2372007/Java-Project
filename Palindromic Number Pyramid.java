import java.util.*;
class Main {
    public static void main (String[] arg) {
    int n = 5;
    // Outer Loop -->
   for (int i = 1;i <= n;i++) {
   // Inner Loop -->
   for (int j=1;j <= n-i;j++) {
    System.out.print(" " + " ");         // To Print Space <-- 
}  
   for (int j = i;j >= 1;j-- ) {
    System.out.print(j + " ");             // To Print First Half <-- 
}
   for (int j=2;j <= i;j++) {
    System.out.print(j + " ");             // To print Secound Half <--
}
   System.out.println();   
    }}}
// Print the Palindromic Pattern
//         1
//       2 1 2
//     3 2 1 2 3 
//   4 3 2 1 2 3 4
// 5 4 3 2 1 2 3 4 5