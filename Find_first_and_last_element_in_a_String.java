// Find The First and last Occurance of Element in a String -->
import java.util.*;
public class Find_first_and_last_element_in_a_String {
  public static int first = -1;
  public static int last = -1;
  public static void findOccurance(String str,int idx,char element) {
    if (idx == str.length()) {
      System.out.println("First Element at : " + first);
      System.out.print("Last Element at : " + last);
      return;
    }
    char currentE = str.charAt(idx);
    if (currentE == element) {
      if (first == -1) {
        first = idx; 
      }
      else {
        last = idx;
      }
    }
    findOccurance(str,idx+1,element);
  }
  public static void main (String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Input String : ");
    String str = sc.next();
    System.out.print("Enter the Element : ");
    char element = sc.next().charAt(0);
    findOccurance(str,0,element);
  }
}