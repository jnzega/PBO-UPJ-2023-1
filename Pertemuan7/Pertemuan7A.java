package Pertemuan7;

public class Pertemuan7A {
    // Method sama namun parameter berbeda
// Tipe data double
    static double minNumber(double a, double b) {
        if (a < b) {
            return a;
        }else{
            return b;
        }
    }
    // Method sama, namun parameter berbeda
// Tipe data int
    static int maxNumber(int a, int b) {
        if (a < b){
            return a;
        }else {
            return b;
        }
    }
    public static void main(String[] argrs) {
        System.out.println(minNumber(5.5, 7.5));
        System.out.println(minNumber(10, 20));
    }
}
