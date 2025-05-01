

public class isValid {
    // This method checks if the move is valid
    static boolean isOutOfBounds(int number) {
        // Check if the global and local coordinates are within bounds
        if (number < 1 || number > 9) {
            System.out.println("\nInvalid move! Coordinates out of bounds. Please enter numbers between 1-9.");
            return true; // Invalid move if out of bounds
        }
        return false; // Valid move if all checks pass
    }
    static boolean isValidGlobal(int global) {
        // Check if the global cell is already occupied
        if (Board.bigBoard[global - 1] != '#') {
            System.out.println("\nInvalid move! Global cell already occupied. Please choose another cell.");
            return false; // Invalid move if global cell is already occupied
        }
        return true; // Valid move if all checks pass
    }
    static boolean isValidLocal(int global, int local) {
        // Check if the local cell is already occupied
        if (Board.board[global - 1][local - 1] != '#') {
            System.out.println("\nInvalid move! Local cell already occupied. Please choose another cell.");
            return false; // Invalid move if local cell is already occupied
        }
        return true; // Valid move if all checks pass
    }
}
