package Bird1;

public class Birdd {
    String name;
    int age;
    int body;
    int stomach;
    boolean sp;
    String gender;
    Birdd NB;

    public Birdd(String name, int age, int body, int stomach, String gender, boolean sp) {
        this.name = name;
        this.age = age;
        this.body = body;
        this.stomach = stomach;
        this.sp = sp;
        this.gender = gender;
    }

    void talk(String mes) {
        System.out.println(mes);
    }

    void talk() {
        System.out.println("age: " + this.age + " years");
    }

    public void eat(int food) {
        if (food <= body) {
            stomach = stomach + food;
            if (stomach <= body) {
                System.out.println("weight of stomach = " + this.stomach + " grams");
            } else {
                stomach = 0;
                System.out.println("take out stomach = " + this.stomach + " grams");
            }
        }
    }

    public void pop(int pop) {
        if (pop > 0 && pop <= getStomach() && !getSp()) {
            stomach = stomach - pop;
            System.out.println("pop normal = " + pop);
            System.out.println("stomach = " + getStomach());
        } else if (getSp() && pop > 0 && pop <= getStomach()) {
            stomach = stomach - pop;
            System.out.println("pop food = " + pop);
            System.out.println("stomach = " + getStomach());
        }
    }

    void printBird() {
        System.out.println("-------------------------");
        System.out.println("Name is: " + this.name);
        System.out.println("Age is: " + this.age);
        System.out.println("Gender is: " + this.gender);
    }

    Birdd sexBird(Birdd a) {
        if (this.gender.equals(a.gender)) {
            throw new IllegalArgumentException("Error! Birds have the same gender.");
        }

        System.out.println(
                "--------------------- " + this.name + " is breeding with " + a.name + " ---------------------");

        String newName = this.name.substring(0, 1) + a.name.substring(0, 1);

        Birdd newBird = new Birdd(newName, 0, 2, 1, this.gender, false);

        System.out.println("-----------Newborn Bird--------------");
        System.out.println("Name is: " + newBird.name);
        System.out.println("Age is: " + newBird.age);
        System.out.println("Gender is: " + newBird.gender);

        return newBird;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getStomach() {
        return stomach;
    }

    public int getBody() {
        return body;
    }

    public boolean getSp() {
        return sp;
    }
}
