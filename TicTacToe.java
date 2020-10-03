import java.util.Scanner;

public class TicTacToe {

    String[] board = new String[10];
    String turn;
    Scanner scanner;

    public static void main(String[] args) {

        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.creatingBoard();
        
    }

    //UC1 - Creating empty board
    public void creatingBoard() {
        for(int indexValue = 0; indexValue <= 9; indexValue++) {
            board[indexValue] = " ";
        }

    }
}

