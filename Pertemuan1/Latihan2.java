package Pertemuan1;

/*
* Buatlah sebuah program untuk menghitung gaji bersih
* setelah dipotong pajak 10% dengan proses seperti
* berikut:
*
* 1. Input => gajiKotor
* 2. Proses => potongan = pajak * gajiKotor
* 3. gajiBersih = gajiKotor - potongan
* 4. Output => gajiBersih
*/

import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {

        int pajak = 10/100;

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Gaji Kotor Anda: Rp");

        int gajiKotor = input.nextInt();

        int potongan = pajak * gajiKotor;
        int gajiBersih = gajiKotor - potongan;

        input.close();

        System.out.println(String.format("Gaji Bersih Anda sebesar: Rp%,d", gajiBersih));
    }
}
