import java.util.*;
public class solveNQueens {
  public static boolean isSafe (int row, int col , char[][] board) {
    // Horizontal -->
    for (int j = 0;j < board.length;j++ ) {
      if (board[row][j] == 'Q') {
        return false;
      }
    }
      // Vertically -->
      for (int i = 0 ; i < board.length; i++) {
        if (board[i][col] == 'Q') {
          return false;
        }
      }
      // Upper Left -->
      int r = row;
      for (int c = col; c >= 0 && r >= 0;r-- ,c--) {
          if (board[row][col] == 'Q') {
            return false;
          }
      }
      // Upper Right -->
      r = row;
      for (int c = col ; c <= board.length && r >= 0;r-- , c++) {
        if (board[row][col] == 'Q') {
          return false;
        }
      }
      // Lower left -->
      r = row;
      for (int c = col; r <= board.length && c >= 0; c-- ,r++ ) {
        if (board[row][col] == 'Q') {
          return false;
        }
      }
      // Lower Right -->
      r = row;
      for (int c = col ; row <= board.length && c <= board.length ; c++ , r++ ) {
        if (board[row][col] == 'Q') {
          return false;
        }
      }
   return true;
  }
  public static void saveBoard(List<List<String>> allBoard,char[][] board) {
    String row  = "";
    List<String> newBoard = new ArrayList<>();
    for (int i = 0 ; i < board.length;i++ ) {
       row = "";
       for (int j = 0; j < board[0].length;j++) {
        if (board[i][j] == 'Q') {
          row += 'Q';
        } else {
          row += '.';
        }
       }
       newBoard.add(row);
    }
    allBoard.add(newBoard);
  }
  public static void helper (List<List<String>> allBoard,char[][] board,int col) {
    if (col == board.length) {
      saveBoard(allBoard , board);
      return;
    }
    for (int row = 0 ; row < board.length ; row++ ) {
        if (isSafe(row,col,board)) {
          board[row][col] = 'Q';
          helper(allBoard, board, col+1);
          board[row][col] = '.';
        }
    }
  }
  public static void main (String args[]) {
    int n = 4;
    List<List<String>> allBoard  = new ArrayList<>();
    char[][] board = new char[n][n];
    helper(allBoard,board,0);
    System.out.println(allBoard);
  }
}