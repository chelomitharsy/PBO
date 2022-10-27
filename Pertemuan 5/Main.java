public class Main {
    public static void main(String[] args) {
        Biodata biodata = new Biodata();
        biodata.inputData("2021071042", "chelo");
        biodata.viewData();

        Biodata mhs = new Biodata();
        mhs.inputData("2021071042", "caca");
        mhs.viewData();
    }
}
