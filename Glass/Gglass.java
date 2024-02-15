package Glass;

public class Gglass {public static void main(String[] args) {
    Cglass G1 = new Cglass("cmos",500,300);
    Cglass G2 = new Cglass("cmos1",300,0);
    //G1.Addwater(101);
    //G2.Addwater(350);
    //G1.Poulwater(400);
    //G1.PoulwaterMax();
    //G1.PoulwaterfromGlassAnother(G2,400);
    //G2.PoulwaterfromGlassAnother(G1,0);
    G1.PoulwaterfromGlassAnother(G2,400);
    //G1.PoulwaterMaxfromGlassAnother(G2);
    G2.PoulwaterMaxfromGlassAnother(G1);
    }
}