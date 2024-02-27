package B1oardgame;

public class Main {
    public static void main(String[] args) {
        Board G = new Board();
        Figure A = new Figure("WP1", true,"a1");
        Figure B = new Figure("WP2", true,"a2");
        Figure C = new Figure("BP1", false,"a8");
        G.addFigure(A);
        G.addFigure(B);
        G.addFigure(C);
        G.DisplayAllposittion();
        A.freemove("b8", G);
        G.DisplayAllposittion();
    }
}
