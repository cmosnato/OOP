package Kmircrowave;

public class Main {
    public static void main(String[] args) {
    Microwave1 m = new Microwave1();
    Packfood f = new Packfood("Dog",800, 2);
    m.open();
    m.put(f); 
    m.setup(4);
    m.settimemer(2);
    m.cooking();
    }
}
