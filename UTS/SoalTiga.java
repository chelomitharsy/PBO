import java.util.Scanner;
public class SoalTiga {
    public static void main(String[] args) {
        int i = 1;
        int jml = 0;
        String nilai;

        Scanner sc = new Scanner(System.in);
        while(i<=10){
            System.out.print(i+". Masukkan nilai: "); nilai = sc.nextLine();
            jml = jml + i;
            i++;
        }
        System.out.println("Penjumlahan dari 10 bilangan tersebut yaitu " +jml);
    }
}
