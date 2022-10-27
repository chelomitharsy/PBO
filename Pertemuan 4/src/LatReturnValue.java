import java.util.Scanner;
public class LatReturnValue {

    static double luasSegitiga() {
        Scanner sc = new Scanner(System.in);
        double alas, tinggi, luas;
        System.out.println("Masukkan alas: "); alas = sc.nextDouble();
        System.out.println("Masukkan tinggi: "); tinggi = sc.nextDouble();

        luas = 0.5 * alas * tinggi;
        return luas;
    }
    public static void main(String[] args) {
        System.out.println("Luas segitiga= " +luasSegitiga());
    }
}
