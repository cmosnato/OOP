package TestBoardgame1;

public class Chessboard {
    final public int table = 8;
    public Figure[][] board = new Figure[table][table];

    public Chessboard() { 

    }
    public void setBoard(){
        board[0][0]= new Pawn("WP1",true,"a1");
        board[0][1]= new Pawn("WP2",true,"b1");
        board[0][2]= new Pawn("WP3",true,"c1");
        board[0][3]= new Pawn("WP4",true,"d1");
        board[0][4]= new Pawn("WP5",true,"e1");
        board[0][5]= new Pawn("WP6",true,"f1");
        board[0][6]= new Pawn("WP7",true,"g1");
        board[0][7]= new Pawn("WP8",true,"h1");
        board[7][0]= new Pawn("BP1",false,"a1");
        board[7][1]= new Pawn("BP2",false,"b1");
        board[7][2]= new Pawn("BP3",false,"c1");
        board[7][3]= new Pawn("BP4",false,"d1");
        board[7][4]= new Pawn("BP5",false,"e1");
        board[7][5]= new Pawn("BP6",false,"f1");
        board[7][6]= new Pawn("BP7",false,"g1");
        board[7][7]= new Pawn("BP8",false,"h1");
    }
    public void DisplayAllposittion() {
        for (int i = 0; i < board.length; i++) {
            System.out.print("| "); 
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] != null) {
                    System.out.print(board[i][j].getName() + " "); 
                } else {
                    System.out.print("xxx ");
                }
            }
            System.out.println("|"); 
        }
    }
    public void FreeMove(String namefigure,String position){

    }
}
