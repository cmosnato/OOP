package Boardgame;

public class Board {
    final public int table = 10;
    public Figure[] players = new Figure[2];
    public String[] bufferposition = new String[table];

    public Board() {
        players[0] = new Figure("Cmos", 1);
        players[1] = new Figure("Cmark", 2);
        for (int i = 0; i < bufferposition.length; i++) {
            bufferposition[i]="xx";
        }
        for (Figure figureposition : players) {
            if (figureposition.currentposition>table) {
                throw new IllegalArgumentException("Error becasue position not > "+table);
            } else if (figureposition.currentposition<0) {
                throw new IllegalArgumentException("Error becasue position not < 0");
                
            }
            for (Figure figure : players) {
             bufferposition[figure.currentposition]=figure.name;
            
        }
        System.out.println("----------Start----------");
    }
}

    public void setBoard() {
        for (Figure figure : players) {
            System.out.println("Now " + figure.name + " is position " + (figure.currentposition + 1));
        }
    }

    public void Move(String namefigure, int positiontomove) {
        positiontomove--;
        checkmove(positiontomove);
        for (Figure player : players) {
            if ((player.name.equals(namefigure)) && (bufferposition[positiontomove] == "xx")) {
                bufferposition[player.currentposition] = "xx";
                player.setPosition(positiontomove);
                bufferposition[player.currentposition] = namefigure;
                break;
            }
        }
    }

    public void DisplayAllposittion() {
        for (String x : bufferposition) {
            System.out.print("|" + x + "|");

        }
        System.out.println(" ");
    }

    void checkmove(int checkmoveposition) {
        if ((checkmoveposition < 0)) {
            System.out.println("cannot move because not position -");
        }
        if ((checkmoveposition >= table)) {
            System.out.println("cannot move because have position " + table);
        }
        if (bufferposition[checkmoveposition] != "xx") {
            System.out.println("cannot move because the position is occupied");
        }
    }
}
