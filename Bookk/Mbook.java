package Bookk;

public class Mbook {
    public static void main(String[] args) {
    Cbook cm = new Cbook(10,"cmos",1);
    cm.DisplayNowpage();
    cm.DisplayBookmart();
    cm.DisplayAllpage();
    cm.Openlast();
    cm.Openfirst();
    cm.Backpage();
    cm.Nextpage();          
    cm.SelectBookmark(0);
   // cm.Selectpage(10);
   // cm.Nextpage();
   // cm.Backpage();
    //cm.OpenBookmart();
   // cm.DisplayNowpage();
   // cm.DisplayBookmart();

    }
    
}
