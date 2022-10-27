import java.util.Scanner;

public class LatihanVar2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double alas,tinggi, luas;

        System.out.println("Masukkan alas: "); alas = sc.nextDouble();
        System.out.println("Masukkan tinggi: "); tinggi = sc.nextDouble();

        System.out.println("Menghitung Luas Segitiga");
        System.out.println("alas = " + alas + "cm");
        System.out.println("tinggi = " + tinggi + "cm");
        System.out.println("luas segitiga = " + 0.5 * alas * tinggi + " cm^2");
    }
}
