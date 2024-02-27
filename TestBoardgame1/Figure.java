package TestBoardgame1;

import java.util.ArrayList;

public abstract class Figure {
    public String name;
    public boolean isWhite; 
    public String currentposition;
    ArrayList<String> moveableList = new ArrayList<String>();

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

    abstract void Move(Chessboard board, String position);

    abstract void updateMoveableList(Chessboard board);
}

