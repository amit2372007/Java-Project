// Move all 'x' to end of the String -->
public class Rec_moveallx_to_EndofString{
  public static void moveallX (String str, int idx, int count,String newString) {
    if (idx == str.length()) {
      for (int i = 0; i < count ;i++) {
         newString += 'x';
      }
      System.out.println(newString);
      return;
    }
    char currentE = str.charAt(idx);
    if (currentE == 'x') {
      count++;
      moveallX(str, idx+1, count, newString);
    }
    else {
      newString += currentE;
      moveallX(str, idx+1, count, newString);
    }
  }
  public static void main (String args[]) {
    String str = "axbcxxd";
    moveallX(str, 0, 0, "");
  }
}