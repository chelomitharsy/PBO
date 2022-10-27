import java.util.Scanner;
public class gajikaryawan {
    private double gol, jk, jl, tgol, tgol2, tgol3, tgol4;
    public final double g1 = 1486500;
    public final double g2 = 1926000;
    public final double g3 = 2456700;
    public final double g4 = 2899500;
    public final double t1 = 250000;
    public final double t2 = 300000;
    public final double t3 = 350000;
    public final double t4 = 400000;

    //set dan get lembur
    public void setJk(double jamkerja){
        this.jk = jamkerja;
    }
    public double getJk(){
        return this.jk;
    }

    public void setJl(double jam lembur){
        this.jl = jam lembur;
    }
    public double getJl(){
        return this.jl;
    }

    public double waktulembur(){
        return this.waktulembur = (this.jk - 173);
    }

    public double biayalembur(){
        return lamalembur() * 20000;
    }

    //gol
    public gajikaryawan(){
        this.golongan = 0;
    }
    public void setGol(double golongan){
        this.gol = golongan;
    }
    public double getGol(){
        return this.gol;
    }

    //total gaji
    public void setTgol1(double totalgajigol1){
        this.tg1 = totalgajigol1;
    }
    public double getTgol1(){
        return this.tgol = (((g1 + t1) - ((g1 + t1) * 0.005)) + gajilembur());
    }
    public void setTgol2(double totalgajigol2){
        this.tgol2 = totalgajigol2;
    }
    public double getTgol2(){
        return this.tgol2 = (((g2 + t2) - ((g2 + t2) * 0.005)) + gajilembur());
    }
    public void setTgol3(double totalgajigol3){
        this.tgol3 = totalgajigol3;
    }
    public double getTgol3(){
        return this.tgol3 = (((g3 + t3) - ((g3 + t3) * 0.005)) + gajilembur());
    }
    public void setTgol4(double totalgajigol4){
        this.tgol4 = totalgajigol4;
    }
    public double getTgol4(){
        return this.tgol4 = (((g4 + t4) - ((g4 + t4) * 0.005)) + gajilembur());
    }

    public double gaji(){
        double gaji;
        gaji = this.golongan;
        if(golongan == 1){
            System.out.println("Gaji pokok anda sebesar: Rp 1.486.500");
            System.out.println("Tunjangan anda sebesar: Rp 250.000");
            System.out.println("\nTotal gaji anda: " +getTgol1());
        }else if(golongan == 2){
            System.out.println("Gaji pokok anda sebesar: Rp 1.926.000");
            System.out.println("Tunjangan anda sebesar: Rp 300.000");
            System.out.println("\nTotal gaji anda: " +getTgol2());
        }else if(golongan == 3){
            System.out.println("Gaji pokok anda sebesar: Rp 2.456.700");
            System.out.println("Tunjangan anda sebesar: Rp 350.000");
            System.out.println("\nTotal gaji anda: " +getTgol3());
        }else if(golongan == 4){
            System.out.println("Gaji pokok anda sebesar: Rp 2.899.500");
            System.out.println("Tunjangan anda sebesar: Rp 400.000");
            System.out.println("\nTotal gaji anda: " +getTgol04());
        }
        return gaji;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        gajikaryawan gk = new gajikaryawan();

        System.out.println("Masukkan golongan anda: ");
        gk.golongan = input.nextDouble();
        System.out.println("Masukkan jam kerja anda: ");
        gk.setJamkerja(input.nextDouble());

        System.out.println("\nLama lembur anda: " +gk.lamalembur() + " jam");
        System.out.println("Tambahan gaji yang didapatkan: Rp " +gk.biayalembur());
        System.out.println("\nDi atas merupakan total gaji anda selama sebulan dengan golongan " +gk.pangkat());
    }
}
