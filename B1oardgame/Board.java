package B1oardgame;

public class Board {
    final public int table = 8;
    public Figure[] players = new Figure[2];
    public String[][] bufferposition = new String[table][table];

    public Board() {
        players[0] = new Figure("P1", "White", 1, 1);
        players[1] = new Figure("P2", "Black", 8, 8);
        for (int i = 0; i < bufferposition.length; i++) {
            for (int j = 0; j < bufferposition[i].length; j++) {
                bufferposition[i][j] = "  ";
            }
        }
        for (Figure figureposition : players) {
            if (figureposition.xposition > table && figureposition.yposition > table) {
                throw new IllegalArgumentException("Error becasue position not > " + table);
            } else if (figureposition.xposition < 0 && figureposition.yposition < 0) {
                throw new IllegalArgumentException("Error becasue position not < 0");

            }
            for (Figure figure : players) {
                bufferposition[figure.xposition][figure.yposition] = figure.name;

            }
            System.out.println("----------Start----------");
        }
    }

    public void setBoard() {
        for (Figure figure : players) {
            System.out.println("Now " + figure.name + " is position " + " Row " + (figure.xposition + 1) + " Column "
                    + (figure.yposition + 1));
        }
    }

    public void freeMove(String namefigure, int xtomove, int ytomove) {
        ytomove--;
        xtomove--;
        // checkmove(positiontomove);
        for (Figure player : players) {
            if ((player.name.equals(namefigure))) {
                if (bufferposition[xtomove][ytomove].equals("  ")) {
                    bufferposition[player.xposition][player.yposition] = "  ";
                    player.setXposition(xtomove);
                    player.setYposition(ytomove);
                    bufferposition[player.xposition][player.yposition] = namefigure;
                    break;
                } else {
                    System.out.println("cannot move "+player.name+" because the position is occupied");
                    return;
                }
            }
        }
    }

    public void DisplayAllposittion() {
        for (int i = 0; i <  bufferposition.length; i++) {
            for (int j = 0; j <  bufferposition[i].length; j++) {
                System.out.printf("|" +bufferposition[i][j]+"|"); 
            }
            System.out.println(); 
        }
    }
    // void checkmove(int checkmoveposition) {
// if ((checkmoveposition < 0)) {
// System.out.println("cannot move because not position -");
// }
// if ((checkmoveposition >= table)) {
// System.out.println("cannot move because have position " + table);
// }
// if (bufferposition[checkmoveposition] != "xx") {
// System.out.println("cannot move because the position is occupied");
// }
// }
}


