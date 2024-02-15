package Boardgame;

public class Mainplayer {
    public static void main(String[] args) {
    Board G = new Board();
    // G.players[0] = new Figure("Cmos", 11);
    // G.players[1] = new Figure("Cmark", 2);
    G.DisplayAllposittion();
    G.setBoard();
    G.DisplayAllposittion();
    G.Move("Cmos", 5);
    G.Move("Cmark", 10);
    G.DisplayAllposittion();
    G.setBoard();
    // G.Move("Cmark", 11);
    // G.DisplayAllposittion();
    }
}

