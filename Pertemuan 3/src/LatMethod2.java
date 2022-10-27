public class LatMethod2 {
    static void welcome(String namaDepan, double absen, double tugas, double uts, double uas){
        System.out.println("Selamat Datang " +namaDepan);
        double nilaiAkhir = (0.1 * absen) + (0.2 * tugas) + (0.3 * uts) + (0.4 * uas);
        System.out.println("Nilai " +namaDepan +" adalah " +nilaiAkhir);
    }

    public static void main(String[] args) {
        String namaDepan = "Chelomitha";
        double absen = 100;
        double tugas = 90;
        double uts = 85;
        double uas = 87;
        welcome(namaDepan, absen, tugas, uts, uas);
    }
}
