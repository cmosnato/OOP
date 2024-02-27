package TestBoardgame1;

public class Chessboard {
    final public int table = 8;
    public Figure[][] board = new Figure[table][table];
    char[] letters = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h' };

    public Chessboard() {
        setBoard();
    }

    public void setBoard() {
        board[5][5]= new Bisshop("WB1", true, "f6");
        board[4][4]= new Bisshop("WB2", true, "e5");
        board[7][7]= new Bisshop("BB1", false, "h8");
        // board[7][0] = new Pawn("WP1", true, "a1");
        // board[7][1] = new Pawn("WP2", true, "b1");
        // board[7][2] = new Pawn("WP3", true, "c1");
        // board[7][3] = new Pawn("WP4", true, "d1");
        // board[7][4] = new Pawn("WP5", true, "e1");
        // board[7][5] = new Pawn("WP6", true, "f1");
        // board[7][6] = new Pawn("WP7", true, "g1");
        // board[7][7] = new Pawn("WP8", true, "h1");
        // board[0][0] = new Pawn("BP1", false, "a8");
        // board[0][1] = new Pawn("BP2", false, "b8");
        // board[0][2] = new Pawn("BP3", false, "c8");
        // board[0][3] = new Pawn("BP4", false, "d8");
        // board[0][4] = new Pawn("BP5", false, "e8");
        // board[0][5] = new Pawn("BP6", false, "f8");
        // board[0][6] = new Pawn("BP7", false, "g8");
        // board[0][7] = new Pawn("BP8", false, "h8");
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
            System.out.print(i+1 + " ");
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

    public void FreeMove(String namefigure, String position) {
        int moveRow = (position.charAt(1) - '0') - 1;
        int moveColumn = position.charAt(0) - 'a';
        String checkstring = namefigure.substring(0, 1);
        System.out.println(checkstring);
        if (moveRow >= 0 && moveRow < 8 && moveColumn >= 0 && moveColumn < 8) {
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[i].length; j++) {
                    Figure figure = board[i][j];
                    if (figure != null && figure.getName().equals(namefigure)) {
                        int row = (board[i][j].getCurrentposition().charAt(1) - '0') - 1;
                        int col = board[i][j].getCurrentposition().charAt(0) - 'a';
                        if (board[moveRow][moveColumn] == null
                                || !board[moveRow][moveColumn].getName().substring(0, 1).equals(checkstring)) {
                            board[row][col] = null;
                            board[moveRow][moveColumn] = figure;
                            figure.setCurrentposition(position);
                            System.out.println(figure.getCurrentposition());
                            System.out.println();
                            return;
                        } else {
                            System.out.println("Cannot move " + namefigure + " because the position is occupied.");
                            return;
                        }
                    }
                }
            }
        } else {
            System.out.println("Move position is out of board range.");
        }
    }

    public void MoveFigure(String namefigure, String position) {
        System.out.println("Move " + namefigure + " To " + position);
        boolean found = false;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == null) {
                    continue;
                }
                if (board[i][j] != null && board[i][j].getName().equals(namefigure)) {
                    found = true;
                    board[i][j].Move(this, position);
                    break;
                }
            }

        }
        if (found == false) {
            System.out.println("Figure '" + namefigure + " Don't Have ");
        }
    }
}
