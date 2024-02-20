package TestBoardgame1;

public class Figure {
    public String name;
    public boolean isWhite; 
    public String currentposition;
    public int row ;
    public int column ;

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

//     public boolean freeMove(int xrow, int ycolumn, Figure[][] chessboard) {
        
//         if ( xrow < 0 ||  xrow >= chessboard.length || ycolumn < 0 || ycolumn >= chessboard[0].length) {
//             System.out.println("Destination is out of bounds.");
//             return false;
//         }

        
//         if (chessboard[xrow][ycolumn] != null && chessboard[xrow][ycolumn].getColor().equals(this.getColor())) {
//             System.out.println("Destination is occupied by a figure of the same color.");
//             return false;
//         }

       
//         this.setRow(xrow);
//         this.setColumn(ycolumn);
//         return true;
//     }
}


