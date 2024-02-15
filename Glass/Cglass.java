package Glass;

public class Cglass {
    String name;
    int maxglass;
    int waterglass;

    public Cglass(String N, int Mg, int Wg) {
        if ((Mg < 0) || (Wg < 0) || (Mg < Wg)) {// เช็คว่าinputมีค่าติดลบหรือน้ำที่มีในแก้วน้อยกว่าMaxแก้วไหม
            System.out.println("------------------------------------------------------");
            throw new IllegalArgumentException("Errorrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr");
        }
        name = N;
        maxglass = Mg;
        waterglass = Wg;
        Print();
    }

    // เติมน้ำ
    void Addwater(int v) {
        if (v < 0) {// เช็คว่าinputติด-ไหม
            throw new IllegalArgumentException("Can not to water be - ");
        }
        System.out.println("Addwater");
        if (waterglass + v > maxglass) {// เช็คว่าน้ำในแก้วกับน้ำที่จะเทเช้ามามากกว่าMaxแก้วไหม
            waterglass = (waterglass + v) - maxglass;// ต่อจากข้อความบน ถ้ามากกว่าจะมีการเกิดน้ำล้นแต่ก็สามารถเติมได้
            System.out.println("RunningWater out |" + this.name + "| glass is : " + waterglass);// อันนี้คือปริ้นน้ำที่ล้นออกมาก
            waterglass = maxglass;
            System.out.println("After add Water in |" + this.name + "| glass is : " + waterglass);
        } else {
            waterglass = waterglass + v;
            System.out.println("After add Water in |" + this.name + "| glass is : " + waterglass);
        }
        Print();
    }

    // เติมน้ำเต็มแก้ว
    void AddwaterMax() {
        System.out.println("AddwaterMax");
        if (maxglass == waterglass) {// เช็คว่าน้ำเต็มแก้วไหม
            System.out.println("Cannot to add water |" + this.name + "| glass ");
        } else {
            waterglass = maxglass;
            System.out.println("AddWaterMax in |" + this.name + "|glass is max : " + waterglass);
        }
        Print();
    }

    // เทน้ำ
    void Poulwater(int v) {
        if (v < 0) {// เช็คว่าinputติด-ไหม
            throw new IllegalArgumentException("Can not to water be - ");
        }
        System.out.println("Poulwater");
        if (waterglass < v) {// เช็คว่าinputน้ำที่จะเทมากกว่าน้ำในแก้วไหม
            System.out.println("Can pour Water in |" + this.name + "| glass is only " + Getwater());
            waterglass = 0;
            System.out.println("After pour Water in |" + this.name + "| glass is  " + waterglass);

        } else {
            waterglass = waterglass - v;
            System.out.println("After pour Water in |" + this.name + "| glass is  " + waterglass);
        }
        Print();
    }

    // เทน้ำหมดแก้ว
    void PoulwaterMax() {
        System.out.println("PoulwaterMax");
        if ((waterglass == 0)) {// เช็คน้ำน้ำมีไหม
            System.out.println("Cannot to poul waterMax in |" + this.name + "|glass ");
        } else {
            waterglass = 0;
            System.out.println("PoulWaterMax in |" + this.name + "|glass is  : " + waterglass);
        }
        Print();
    }

    // เทน้ำจากแก้วนึงไปแก้วนึง
    void PoulwaterfromGlassAnother(Cglass g, int v) {
        if ((v > this.maxglass)) {// เช็คinputน้ำว่ามากกว่าMaxแก้วไหม
            System.out.println("Cannot to poul water because water in Glass will poul > max water  poul ");
            throw new IllegalArgumentException("Erorrrrrrrrrrrrrrrrrrrrrr ");
        }
        System.out.println("PoulwaterfromGlassAnother");
        this.Poulwater(v);
        g.Addwater(v);
        this.Print();
        g.Print();
        // เทน้ำหมดแก้วจากแก้วนึงไปแก้วนึง
    }

    void PoulwaterMaxfromGlassAnother(Cglass g) {
        System.out.println("PoulwaterMaxfromGlassAnother");
        g.Addwater(Getwater());// ที่ใส่เป็นGetwater เพราะจะเก็บค่าน้ำที่มีอยู่ในแก้ว
                               // ไม่สามารถใช้ตัวแปรที่เก็บจน.น้ำในแก้วได้ด้วยตรง งงอ่านที่ฟังชั่น
        this.PoulwaterMax();
        this.Print();
        g.Print();
    }

    void Print() {// ชื่อตรงตัว
        System.out.println("Glass |" + name + "| Max Glass : " + maxglass + " Now water in glass : " + waterglass);
        System.out.println("---------------------------------------------------------------------------");
    }

    public int Getwater() {// เก็บค่าน้ำในแก้วไว้สำหรับเทไปอีกแก้วนึงหมดตามจนใที่แก้วที่จะเทไปมี
        return waterglass;
    }
}
