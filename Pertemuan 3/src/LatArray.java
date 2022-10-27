public class LatArray {
    public static void main(String[] args) {
        int[] angka = { 4,5,10,6,8,13};//inisialisasi array int

        //untk mengakses nilai pada Array
        //jika menggunakan manual maka menampilkannya perlu mengetik satu-satu
        System.out.println("menampilkan data secara manual");
        System.out.println("nilai ke-1 adalah "+angka[0]);
        System.out.println("nilai ke-2 adalah "+angka[1]);
        System.out.println("nilai ke-3 adalah "+angka[2]);
        System.out.println("nilai ke-4 adalah "+angka[3]);
        System.out.println("nilai ke-5 adalah "+angka[4]);
        System.out.println("nilai ke-6 adalah "+angka[5]);

        //untk mengakses nilai pada Array dgn Loop
        //menampilkan Array otomatis
        System.out.println("menampilkan data dgn loop 1");
        for (int i =0; i < angka.length;i++){
            System.out.println("nilai ke-"+(i+1)+" adalah " + angka[i]);
        }
        System.out.println("menampilkan data dgn loop 2");
        int j=1;//inisialisai
        for (int nilai : angka ){
            System.out.println("nilai ke-"+j+" adalah " + nilai);
            j++;
        }

        //mengganti nilai array
        angka[2]=30;
        //tampilan nilai yang diubah
        System.out.println("nilai ke-3 setelah diganti adalah "+angka[2]);
    }
}