import java.util.Scanner;

public class soal2sedang {
    // Fungsi untuk menghitung volume tabung
    public static double hitungVolumeTabung(double jariJari, double tinggi) {
        double volume = Math.PI * jariJari * jariJari * tinggi;
        return volume;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jari-jari tabung: ");
        double jariJari = scanner.nextDouble();
        System.out.print("Masukkan tinggi tabung: ");
        double tinggi = scanner.nextDouble();
        double volume = hitungVolumeTabung(jariJari, tinggi);
        System.out.printf("Volume tabung adalah: %.2f\n", volume);
    }
}
