package B1oardgame;

public class Figure {
    public String name;
    public boolean isWhite;
    public String currentposition;
    public int row;
    public int column;

    public Figure(String playername, boolean isWhite, String currentposition) {
        this.name = playername;
        this.isWhite = isWhite;
        this.currentposition = currentposition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return isWhite ? "White" : "Black";
    }

    public void setColor(boolean isWhite) {
        this.isWhite = isWhite;
    }

    public String getCurrentposition() {
        return currentposition;
    }

    public void setCurrentposition(String currentposition) {
        this.currentposition = currentposition;
    }

    public boolean isWhite() {
        return isWhite;
    }

    public void setWhite(boolean isWhite) {
        this.isWhite = isWhite;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public void freemove(String position, Board board) {
        int moveRow = (position.charAt(1) - '0') - 1;
        int moveColumn = position.charAt(0) - 'a';
        String checkstring = this.name.substring(0, 1);
        if (moveRow >= 0 && moveRow < 8 && moveColumn >= 0 && moveColumn < 8) {
            if (board.board[moveRow][moveColumn] == null
                    || !board.board[moveRow][moveColumn].getName().substring(0, 1).equals(checkstring)) {
                board.board[(this.getCurrentposition().charAt(1) - '0') - 1][this.getCurrentposition().charAt(0) - 'a']=null;
                this.setCurrentposition(position);    
                board.board[moveRow][moveColumn] = this;
                System.out.println(this.currentposition);
            } else
                System.out.println("Cannot move " + this.getName() + " because the position will move is same color");

        }

    }
}
