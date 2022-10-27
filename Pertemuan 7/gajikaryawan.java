import java.util.Scanner;
public class gajikaryawan {
    private double golongan, jamkerja, lembur, tg1, tg2, tg3, tg4;
    public final double g1 = 1486500;
    public final double g2 = 1926000;
    public final double g3 = 2456700;
    public final double g4 = 2899500;
    public final double t1 = 250000;
    public final double t2 = 300000;
    public final double t3 = 350000;
    public final double t4 = 400000;

    //set dan get lembur
    public void setJamkerja(double jamkerja){
        this.jamkerja = jamkerja;
    }
    public double getJamkerja(){
        return this.jamkerja;
    }

    public void setLembur(double lembur){
        this.lembur = lembur;
    }
    public double getLembur(){
        return this.lembur;
    }

    public double lamalembur(){
        return this.lembur = (this.jamkerja - 173);
    }

    public double biayalembur(){
        return lamalembur() * 20000;
    }

    //golongan
    public gajikaryawan(){
        this.golongan = 0;
    }
    public void setGolongan(double golongan){
        this.golongan = golongan;
    }
    public double getGolongan(){
        return this.golongan;
    }

    //total gaji
    public void setTg1(double totalgaji1){
        this.tg1 = totalgaji1;
    }
    public double getTg1(){
        return this.tg1 = (((g1 + t1) - ((g1 + t1) * 0.005)) + biayalembur());
    }
    public void setTg2(double totalgaji2){
        this.tg2 = totalgaji2;
    }
    public double getTg2(){
        return this.tg2 = (((g2 + t2) - ((g2 + t2) * 0.005)) + biayalembur());
    }
    public void setTg3(double totalgaji3){
        this.tg3 = totalgaji3;
    }
    public double getTg3(){
        return this.tg3 = (((g3 + t3) - ((g3 + t3) * 0.005)) + biayalembur());
    }
    public void setTg4(double totalgaji4){
        this.tg4 = totalgaji4;
    }
    public double getTg4(){
        return this.tg4 = (((g4 + t4) - ((g4 + t4) * 0.005)) + biayalembur());
    }

    public double pangkat(){
        double pangkat;
        pangkat = this.golongan;
        if(golongan == 1){
            System.out.println("Gaji pokok anda sebesar: Rp 1.486.500");
            System.out.println("Tunjangan anda sebesar: Rp 250.000");
            System.out.println("\nTotal gaji anda: " +getTg1());
        }else if(golongan == 2){
            System.out.println("Gaji pokok anda sebesar: Rp 1.926.000");
            System.out.println("Tunjangan anda sebesar: Rp 300.000");
            System.out.println("\nTotal gaji anda: " +getTg2());
        }else if(golongan == 3){
            System.out.println("Gaji pokok anda sebesar: Rp 2.456.700");
            System.out.println("Tunjangan anda sebesar: Rp 350.000");
            System.out.println("\nTotal gaji anda: " +getTg3());
        }else if(golongan == 4){
            System.out.println("Gaji pokok anda sebesar: Rp 2.899.500");
            System.out.println("Tunjangan anda sebesar: Rp 400.000");
            System.out.println("\nTotal gaji anda: " +getTg4());
        }
        return pangkat;
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
