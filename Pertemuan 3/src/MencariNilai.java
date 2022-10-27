import java.util.Scanner;

public class MencariNilai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] angka = {10, 3, 40, 50, 15, 5, 7, 8};

        boolean ketemu = false;
        //harus false dlu karna kalau menggunakan while maka tdk akan ketemu
        //!ketemu artinya tidak ketemu

        int cari;
        System.out.println("Masukkan nilai: "); cari = sc.nextInt();
        int i = 0;
        int posisi = 0;
        while ((!ketemu) && (i < angka.length)){
            if (angka[i] == cari){
                ketemu = true;
                posisi = i+1;
            }
            i++;
        }
        if (ketemu){
            System.out.println("Angka " +cari + " ada pada array di urutan ke-" +posisi);
        }else{
            System.out.println("Angka " +cari + " tidak ada pada array");
        }
    }
}
