package Pertemuan3;

/*
* Buatlah aplikasi menggunakan BufferedReader yang menanyakan
* input bilangan sebanyak 3 kali.
*
* Output yang diharapkan seperti:
* Masukkan Nilai Pertama = 20
* Masukkan Nilai Kedua = 12
* Masukkan Nilai Ketiga = 3
*
* Tampilkan nilai yang dimasukkan:
* 20, 12, 3
*
* ============================================================
* Dari soal di atas, tambahkan perintah untuk mencari nilai
* terbesar dan terkecil dari angka-angka yang telah dimasukkan
* dengan Output yang diharapkan seperti:
*
* Nilai Terbesar adalah = 20
* Nilai Terkecil adalah = 3
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Latihan1 {
    public static void main(String[] args) {
        System.out.println("==============================================================");
        BufferedReader dataIn =  new BufferedReader(new InputStreamReader(System.in));
        String[] angka;
        angka = new String[3];

        int[] angkaConverted;
        angkaConverted = new int[3];
        for (int i = 0; i < angka.length; i++) {
            System.out.println(String.format("Masukkan angka ke-%d: ", i+1));
            try{
                angka[i] = dataIn.readLine();
            } catch (IOException e) {
                System.out.println("Error!");
            }
            angkaConverted[i] = Integer.parseInt(angka[i]);
        }

        System.out.println("-------------------------------------------");

        System.out.print("Nilai-nilai yang dimasukkan = ");

        for (int i = 0; i <= angkaConverted.length; i++) {
            if (i == angkaConverted.length - 1){
                System.out.println(String.format("%d", angkaConverted[i]));
                break;
            }
            System.out.print(String.format("%d, ", angkaConverted[i]));
        }

        System.out.println("==============================================================");

        Arrays.sort(angkaConverted);

        System.out.println(String.format("Nilai terkecil adalah = %d", angkaConverted[0]));
        System.out.println(String.format("Nilai terbesar adalah = %d", angkaConverted[angkaConverted.length-1]));

        System.out.println("==============================================================");
    }
}
