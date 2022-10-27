package LatihanClass3a;

public class Biodata {
    private String nim;
    private String nama;

    public String getNim(){
        return nim;
    }
    public void setNim(String nim){
        this.nim = nim;
    }
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }

    public static void main(String[] args) {
        Biodata biodata = new Biodata();
        biodata.setNim("2021071042");
        biodata.setNama("chelomitha");

        System.out.println("NIM: " + biodata.getNim());
        System.out.println("Nama: " + biodata.getNama());
    }
}
