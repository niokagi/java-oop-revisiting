package seventh_week.source_code.module_14;

class Hewan {
    public void bersuara() {
        System.out.println("Hewan mengeluarkan suara...");
    }
}

class Kucing extends Hewan {
    @Override
    public void bersuara() {
        System.out.println("Meow!");
    }
}

class Anjing extends Hewan {
    @Override
    public void bersuara() {
        System.out.println("Guk! Guk!");
    }
}

public class DemoPolimorfisme {
    public static void main(String[] args) {
        Hewan hewanPeliharaan;

        hewanPeliharaan = new Kucing();
        hewanPeliharaan.bersuara();

        hewanPeliharaan = new Anjing();
        hewanPeliharaan.bersuara();
    }
}