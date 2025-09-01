public class Mahasiswa {
	// atribut
	String nama;
	String nrp;

	public Mahasiswa (String nama, String nrp){
		this.nama = nama;
		this.nrp = nrp;
	}
	// method
	public void belajar() {
		System.out.println(this.nama + " sedang belajar..");
	}
	public static void main(String args[]) {
		Mahasiswa mhs1 = new Mahasiswa("Adhim", "3124510109");

		System.out.println("obyek mhs1 dibuat..");
		mhs1.belajar();
	}
}
