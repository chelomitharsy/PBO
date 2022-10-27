import java.util.Scanner;

public class T2S1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nilai;
        System.out.println("Masukkan nilai: ");
        nilai = sc.nextInt();
        while (nilai > 10) {
            System.out.println("Nilai yang anda masukkan salah. \nMohon masukkan nilai kembali: ");
            nilai = sc.nextInt();
        }
        System.out.println("Nilai yang anda masukkan adalah " + nilai);
    }
}
