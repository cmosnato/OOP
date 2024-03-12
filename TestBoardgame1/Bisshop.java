package TestBoardgame1;

public class Bisshop extends Figure {

    public Bisshop(String playername, boolean isWhite, String currentposition) {
        super(playername, isWhite, currentposition);

    }

    @Override
    void Move(Chessboard b, String position) {
        int moveRow = (position.charAt(1) - '0') - 1;
        int moveColumn = position.charAt(0) - 'a';
        int currentRow = (this.getCurrentposition().charAt(1) - '0') - 1;
        int currentColumn = this.getCurrentposition().charAt(0) - 'a';
        if (moveRow < 0 && moveRow >= b.table && moveColumn < 0 && moveColumn > b.table) {
            System.out.println("Move position is out of board range.");
            return;
        } else if (Math.abs(moveRow - currentRow) != Math.abs(moveColumn - currentColumn)) {
            System.out.println(
                    "Cannot move " + this.getName() + " to " + position + " because it can only move diagonally.");
            return;
        } else if (b.board[moveRow][moveColumn] == null || b.board[moveRow][moveColumn].isWhite() != this.isWhite()) {
            int rowDirection = (moveRow - currentRow > 0) ? 1 : -1;
            int columnDirection = (moveColumn - currentColumn > 0) ? 1 : -1;
            int checkRow = currentRow + rowDirection;
            int checkColumn = currentColumn + columnDirection;
            while (checkRow != moveRow && checkColumn != moveColumn && checkColumn > 0 && checkRow > 0) {
                if (b.board[checkRow][checkColumn] != null
                        && b.board[checkRow][checkColumn].isWhite() == this.isWhite) {
                    System.out.println("Cannot move " + this.getName() + " to " + position + " because the path "
                            + b.board[checkRow][checkColumn].name + " is blocked.");
                    return;
                }
                if (b.board[checkRow][checkColumn] != null) {
                    System.out.println(
                            "Cannot move " + this.getName() + " to " + position + " because the path is blocked.");
                    return;
                }
                checkRow += rowDirection;
                checkColumn += columnDirection;
            }
            

        }

    }

    void updateMoveableList(Chessboard brd) {
    }
}    
