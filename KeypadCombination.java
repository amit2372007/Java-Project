 // To get combination of letters from keypad --> (Keypad Combination)
import java.util.*;
public class KeypadCombination{
  public static String[] keypad = {"." , "abc" , "def" , "ghi" , "jkl" , "mno" , "pqrs" , "tu" , "vwx" , "yz"};
  public static void printComb (String str , int idx , String Combination) {
    if (idx == str.length()) {
      System.out.println(Combination);
      return;
    }
    char currchar = str.charAt(idx);
    String mapping = keypad[currchar - '0'];

    for (int i = 0 ; i < mapping.length() ; i++ ) {
      printComb(str, idx+1, Combination+mapping.charAt(i));
    }
  }
  public static void main (String args[]) {
    Scanner sc = new Scanner (System.in);
    System.out.print("Input 2 Numbers to get Combination :");
    String str = sc.next();
    printComb(str, 0, "");
  }
}