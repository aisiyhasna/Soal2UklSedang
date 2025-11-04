import java.util.Scanner;

public class Soal2UklSedang {

    //Fungsi untuk menghitung tabung
    static double hitungTabung(double jariJari, double tinggi) {
        return Math.PI * jariJari * jariJari * tinggi;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("===Hitung Volume Tabung===");
        System.out.print("Masukkan jari-jari (cm): ");
        double jariJari = input.nextDouble();
        System.out.print("Masukkan tinggi (cm): ");
        double tinggi = input.nextDouble();
        double volume = hitungTabung(jariJari, tinggi);
        System.out.printf("Volume tabung adalah: %.2f cm³%n", volume);
        input.close();
        
    }
}
