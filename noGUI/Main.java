import java.util.Scanner;

public class Main {

    static int global, local = 1; // initialize local with a default value
    static char move = 'O'; // initialize move with a default value
    static Scanner sc = new Scanner(System.in); // initialize Scanner object

    static char swapMoves(char move) {
        // This method swaps the moves between 'X' and 'O'
        return (move == 'X') ? 'O' : 'X';
    }

    private static int input() {
        try {
            System.out.print("\nEnter global coordinate (1-9) or 'exit' to quit: ");
            String userInput = sc.next();
            if (userInput.equalsIgnoreCase("exit")) {
                return -1; // exit the loop if user enters 'exit'
            }

            global = Integer.parseInt(userInput); // convert input to integer
            if(isValid.isOutOfBounds(global)) {
                return -2; // check if the move is invalid
            }
            if (!isValid.isValidGlobal(global)) {

                return -2; // check if the move is invalid
            }

            System.out.print("Enter local coordinate (1-9): ");
            local = sc.nextInt();
            if(isValid.isOutOfBounds(local)) {
                return -2; // check if the move is invalid
            }
            if (!isValid.isValidLocal(global, local)) {

                return -2; // check if the move is invalid
            }

            return 0; // valid input
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a number between 1-9.");
            return -2;
        }
    }

    public static void main(String[] args) {
        Board.initializeBoard();
        Board.printBoard();

        while (true) {
            int inputStatus = input(); // call the input method once
            if (inputStatus == -1) {
                System.out.println("Exiting the game. Goodbye!");
                break; // exit the loop if user enters 'exit'
            }

            if (inputStatus == -2) {
                continue; // prompt user again for valid input
            }

            move = swapMoves(move);

            // Apply the move and update the board
            Board.board[global-1][local-1] = move; // update the board with the current move
            Board.printBoard();

            // Check for a winner
            checkWin.checkWinner(Board.board[global-1], global-1, move);
        }

        sc.close(); // close the scanner
    }
}
