class Earphone {
    String Brand;

    Earphone(String Brand) {
        this.Brand = Brand;
    }
}

class Mobile {
    String Brand;
    int Ram;
    Earphone e;

    Mobile(String Brand, int Ram) {
        this.Brand = Brand;
        this.Ram = Ram;
    }

    public void insertEarphone(Earphone e) {
        this.e = e;
    }

    public void removeEarphone() {
        this.e = null;
    }
}

public class EarphoneTest {
    public static void main(String args[]) {
        Mobile m1 = new Mobile("Oppo", 2);
        Mobile m2 = new Mobile("Samsung", 8);

        m1.insertEarphone(new Earphone("Boat"));
        m2.insertEarphone(new Earphone("Oppo"));

        System.out.println(m1.Brand);
        System.out.println(m1.Ram);
        System.out.println(m1.e.Brand);
    }
}
