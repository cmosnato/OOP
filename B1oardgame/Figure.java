package B1oardgame;

public class Figure {
    public String name;
    String chesscolor;
    public int xposition;
    public int yposition;

    public Figure(String playername, String chesscolor, int rowcurrentposition, int columncurrentposition) {
        rowcurrentposition -= 1;
        columncurrentposition -= 1;
        this.name = playername;
        this.yposition = columncurrentposition;
        this.xposition = rowcurrentposition;
        this.chesscolor = chesscolor;

    }
    public String getName() {
        return name;
    }

    public String getChesscolor() {
        return chesscolor;
    }

    public int getXposition() {
        return xposition;
    }

    public int getYposition() {
        return yposition;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setChesscolor(String chesscolor) {
        this.chesscolor = chesscolor;
    }
    public void setXposition(int xposition) {
        this.xposition = xposition;
    }
    public void setYposition(int yposition) {
        this.yposition = yposition;
    }

}
