package Pertemuan4;

/*
* Bangun sebuah program yang mampu menghasilkan output
* perhitungan berikut (tidak boleh menggunakan fungsi
* Math.pow)
*
* a. 4^3 + 5^2
* b. 5! + 4!
* c. (4^2 + 5^1) / 5 + 4^2
*/


public class LoopBerhitung {
    public static int fungsiPangkat(int x, int y){
        for (int i = 1; i < y; i++) {
            x*=x;
        }
        return x;
    }
    public static int fungsiFaktorial(int x){
        int y = x;
        for (int i = 1; i < y; i++) {
            x*=i;
        }
        return x;
    }
    public static void main(String[] args) {

        // a. 4^3 + 5^2
        int a = fungsiPangkat(4, 3) + fungsiPangkat(5, 2);
        System.out.println("Hasil penjumlahan 4^3 + 5^2 = " + a);

        // b. 5! + 4!
        int b = fungsiFaktorial(5) + fungsiFaktorial(4);
        System.out.println("Hasil penjumlahan 5! + 4! = " + b);

        // c. (4^2 + 5^1) / 5 + 4^2
        int c = (fungsiPangkat(4,2) + fungsiPangkat(5, 1)) / 5 + fungsiPangkat(4, 2);
        System.out.println("Hasil penjumlahan (4^2 + 5^1) / 5 + 4^2 = " + c);
    }
}
