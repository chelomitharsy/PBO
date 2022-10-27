//kl tdk mau menggunakan rumus MTK tidak usah ditambah bawah ini
import java.lang.Math;
public class Lingkaran {
    //ada fungsi utk menghitung luas dan keliling lingkaran
    //atribut
    private double r;
    private final double PHI = 3.14;

    //method
    public Lingkaran (){
        this.r = 0;
    }
    public Lingkaran(double jari){
        this.r = jari;
    }
    public void setR(double jari){
        this.r = jari;
    }
    public double getR(){
        return this.r;
    }
    public double luas(){
        //kl tdk menggunakan rmus MTK pakai ini saja-> return PHI * r * r;
        return PHI * Math.pow(this.r, 2);
    }
    public double keliling(){
        return 2 * this.PHI * this.r;
    }

    public static void main(String[] args) {
        //cara1
        Lingkaran link1 = new Lingkaran();
        link1.setR(10);
        System.out.println("Luas Lingkaran 1: " +link1.luas());

        //cara2
        Lingkaran link2 = new Lingkaran(100);
        System.out.println("Luas Lingkaran 2: " +link2.luas());
    }
}
