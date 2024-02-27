package B1oardgame;

public class Board {
    final public int table = 8;
    public Figure[][] board = new Figure[table][table];
    char[] letters = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h' };


    public Board() {
    }
    public void DisplayAllposittion() {
        System.out.print("  ");
        for (int i = 0; i < table; i++) {
            System.out.print("   ");
            System.out.print(letters[i]);
        }
        System.out.println();
        System.out.println("--------------------------------------------------------");
        for (int i = 0; i < board.length; i++) {
            System.out.print(i + 1 + " ");
            System.out.print("| ");
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] != null) {
                    System.out.print(board[i][j].getName() + " ");
                } else {
                    System.out.print("xxx ");
                }
            }
            System.out.println("|");
        }
    }
    public void addFigure(Figure input){
        int inputRow = (input.currentposition.charAt(1) - '0') - 1;
        int inputColumn =input.currentposition.charAt(0) - 'a';
        if (inputRow >= 0 && inputRow < table && inputColumn >= 0 && inputColumn < table) {
            if (board[inputRow][inputColumn]==null) {
                board[inputRow][inputColumn]=input;
            }
            else System.out.println("the position is occupied");
        }
        else System.out.println("position error ");
    }
}


