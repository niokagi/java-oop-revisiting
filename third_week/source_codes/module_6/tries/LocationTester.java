package third_week.source_codes.module_6.tries;

public class LocationTester {   
    public static void main(String[] args) {
        Location surabaya = new Location(112.7521, -7.2575);
        Location jakarta = new Location(106.8456, -6.2088);

        System.out.println("Lokasi A (Surabaya): Lat=" + surabaya.latitude + ", Lon=" + surabaya.longitude);
        System.out.println("Lokasi B (Jakarta): Lat=" + jakarta.latitude + ", Lon=" + jakarta.longitude);

        double jarak = surabaya.distanceTo(jakarta);
        System.out.printf("Hasil perhitungan jarak: %.2f km\n", jarak);
    }
}