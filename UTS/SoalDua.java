import java.util.Scanner;
public class SoalDua {

    //atribut
    private double bb, tb, formula;

    //method
    //melakukan set dan get untuk berat badan
    public void setBb(double beratbadan){
        this.bb = beratbadan;
    }
    public double getBb(){
        return this.bb;
    }

    //melakukan set dan get untuk tinggi badan
    public void setTb(double tinggibadan){
        this.tb = tinggibadan;
    }
    public double getTb(){
        return this.tb;
    }

    public double jenis(){
        double jenis;
        jenis = this.formula;
        //menuliskan rumus atau formula dari BMI untuk menghitung ideal berat badan
        this.formula = this.bb / (this.tb * this.tb);
        //menggolongkan bb dan tb sesuai formula ideal BMI
        if(formula>=18.5 && formula<=22.9){
            System.out.println("\nMaka, berat badan anda tergolong ideal.");
            System.out.println("Selamat! Terus pertahankan pola hidup sehatmu.");
        } else if(formula>22.9){
            System.out.println("\nMaka, berat badan anda tergolong overweight.");
            System.out.println("Jangan sedih, yuk mulai terapkan pola hidup sehat dengan memperhatikan asupan kalori!^^");
        } else if(formula<18.5){
            System.out.println("\nMaka, berat badan anda tergolong underweight, nih. ");
            System.out.println("Jadi, jangan diet lagi yaa! Sayangi tubuh kamu.");
        }
        return jenis;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SoalDua hitung = new SoalDua();

        //melakukan inputan tinggi badan dan berat badan
        System.out.print("Masukkan berat badan anda: "); hitung.setBb(sc.nextDouble());
        System.out.print("Masukkan tinggi badan anda (m): "); hitung.setTb(sc.nextDouble());

        //menampilkan tinggi badan dan berat badan hasil inputan
        System.out.println("\nDengan berat badan sebesar " +hitung.getBb()+ " kg");
        System.out.println("dan tinggi badan sebesar " +hitung.getTb()+ " m");

        //menampilkan golongan berat badan sesuai inputan
        System.out.println("\n" +hitung.jenis());
    }
}
