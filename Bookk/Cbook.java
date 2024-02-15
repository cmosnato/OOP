package Bookk;

public class Cbook {
    int Allpage;
    String Namebook;
    int page;
    int bookmark;

    public Cbook(int AP, String Nb, int P) {
        if ((AP <= 0) || (P <= 0) || (P > AP)) {
            System.out.println("------------------------------------------------------");
            throw new IllegalArgumentException("Errorrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr");
        }
        Allpage = AP;
        Namebook = Nb;
        page = P;
        bookmark = 0;
        System.out.println("Start No Bookmark");
        System.out.println("Start page is : " + page);
    }

    public void Openfirst() {
        page = 1;
        System.out.println("Now go to First page : " + page);
    }

    public void Openlast() {
        page = Allpage;
        System.out.println("Now go to Last page : " + page);
    }

    public void Selectpage(int cpage) {
        if ((cpage > Allpage) || (cpage <= 0)) {
            System.out.println("No page : " + cpage + " Because Allpage have : " + Allpage);
        } else {
            page = cpage;
            System.out.println("Now go to page : " + page);
        }
    }

    public void SelectBookmark(int pagebm) {
        if ((pagebm > Allpage) || (pagebm < 0)) {
            System.out.println("Not bookmartpage : " + pagebm + " Because Allpage have : " + Allpage);
        } else {
            bookmark = pagebm;
            System.out.println("SelectBookmark is : " + bookmark);
        }
    }

    public void OpenBookmart() {
        page = bookmark;
        System.out.println("Now go to bookmark  : " + bookmark);
    }

    public void Nextpage() {
        if (page == Allpage) {
            System.out.println("Not Nextpage Because " + page + " is lastpage");
        } else {
            page++;
            System.out.println("Nextpage to : " + page);
        }
    }

    public void Backpage() {
        if (page == 1) {
            System.out.println("Not Backpage Because " + page + " is firstpage");
        } else {
            page--;
            System.out.println("Backpage to : " + page);
        }
    }

    public void DisplayAllpage() {
        System.out.println("All page : " + Allpage);
    }

    public void DisplayNowpage() {
        System.out.println("Now page : " + page);
    }

    public void DisplayBookmart() {
        System.out.println("Now bookmart : " + bookmark);
    }
}