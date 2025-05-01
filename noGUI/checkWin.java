

public class checkWin {
    // This method checks if the game is won by either player
    private static int[][] winningCombinations = {
        {0, 1, 2}, {3, 4, 5}, {6, 7, 8}, // Rows
        {0, 3, 6}, {1, 4, 7}, {2, 5, 8}, // Columns
        {0, 4, 8}, {2, 4, 6}             // Diagonals
    };
    static boolean isGameWon(char[] board) {
        
        for (int[] combo : winningCombinations) { 
            if (board[combo[0]] == board[combo[1]] && board[combo[1]] == board[combo[2]] && board[combo[0]] != '#') {
                return true; 
            }
        }
        return false; // return false if no winning condition is met
    }

    public static void checkWinner(char[] board,int index, char move) {
        if (isGameWon(board)) {
            Board.bigBoard[index] = move;
            if (isGameWon(Board.bigBoard)) {
                System.out.println("Player " + move + " won the Game!");
                System.exit(0); 
            } else {
                System.out.println("Player " + move + " wins this round!");
            }
        }
    }
}
