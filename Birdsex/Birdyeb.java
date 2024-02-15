package Birdsex;
public class Birdyeb {
    public static void main(String[] args) {
        Cbird B1 = new Cbird("Real","Female",2);
        Cbird B2 = new Cbird("Cartoon","Female",2);
        B1.printBird();
        B2.printBird();
        B2.sexbird(B1);
        B1.sexbird(B2);
    }
    
}

