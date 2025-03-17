public class remove_Duplaicate {
  public static boolean[] map = new boolean[26];
  public static void removeduplicate(String str,int idx,String newString) {
    if (idx == str.length()) {
      System.out.print(newString);
      return;
    }
    char currchar = str.charAt(idx);
    if (map[currchar - 'a'] == true) {
       removeduplicate(str, idx+1, newString);
    } else {
      newString += currchar;
      map[currchar - 'a'] = true;
      removeduplicate(str, idx+1, newString);
    }
  }
   public static void main(String args[]) {
    String str = "abbcad";
    removeduplicate(str, 0,"");
   }
}