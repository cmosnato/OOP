package TestBoardgame1;

public class Pawn extends Figure {
    final String Firstposition;

    public Pawn(String pawnName, boolean isWhite, String currentPosition) {
        super(pawnName, isWhite, currentPosition);
        this.Firstposition = currentPosition;

    }

    @Override
    void Move(Chessboard b, String position) {
        int moveRow = 8 - (position.charAt(1) - '0');
        int moveColumn = position.charAt(0) - 'a';
        int currentRow = 8 - (this.getCurrentposition().charAt(1) - '0');
        int currentColumn = this.getCurrentposition().charAt(0) - 'a';
    
        if (moveRow < 0 || moveRow >= b.table || moveColumn < 0 || moveColumn >= b.table) {
            System.out.println("Move position is out of board range.");
            return;}
        
    
        if ((Math.abs(moveRow - currentRow) == 1 && Math.abs(moveColumn - currentColumn) == 1)
                && b.board[moveRow][moveColumn] != null && b.board[moveRow][moveColumn].isWhite() != this.isWhite) {
            b.board[currentRow][currentColumn] = null;
            b.board[moveRow][moveColumn] = this;
            this.setCurrentposition(position);
            System.out.println("Moved " + this.name + " To " + position);
            return;
        } else if ((Math.abs(moveRow - currentRow) == 2 && Math.abs(moveColumn - currentColumn) == 0)
                && this.currentposition.equals(Firstposition) && b.board[moveRow][moveColumn] == null) {
            System.out.println(Firstposition);
            b.board[currentRow][currentColumn] = null;
            b.board[moveRow][moveColumn] = this;
            this.setCurrentposition(position);
            System.out.println("Moved " + this.name + " To " + position);
            return;
        } else if ((Math.abs(moveRow - currentRow) == 1 && Math.abs(moveColumn - currentColumn) == 0)
                && b.board[moveRow][moveColumn] == null) {
            b.board[currentRow][currentColumn] = null;
            b.board[moveRow][moveColumn] = this;
            this.setCurrentposition(position);
            System.out.println("Moved " + this.name + " To " + position);
            return;
        } 
    }

    // public void movePawm(Chessboard b, int moveRow, int moveColumn) {
    // b.board[currentRow][currentColumn] = null;
    // b.board[moveRow][moveColumn] = this;
    // this.setCurrentposition(position);
    // System.out.println("Moved " + this.name + " To " + position);

    // }

    @Override
    void updateMoveableList(Chessboard board) {

    }
}
