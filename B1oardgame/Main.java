package B1oardgame;

public class Main {
    public static void main(String[] args) {
        Board G = new Board();
        G.DisplayAllposittion();
        G.setBoard();
        G.freeMove("P1", 6, 6);
        G.freeMove("P2", 6, 6);
        G.DisplayAllposittion();
        G.setBoard();
    }
}
