package TestBoardgame1;

public class Mainplayers {
    public static void main(String[] args) {
        Chessboard b = new Chessboard();
        b.setBoard();
        // b.FreeMove("BP2","a8");
        // b.DisplayAllposittion();
        // b.MoveFigure("WB1", "g7");
        b.DisplayAllposittion();
        b.MoveFigure("WB1", "h8");
        // b.DisplayAllposittion();
        // b.MoveFigure("BB1", "f6");
        // b.DisplayAllposittion();
        // b.MoveFigure("WB2", "a1");
        // b.DisplayAllposittion();
        // b.MoveFigure("WB2", "b2");
        b.DisplayAllposittion();
        // b.MoveFigure("WB2", "f6");
        // b.DisplayAllposittion();
        // b.FreeMove("BP1","a5");
        // b.DisplayAllposittion();
        // b.FreeMove("WP1","a3");
        // b.DisplayAllposittion();
        // b.FreeMove("WP1","a5");
        // b.DisplayAllposittion();
        // b.FreeMove("WP2","a5");
        // b.DisplayAllposittion();
    }
}
