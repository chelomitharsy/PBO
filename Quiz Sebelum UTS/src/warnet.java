import java.util.Scanner;

public class warnet{
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


    //penggunaan lainnya

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        warnet harga = new warnet();
        int jwb, jp, jl;

        System.out.println("1. Internet\n 2. Pengetikan\n 3. Game Online\n Masukkan jenis penggunaan anda (angka saja): ");
        }
    }
}