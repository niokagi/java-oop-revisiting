public class TestAnimal {
    public static void main(String args[]) {
        Binatang loveBird = new Burung();
        Binatang cat = new Mamalia();
        Binatang dolphin = new Mamalia();

        loveBird.bernafas();
        loveBird.makan();
        loveBird.berkembangBiak();

        cat.bernafas();
        cat.makan();
        cat.berkembangBiak();

        dolphin.berkembangBiak();
    }
}
