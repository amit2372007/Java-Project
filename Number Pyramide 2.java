 // print Number pyramide -->
 import java.util.*;
class Main {
    public static void main (String[] arg) {  
    int n = 5;
    // Outer Loop -->
    for (int i = 1;i <= n;i++) {
    // Inner Loop -->
    // Spaces -->
    for (int j = 1;j <= n-i;j++) {System.out.print(" "); }
    // Numbers
    for (int j = i;j >= 1;j--) {System.out.print(i + " ");}   
    System.out.println(); 
    }
}}
// Number Pyramide -->
//          1
//         2 2
//        3 3 3
//       4 4 4 4
//      5 5 5 5 5