package Pertemuan1;

/*
* Buatlah program untuk menghitung nilai rata-rata dari
* tiga angka berikut ini:
*
* 30, 30, 60
*/

public class Latihan1 {
    public static void main(String[] args) {

        int[] nilai = {30, 30, 60};
        int sum = 0;

        for (int i = 0; i < nilai.length; i++) {
            sum = sum + nilai[i];
        }

        int average = sum/nilai.length;

        System.out.println(String.format("Nilai rata-rata dari %d, %d, %d adalah: %d", nilai[0], nilai[1], nilai[2], average));
    }
}