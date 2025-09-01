import javax.swing.JOptionPane;

public class KonversiSuhu {
	public static double hitungCF(double celcius){
		return (celcius * 9/5) + 32;
	}

	public static void main(String args[]){
		try {
			String str = JOptionPane.showInputDialog("Masukkan nilai: ");
			double nilaiC = Double.parseDouble(str);
			double hasilF = hitungCF(nilaiC);

			JOptionPane.showMessageDialog(
				null, 
				"Hasilnya: \n" + nilaiC + "° Celcius = " + hasilF + "° Fahrenheit"
			);
		} catch (NumberFormatException e){
			JOptionPane.showMessageDialog(null, "Input tidak valid!");
		}
	}
}