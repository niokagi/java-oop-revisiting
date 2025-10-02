public class Main {
    public static void main(String[] args) {
        BoxWithMaximumWeight box = new BoxWithMaximumWeight(10);
        Item item1 = new Item("Buku", 5);
        Item item2 = new Item("Pena", 1);
        Item item3 = new Item("Laptop", 8);

        box.add(item1);
        box.add(item2);
        box.add(item3);

        System.out.println("cek isi box dengan kapasitas 10:");
        System.out.println("Buku (berat 5): " + box.isInBox(item1));
        System.out.println("Pena (berat 1): " + box.isInBox(item2));
        System.out.println("Laptop (berat 8): " + box.isInBox(item3));
    }
}