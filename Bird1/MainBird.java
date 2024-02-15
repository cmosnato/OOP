package Bird1;

public class MainBird {
    public static void main(String[] args) {
        Birdd B1 = new Birdd("Meaw", 5, 10, 2, "Male", true);
        Birdd B2 = new Birdd("Hello", 7, 10, 2, "Female", false);
        B1.talk("cmos");
        B1.talk();
        B1.eat(7);
        B1.pop(5);
        //นกตัวที่2
        B2.talk("maew");
        B2.talk();
        B2.eat(8);
        B2.pop(8);
        //นกคลอดลูก
        B1.printBird();
        B2.printBird();
        B2.sexBird(B1);
        B1.sexBird(B2);

    }

}
