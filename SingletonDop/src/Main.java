import enumS.Sun;

public class Main {

    public static void main(String[] args) {
	enumS.Sun sun1 = Sun.unSun;
    sun1.decay(); sun1.turnover(); sun1.destruction(); System.out.println(sun1.isExistence());
        System.out.println();
    Double_Checked_Locking.Sun sun2 = Double_Checked_Locking.Sun.getInstance();
    sun2.decay(); sun2.turnover(); sun2.destruction(); System.out.println(sun2.isExistence());
        System.out.println();
    Lazy_Initialization.Sun sun3 = Lazy_Initialization.Sun.getInstance();
    sun3.decay(); sun3.turnover(); sun3.destruction(); System.out.println(sun3.isExistence());
    }
}
