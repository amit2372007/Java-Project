import java.util.*;
public class CountPathofMaze {
  public static int countpath (int i,int j,int n ,int m) {
    if (i == n|| j == m ) {
      return 0;
    }
    if (i == n-1 && j == m-1) {
      return 1;
    }
    // Downpath -->
    int downpath = countpath(i+1, j, n, m);
    // Rightpath -->
    int rightpath = countpath(i,j+1,n,m);

    return downpath + rightpath;
  }
  public static void main (String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Order of Matrix :");
    int n = sc.nextInt(); 
    int m = sc.nextInt();
    int Totalpath = countpath(0, 0, n, m);
    System.out.println("Total Path for Maze of Order(" + n + "," + m +")" + "is : " + Totalpath);
  }}