public class Board {
    public static char[][] board = new char[9][9];
    public static char[] bigBoard = new char[9];
    
    static void printBoard() {
        for (int i = 0; i < 9;i+=3) {
            for (int j = 0; j < 9;j+=3) {
                for (int global = i;global<(i+3);global++) {
                    for (int local = j; local < j+3; local++) {
                            
                           System.out.print(board[global][local]+" ");
                        }
                        System.out.print(" ");
                        
                }
                System.out.println();
                
            }
            System.out.println();
        }
    }
    
    // This method initializes the board with '#' characters
    static void initializeBoard() {
    
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                board[i][j] = '#';
                bigBoard[i] = '#'; // Initialize bigBoard with '#'
            }
        }
    }
}
