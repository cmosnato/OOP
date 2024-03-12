package TestBoardgame1;

public class Mainplayers {
    public static void main(String[] args) {
        Chessboard b = new Chessboard();
        b.setBoard();
        // b.FreeMove("BP2","a8");
        // b.DisplayAllposittion();
        b.DisplayAllposittion();
        // b.MoveFigure("BP1", "a6");
        // b.MoveFigure("BP1", "a5");
        // b.MoveFigure("BP1", "a4");
        b.MoveFigure("WP1", "a3");
        b.MoveFigure("WP1", "a4");
        b.MoveFigure("WP1", "a5");
        // b.MoveFigure("WP1", "b6");
        // b.MoveFigure("WP2", "b3");
        b.MoveFigure("BP2", "b6");
        b.MoveFigure("BP2", "a5");
        b.DisplayAllposittion();
        // b.MoveFigure("WP1", "b3");
        // b.MoveFigure("WP1", "a5");
        // b.MoveFigure("WP2", "b2");
        // b.MoveFigure("BP2", "b6");
        // b.MoveFigure("BP2", "a5");
        // b.MoveFigure("WP1", "a4");
        // b.MoveFigure("WP1", "a4");
        // b.MoveFigure("WP1", "a3");
        // b.MoveFigure("BP2", "b2");
        // b.MoveFigure("BP2", "a3");
        // b.DisplayAllposittion();
        // b.MoveFigure("BB1", "d4");
        // b.DisplayAllposittion();
        // b.MoveFigure("WB2", "a1");
        // b.DisplayAllposittion();
        // b.MoveFigure("WB2", "b2");
        // b.DisplayAllposittion();
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
