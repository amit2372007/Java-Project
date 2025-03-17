 // print Number pyramide -->
 import java.util.*;
class Main {
    public static void main (String[] arg) {  
        Scanner sc = new Scanner(System.in);
        System.out.print("Input n (1-10) : ");
    int n = sc.nextInt();
    int block = n;
    int space = n - 1;
    int Number = 1;
    // Outer Loop -->
for (int i = 1; i <= n; i++) {
    // Inner Loop -->
for (int j = 1; j <= block;j++) {
    if (space < j) {System.out.print(Number + " " );}
    else { System.out.print(" " + " ");}
}
System.out.println();
Number++;
space--;
block++;
}
}}