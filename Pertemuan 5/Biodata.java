/*buat program utk menginput dan menampilkan data nim dan nama dg konsep PBO
1. Analisis spesifikasi kebutuhan sistem
    a. spesifikasi kebutuhan input data ke sistem
        - nim
        - nama
    b. spesifikasi kebutuhan output data dari sistem
        - nim
        - nama
    c. rekayasa proses
 */

 public class Biodata {
    private String nim;
    private String nama;

    public void inputData(String nim, String nama){
        this.nim = nim;
        this.nama = nama;
    }

    public void viewData(){
        System.out.println("NIM: " + this.nim);
        System.out.println("Nama: " + this.nama);
    }
}
