package Kmircrowave;

public class Microwave1 {
    String fname;
    int levelwatt;
    int time;
    int checkopen, checkinside;

    public Microwave1() {

    }

    void open() {
        System.out.println("Open microwave");
        checkopen += 1;
    }

    public void put(Packfood a) {
        this.fname = a.namef;
        this.levelwatt = a.fwatt;
        this.time = a.ftime;
        if (checkopen == 0) {
            System.out.println("Can not cooking food Because Micro is close");
        } else if ((checkopen == 1)&&(checkinside==0)) {
            System.out.println(this.fname + " put into Microwave");
            checkinside+=1;
        }else if ((checkinside==1)) {
            System.out.println("Can not cooking food Because have food inside microwave");
        }
    }

    public void setup(int a) {
        if (a == 4) {
            this.levelwatt = 800;
        } else if (a == 3) {
            this.levelwatt = 600;
        } else if (a == 2) {
            this.levelwatt = 400;
        } else if (a == 1) {
            this.levelwatt = 200;
        }else 
            System.out.println("Have levelwatt 1-4");
        System.out.println("set levelwatt Microwave : " + a + "(" + this.levelwatt + ")");

    }

    public void settimemer(int b) {
        this.time = b;
        System.out.println("set timer Microwave : " + this.time + " second");

    }

    public void close() {
        System.out.println("close microwave");
        System.out.println();

    }
    public void cooking(){
        int check=this.time;
        int i =0;
        int cookf=this.time*this.levelwatt;
        int wellf=(Packfood.ftime)*(Packfood.fwatt);
        while (i<=check) {
            float pCook=(float)(i*cookf)/this.time;
            float pfood=(pCook/wellf)*100;
            System.out.println(i+" second "+"cooking "+pfood+"%");
            i+=1;
        }
    }
}
