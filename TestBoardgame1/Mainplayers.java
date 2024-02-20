package TestBoardgame1;

public class Mainplayers {
    public static void main(String[] args) {
        Chessboard b = new Chessboard();
        b.setBoard();
        b.DisplayAllposittion();
        b.FreeMove("BP1","a5");
        b.FreeMove("WP1","a3");
        b.DisplayAllposittion();
        b.FreeMove("WP1","a5");
        b.DisplayAllposittion();
    }
}
