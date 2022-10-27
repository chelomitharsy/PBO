import java.util.Scanner;
public class TabelNilai {

    //melakukan set dan get pada nilai
    private double nilai;
    public TabelNilai(){
        this.nilai = 0;
    }
    public void setNilai(double nilai){
        this.nilai = nilai;
    }
    public double getNilai(){
        return this.nilai;
    }

    //melakukan set pada hitung nilai
    public double Hitung(){
        double hitung;
        hitung = this.nilai;
        //menggolongkan nilai sesuai dengan nilai huruf
        if(nilai>=90&&nilai<=100){
            System.out.println("Nilai Huruf = A");
        }else if(nilai>=80&&nilai<=89.99){
            System.out.println("Nilai Huruf = A-");
        }else if(nilai>=75&&nilai<=79.99){
            System.out.println("Nilai Huruf = B+");
        }else if(nilai>=65&&nilai<=69.99){
            System.out.println("Nilai Huruf = B");
        }else if(nilai>=60&&nilai<=64.99){
            System.out.println("Nilai Huruf = C+");
        }else if(nilai>=55&&nilai<=59.99){
            System.out.println("Nilai Huruf = C");
        }else if(nilai>=50&&nilai<=54.99){
            System.out.println("Nilai Huruf = C-");
        }else if(nilai>=40&&nilai<=49.99){
            System.out.println("Nilai Huruf = D");
        }else if(nilai>=0&&nilai<=39.99){
            System.out.println("Nilai Huruf = E");
        }
        return hitung;
    }

    //melakukan input
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TabelNilai obj = new TabelNilai();

        System.out.println("Masukkan total nilai : ");
        obj.nilai = input.nextDouble();

        //menampilkan hasil nilai angka dan nilai huruf
        System.out.println("\nHasil: ");
        System.out.println("Nilai angka: "+obj.nilai);
        obj.Hitung();
    }
}

