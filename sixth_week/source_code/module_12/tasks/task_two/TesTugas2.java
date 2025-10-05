package sixth_week.source_code.module_12.tasks.task_two;

public class TesTugas2 {
    public static void main(String[] args) {
        Katak o1 = new Katak(5, "Froggy");
        Kecebong o2 = new Kecebong(2, "Junior Frog", 10);

        System.out.println("Objek O1:");
        System.out.println("Nama : " + o1.getNama());
        System.out.println("Umur : " + o1.getUmur());
        System.out.println("Cara Bergerak : " + o1.caraBergerak());

        System.out.println();

        System.out.println("Objek O2: ");
        System.out.println("Nama : " + o2.getNama());
        System.out.println("Umur : " + o2.getUmur());
        System.out.println("Cara Bergerak : " + o2.caraBergerak());
    }
}
