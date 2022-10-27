public class LatSubString {
    public static void main(String[] args) {
        String nim = "2021071042";
        String kodeProdi = nim.substring(4,7);
        String namaProdi = "";
        String angkatan = nim.substring(0,4);
        //System.out.println("Kode Prodi = " + kodeProdi);
        //System.out.println("Angkatan = " + angkatan);
        if (kodeProdi.equals("071")) {
            namaProdi = "Informatika";
        }
        System.out.println("NIM : " + nim);

    }
}
