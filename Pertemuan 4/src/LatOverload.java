public class LatOverload {

    static int plusMethod(int x, int y){
        return x + y;
    }

    static double plusMethod(double x, double y){
        return x + y;
    }

    public static void main(String[] args) {
        double myNum1 = plusMethod(5, 5.6);
        double myNum2 = plusMethod(5.6, 5);
        int myNum3 = plusMethod(5, 5);
        double myNum4 = plusMethod(5.6, 5.6);
        System.out.println("double: " +myNum1);
        System.out.println("double: " +myNum2);
        System.out.println("int: " +myNum3);
        System.out.println("double: " +myNum4);
    }
}
