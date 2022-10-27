import java.util.Scanner;
public class phonecell {
    //atribut
    private int h1, h2;
    private int m1, m2;
    private int s1, s2;
    private double f, lama, ubah;

    //method
    //melakukan set dan get pada jam awal dan akhir
    public void setH1(int jam1) {
        this.h1 = jam1;
    }
    public int getH1(){
        return this.h1;
    }
    public void setH2(int jam2){
        this.h2 = jam2;
    }
    public int getH2(){
        return this.h2;
    }

    //melakukan set dan get pada menit awal dan akhir
    public void setM1(int menit1) {
        this.m1 = menit1;
    }
    public int getM1(){
        return this.m1;
    }
    public void setM2(int menit2){
        this.m2 = menit2;
    }
    public int getM2(){
        return this.m2;
    }

    //melakukan set dan get pada detik awal dan akhir
    public void setS1(int detik1) {
        this.s1 = detik1;
    }
    public int getS1(){
        return this.s1;
    }
    public void setS2(int detik2){
        this.s2 = detik2;
    }
    public int getS2(){
        return this.s2;
    }

    //untuk mendapatkan lama waktu percakapan
    public double getLama(){
        return (3600* this.h2 + 60* this.m2 + this.s2) - (3600* this.h1 + 60* this.m1 + this.s1);
    }

    //untuk merubah detik lama waktu percakapan ke jam
    public double getUbah(){
        return getLama() / 3600;
    }

    /*untuk mendapatkan biaya.
    pada soal 5 detik seharga 150 rupiah, artinya 1 detik seharga 30 rupiah
     */
    public double getF(){
        return getLama() * 30;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        phonecell biaya = new phonecell();

        //melakukan input waktu awal
        System.out.print("Masukkan jam awal telfon: ");
        biaya.setH1(sc.nextInt());
        System.out.println("Masukkan menit awal anda: ");
        biaya.setM1(sc.nextInt());
        System.out.println("Masukkan detik awal anda: ");
        biaya.setS1(sc.nextInt());

        //melakukan input waktu akhir
        System.out.print("\n\nMasukkan jam akhir telfon: ");
        biaya.setH2(sc.nextInt());
        System.out.println("Masukkan menit akhir anda: ");
        biaya.setM2(sc.nextInt());
        System.out.println("Masukkan detik akhir anda: ");
        biaya.setS2(sc.nextInt());

        // tampilan (hh:mm:ss)
        System.out.println("\n\nLama percakapan anda: " +biaya.getUbah() + "jam");
        System.out.println("Biaya untuk percakapan anda: Rp " + biaya.getF());
    }
}