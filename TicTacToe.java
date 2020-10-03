import java.util.Scanner;

public class TicTacToe {

    String[] board = new String[10];
    String turn;
    Scanner scanner;

    public static void main(String[] args) {

        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.creatingBoard();
        ticTacToe.showBoard();
        ticTacToe.playerTurn();
    }

    //UC1 - Creating empty board
    public void creatingBoard() {
        for(int indexValue = 0; indexValue <= 9; indexValue++) {
            board[indexValue] = String.valueOf(indexValue);
        }
        System.out.println(board.toString());

    }

    //UC2 - Choosing tokens
    public void playerTurn() {
        String playerToken, computerToken;
        scanner = new Scanner(System.in);
        System.out.println("Choose x or o: ");
        if(scanner.nextLine().equals("x")) {
            playerToken = scanner.nextLine();
            computerToken = "o";
        } else if (scanner.nextLine().equals("x")){
            playerToken = scanner.nextLine();
            computerToken = "x";
        } else {
            System.out.println("Invalid option");
        }


    }

    //UC3 - Display board
    public void showBoard() {
            System.out.println(board[1] + "  |  " + board[2] + "  |  " + board[3]);
            System.out.println("-------------");
            System.out.println(board[4] + "  |  " + board[5] + "  |  " + board[6]);
            System.out.println("-------------");
            System.out.println(board[7] + "  |  " + board[8] + "  |  " + board[9]);
    }
}

