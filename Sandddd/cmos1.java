package cm;

public class cmos1 {
    int sandA;
    int sandB;
    int sideA;

    public cmos1(int SandA, int SandB, int SideA) {
        System.out.println("start = SandA : " + SandA + " g " + " SandB : " + SandB + " g " + " Side : " + SideA);
        if ((SandA < 0) || (SandB < 0) || (SideA <= 0)) {
            System.out.println("------------------------------------------------------");
            throw new IllegalArgumentException("Errorrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr");
        }
        {
            if ((SandA % 1000 > 0)) {
                System.out.println("------------------------------------------------------");
                throw new IllegalArgumentException("Error");
            }else if(SandB % 1000 > 0){
                System.out.println("------------------------------------------------------");
                throw new IllegalArgumentException("Error");
            }
        }
        sandA = SandA;
        sandB = SandB;
        sideA = SideA;
        if ((sideA == 1 && sandA > 0) ) {
            System.out.println("Sand is on A");
            sandgo();
        }else if ((sideA == 3 && sandB > 0)) {
            System.out.println("Sand is on B");
            sandgo();
        }
    }

    public void rt90() {
        System.out.println("rt90 side before : " + sideA);
        if (sideA == 4)
            sideA = 1;
        else
            sideA++;
        System.out.println("rt90 side now : " + sideA);
        sandgo();
    }

    public void rt180() {
        System.out.println("rt180 side before : " + sideA);
        for (int i = 0; i <= 1; i++) {
            if (sideA == 4) {
                sideA = 1;
            } else
                sideA++;
        }
        System.out.println("rt180 side now : " + sideA);
        sandgo();
    }

    public void sandgo() {
        if ((sideA == 1 && sandA > 0)) {
            while (sandA > 0) {
                System.out.println("SandA : " + sandA + " SandB : " + sandB + " g ");
                sandA -= 1000;
                sandB += 1000;
            }
            System.out.println("SandA : " + sandA + " SandB : " + sandB + " g ");
            System.out.println("Sand in B");
        } else if ((sideA == 3 && sandB > 0)) {
            while (sandB > 0) {
                System.out.println("SandA : " + sandA + " SandB : " + sandB + " g ");
                sandB -= 1000;
                sandA += 1000;
            }
            System.out.println("SandA : " + sandA + " SandB : " + sandB + " g ");
            System.out.println("Sand in A");
        }
    }

    public int sumSand() {
        int sand = sandA + sandB;
        return sand;
    }

}
