package Pertemuan1;

/*
* Selesaikan perhitungan berikut:
*
* a. 2^8 + 4^4
* b. 2^2 + 4^1 / 2^2
* c. Cari nilai X jika diketahui 2X+6/6-4 = 2X-2/3
*/

import java.lang.Math;

public class Latihan4 {
    public static void main(String[] args) {

        double a = Math.pow(2, 8) + Math.pow(4, 4);
        double b = Math.pow(2, 2) + Math.pow(4, 1) / Math.pow(2, 2);
//      c = Can't find the value

        System.out.println("a. " + a + "\nb. " + b + "\nc. Cannot find the answer!");
    }
}