import java.util.Scanner;
public class luassegitiga {
    //atribut
    private double a;
    private double t;
    private double l;

    //method
    public void setL(double luas){
        this.l = luas;
    }
    public double getL(){
        return this.l;
    }
    public void setA(double alas){
        this.a = alas;
    }
    public double getA(){
        return this.a;
    }
    public void setT(int tinggi){
        this.t = tinggi;
    }
    public double getT(){
        return this.t;
    }
    public double luas(){
        return 0.5 * this.a * this.t;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        luassegitiga luas = new luassegitiga();

        //melakukan input pada alas dan tinggi segitiga
        System.out.print("Alas segitiga: ");
        luas.setA(input.nextInt());
        System.out.print("Tinggi segitiga: ");
        luas.setT(input.nextInt());

        //menampilkan hasil dari luas segitiga
        System.out.println("Luas Segitiga adalah: " +luas.luas());
    }
}
