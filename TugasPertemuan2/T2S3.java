import java.util.Random; import java.util.Scanner;

public class T2S3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            String[] tjk = {"t", "j", "k"};
            String jariKom = tjk[new Random().nextInt(tjk.length)];
            String jari;

            while(true) {
                System.out.println("Masukkan jari yang anda mau (t, j, atau k): ");
                jari = scanner.nextLine();
                if (jari.equals("t") || jari.equals("j") || jari.equals("k")) {
                    break;
                }
                System.out.println(jari + " apaan?");
            }

            System.out.println("Komputer: " + jariKom);

            if (jari.equals(jariKom)) {
                System.out.println("HAHA! Sama nih");
            }
            else if (jari.equals("t")) {
                if (jariKom.equals("k")) {
                    System.out.println("Wihh menang");

                } else if (jariKom.equals("j")) {
                    System.out.println("Wlek kalah!");
                }
            }

            else if (jari.equals("j")) {
                if (jariKom.equals("t")) {
                    System.out.println("Wihh menang");

                } else if (jariKom.equals("k")) {
                    System.out.println("Wlek kalah!");
                }
            }

            else if (jari.equals("k")) {
                if (jariKom.equals("j")) {
                    System.out.println("Wihh menang");

                } else if (jariKom.equals("t")) {
                    System.out.println("Wlek kalah!");
                }
            }

            System.out.println("Maen lagi ga bro? (gas/gadulu)");
            String maenLagi = scanner.nextLine();

            if (!maenLagi.equals("gas")) {
                break;
            }
        }
        scanner.close();
    }
}