package third_week.source_codes.module_6.practices;

public class Shape {
    public double length;
    public double width;
    public double height;
    public double volume;

    // construct
    public Shape(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.calculateVolume();
    }

    private void calculateVolume() {
        this.volume = this.length * this.width * this.height;
    }

    public double compareTo(Shape otherShape) {
        return Math.abs(this.volume - otherShape.volume);
    }

    public void cetak() {
        System.out.println("Detail Shape");
        System.out.println("Panjang: " + this.length);
        System.out.println("Lebar  : " + this.width);
        System.out.println("Tinggi : " + this.height);
        System.out.println("Volume : " + this.volume);
        System.out.println("_____________________");
    }
}