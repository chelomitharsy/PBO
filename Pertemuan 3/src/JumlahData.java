import java.util.stream.IntStream;

public class JumlahData {
    public static void main(String[] args) {
        int[] angka = {10, 3, 40, 50, 15, 5, 7, 8};
        int sum = IntStream.of(angka).sum();

        System.out.println("Mencari nilai total dari array!");
        System.out.println("Nilai total dari data array yaitu:  " + sum);

        int rata = 0;
        System.out.println("\nMencari nilai rata-rata array!");
        for (int o : angka){
            rata = sum / 8;
        }
        System.out.println("Rata-rata nilai array yaitu: " +rata);
    }
}