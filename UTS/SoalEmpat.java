import java.util.Scanner;

public class SoalEmpat {
    //atribut
    private double r;
    private final double phi = 3.14;

    //method
    //melakukan set dan get pada jari-jari
    public void setR(double jari){
        this.r = jari;
    }
    public double getR(){
        return this.r;
    }

    //menuliskan rumus dari luas
    public double luas(){
        return phi * (this.r * this.r);
    }

    //menuliskan rumus dari keliling
    public double keliling(){
        return 2 * phi * this.r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SoalEmpat hitung = new SoalEmpat();

        //melakukan input nilai r
        System.out.print("Masukkan nilai jari-jari: ");
        hitung.setR(sc.nextDouble());

        //menampilkan hasil hitungan dari luas dan keliling pada lingkaran
        System.out.println("Luas dari lingkaran tersebut yaitu " +hitung.luas()+ " cm");
        System.out.println("Keliling dari lingkaran tersebut yaitu " +hitung.keliling()+ " cm");
    }
}
