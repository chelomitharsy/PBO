import java.util.Scanner;

public class CobaBio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nim, nilaipresensi, nilaitugas, nilaiuts, nilaiuas;
        double nilaiAkhir;
        String nama;

        System.out.println("------------------------------------------------------------");
        System.out.println("INPUT DATA");
        System.out.println("------------------------------------------------------------");
        System.out.print("Masukkan NIM: "); nim = sc.nextInt();
        System.out.print("Masukkan Nama: "); nama = sc.next();

        System.out.println("\nMasukkan nilai Mata Kuliah Pemrograman Berorientasi Objek");
        System.out.print("\n1. Nilai Presensi: "); nilaipresensi = sc.nextInt();
        System.out.print("2. Nilai Tugas: "); nilaitugas = sc.nextInt();
        System.out.print("3. Nilai UTS: "); nilaiuts = sc.nextInt();
        System.out.print("4. Nilai UAS: "); nilaiuas = sc.nextInt();
        System.out.println("------------------------------------------------------------");

        System.out.println("Nilai Mata Kuliah Pemrograman Berorientasi Objek");
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        String Str = new Stringln("NIM" + nim);
        System.out.println("\nAngkatan: ");
        System.out.println(Str.substring(3,7));
        System.out.println("1. Nilai Presensi: " + nilaipresensi);
        System.out.println("2. Nilai Tugas: " + nilaitugas);
        System.out.println("3. Nilai UTS: " + nilaiuts);
        System.out.println("4. Nilai UAS: " + nilaiuas);
        nilaiAkhir = 0.1 * nilaipresensi + 0.2 * nilaitugas + 0.3 * nilaiuts + 0.4 * nilaiuas;
        System.out.println("5. Nilai Akhir: " + nilaiAkhir);
    }
}
