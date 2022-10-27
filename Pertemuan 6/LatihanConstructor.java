public class LatihanConstructor {
    private int bilangan;
    public int getBilangan() {
        return bilangan;
    }

    public void setBilangan(int bilangan) {
        this.bilangan = bilangan;
    }

    public LatihanConstructor(int bil) {
        System.out.println("Konstruktor dijalankan..");
        this.bilangan = bil;
    }

    public static void main(String[] args) {
        //buat objek
        //ini adl nama class        ini adl constructor
        LatihanConstructor obj = new LatihanConstructor(300);
        System.out.println("bilangan: " +obj.getBilangan());
        //ini dapat digunakan jika file dipisah-> obj.setBilangan(100);
        obj.bilangan = 100;
        System.out.println("bilangan: " +obj.getBilangan());
    }
}
