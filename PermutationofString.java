import java.util.*;
public class PermutationofString {
  public static void printperm(String str,String permutation) {
    if (str.length() == 0) {
      System.out.println(permutation);
      return;
    }
    for (int i = 0; i < str.length(); i++ ) {
      char currchar = str.charAt(i);
      String newString = str.substring(0, i) + str.substring(i+1);
      printperm(newString, permutation+currchar);
    }
  }
  public static void main (String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the String : ");
    String str = sc.nextLine();
    printperm(str, "");
  }
}