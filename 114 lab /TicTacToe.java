import java.util.Scanner;

public class TicTacToe {
    public static boolean checkRow(char[][] board) {
        for(char[] row: board) {
            String str = "";
            for(char element: row) {
                str+= element;
            }
            if(str.equals("XXX")||str.equals("OOO")) {
                System.out.println(str.equals("XXX") ? "Player one wins" : "Player two wins");
                return true;
            }
        }
        return false;
    }

    public static boolean checkCol(char[][] board) {
        for(int i=0; i<3; i++) {
            String str = "";
            for(char[] row: board) {
                str+= row[i];
            }
            if(str.equals("XXX")||str.equals("OOO")) {
                System.out.println(str.equals("XXX") ? "Player one wins" : "Player two wins");
                return true;
            }
        }
        return false;
    }

    public static boolean checkDiagonal(char[][] board) {
        String major = "", minor = "";
        for(int i=0; i<3; i++) {
            major+=board[i][i];
            minor+=board[i][3-i-1];
        }
        if(major.equals("XXX")||major.equals("OOO")) {
                System.out.println(major.equals("XXX") ? "Player one wins" : "Player two wins");
                return true;
        }
        if(minor.equals("XXX")||minor.equals("OOO")) {
                System.out.println(minor.equals("XXX") ? "Player one wins" : "Player two wins");
                return true;
        } 
        return false;
    }

    public static boolean checkALl(char[][] board) {
        if(checkRow(board) || checkCol(board) || checkDiagonal(board)) {
            return true;
        }
        return false;
    }

    
    public static void main(String[] args) {

        int player = 1, x, y, token = 0;
        boolean flag = false;
        Scanner scan = new Scanner(System.in);

        char[][] board = new char[][] {
                                    {'_', '_', '_'},
                                    {'_', '_', '_'},
                                    {'_', '_', '_'}, 
        };

        do {
            System.out.print("Player "+player+" : ");
            x = scan.nextInt() - 1;
            y = scan.nextInt() - 1;

            if(player==1) {
                board[x][y] = 'X';
                player=2;
                token++;
            }

            if(player==2) {
                board[x][y] = 'O';
                player=1;
                token++;
            }

            for(int i = 0; i<3; i++) {
                for(int j = 0; j<3; j++) {
                    System.out.print(board[i][j]+" ");
                }
                System.out.println();
            } 
            flag = checkALl(board);
        }while(token!=9 &&!flag);
            System.out.println("Draw");
            scan.close();

    }   
}

/*
 * TicTacToe.java: (Playing a TicTacToe game) In a game of TicTacToe, 
 * two players take turns marking an available cell in a 3 x 3 grid with their respective tokens (either X or O). 
 * When one player has placed three tokens in a horizontal, vertical, or diagonal row on the grid, 
 * the game is over and that player has won. 
 * 
 * A draw (no winner) occurs when all the cells on the grid have been filled with tokens and neither player has achieved a win. 
 * Create a program for playing TicTacToe, as follows: The program prompts the first player to enter an X token, 
 * and then prompts the second player to enter an O token. 
 * 
 * Whenever a token is entered, the program refreshes the board (i.e., re-prints the matrix) 
 * and determines the status of the game (win, draw, or unfinished). 
 * To place a token, prompt the user to enter the row and the column for the token.
 
Partian example:
Player one: 1 1
unfinished
X - -
- - -
- - -
 
Player two: 2 2
unfinished
X - -
- O -
- - -
 
Player one: ...
 */