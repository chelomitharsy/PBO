import java.util.Scanner;

public class CobaLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String jwb = "y";
        while (jwb.equals("y")){
            System.out.println("Halo Selamat Datang!");
            System.out.println("Apakah ingin mengulang lagi [y/t] ?");
            jwb = sc.nextLine();

        System.out.println("Terima kasih telah menggunakan program ini.");
    }
}
}
