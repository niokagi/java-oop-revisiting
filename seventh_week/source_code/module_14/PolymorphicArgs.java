package seventh_week.source_code.module_14;

class ProsesorHewan {
    public void prosesSuara(Hewan hewan) {
        System.out.print("Memproses suara dari hewan: ");
        hewan.bersuara();
    }
}

public class PolymorphicArgs {
    public static void main(String[] args) {
        ProsesorHewan prosesor = new ProsesorHewan();
        Kucing kucingSaya = new Kucing();
        Anjing anjingSaya = new Anjing();

        prosesor.prosesSuara(kucingSaya);
        prosesor.prosesSuara(anjingSaya);
    }
}