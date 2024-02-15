package birdsex;

public class Cbird {
    private String name;
    private int age;
    private String gender;
    Cbird NB ;
    
    public Cbird(String n, String sex, int a) {
        if ((a < 0)) {
            throw new IllegalArgumentException("Errorrrrr Becasue age and num is ");
        }
        if ((sex == "Female") || (sex == "Male")) {
        } else
            throw new IllegalArgumentException("Errorrrrr Becasue Gender must have Female and Male ");
        this.name = n;
        this.age = a;
        this.gender = sex;
    }
    void printBird() {
        System.out.println("-------------------------");
        System.out.println("Name is : " + this.name);
        System.out.println("Age is : " + this.age);
        System.out.println("Gender is : " + this.gender);

    }
 
    Cbird sexbird(Cbird a) {

        if (this.gender == a.gender) {

            throw new IllegalArgumentException("Errorrrrr Becasue age and num is ");

        }

        System.out.println("--------------------- "+this.name+" have Breeding "+a.name+" ---------------------");

        String namenewbird = this.name.substring(0,1)+a.name.substring(0,1);

        Cbird NB = new Cbird(namenewbird,this.gender,0);

        System.out.println("-----------Newborn Bird--------------");

        System.out.println("Name is : " + NB.name);

        System.out.println("Age is : " + NB.age);

        System.out.println("Gender is : " + NB.gender);

        return NB;

    }

}
