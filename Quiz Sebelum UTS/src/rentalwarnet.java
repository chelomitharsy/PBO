import java.util.Scanner;

public class rentalwarnet{
    //atribut
    private double wi, wp, wg, s, pw, php, tb;

    //method
    public void setWi(double waktuInternet){
        this.wi = waktuInternet;
    }
    public double getWi(){
        return this.wi;
    }

    public void setWp(double waktuPengetikan){
        this.wp = waktuPengetikan;
    }
    public double getWp(){
        return this.wp;
    }
    public void setWg(double waktuGame){
        this.wg = waktuGame;
    }
    public double getWg(){
        return this.wg;
    }

    //utk lainnya
    public void setS(double scan){
        this.s = scan;
    }
    public double getS(){
        return this.s;
    }
    public void setPw(double printWarna){
        this.pw = printWarna;
    }
    public double getPw(){
        return this.pw;
    }
    public void setPhp(double printHitamPutih){
        this.php = printHitamPutih;
    }
    public double getPhp(){
        return this.php;
    }
    public void setTb(double tehBotol){
        this.tb = tehBotol;
    }
    public double getTb(){
        return this.tb;
    }


    //biaya warnet
    public double biayaWarnet(){
        return ((this.wi * 4000) + (this.wp * 2000) + (this.wg * 5000));
    }

    //biaya lain
    public double biayaLain(){
        return ((this.s *1000) + (this.pw * 500) + (this.php * 300) + (this.tb * 3000));
    }

    //biaya keseluruhan
    public double keseluruhan(){
        return biayaWarnet() + biayaLain();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        rentalwarnet harga = new rentalwarnet();
        int jp;

        //melakukan input
        System.out.println("Masukkan jenis penggunaan [internet/pengetikan/game online: ");
    }
}