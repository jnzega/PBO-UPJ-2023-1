package Pertemuan3;

/*
* Sebuah perusahaan memberikan komisi pada salesmannya,
* dengan ketentuan sebagai berikut:
*
* 1. Bila seorang salesman dapat menjual barang hingga
*       Rp2.000.000, maka dia berhak mendapatkan uang jasa
*       sebesar Rp100.000 ditambah uang komisi sebesar 10%
*       dari pendapatan hari itu.
* 3. Bila seorang salesman dapat menjual barang hingga
*       Rp2.000.000 hingga Rp5.000.000, maka dia berhak
*       mendapatkan uang jasa sebesar Rp200.000 ditambah
*       uang komisi sebesar 15% dari pendapatan hari itu.
* 1. Bila seorang salesman dapat menjual barang di atas
*       Rp5.000.000, maka dia berhak mendapatkan uang jasa
*       sebesar Rp300.000 ditambah uang komisi sebesar 20%
*       dari pendapatan hari itu.
*
* Buatlah program untuk menghitung permintaan di atas hari
* itu menggunakan JOptionPane!
*/

import javax.swing.JOptionPane;

public class Latihan2 {
    public static void main(String[] args) {

        String input = JOptionPane.showInputDialog("Masukkan Gaji Anda: ");

        int inputConverted = Integer.parseInt(input);

        int komisiInput;
        int bonusTotal;

        if (inputConverted == 2000000) {
            komisiInput = inputConverted*10/100;
            bonusTotal  = 100000 + komisiInput;
            JOptionPane.showMessageDialog(null, String.format("Bonus yang anda dapatkan: Rp%,d", bonusTotal), "Bonus Yang Anda dapatkan", JOptionPane.INFORMATION_MESSAGE);
        } else if (inputConverted > 2000000 && inputConverted < 5000000) {
            komisiInput = inputConverted*15/100;
            bonusTotal  = 200000 + komisiInput;
            JOptionPane.showMessageDialog(null, String.format("Bonus yang anda dapatkan: Rp%,d", bonusTotal), "Bonus Yang Anda dapatkan", JOptionPane.INFORMATION_MESSAGE);
        } else if (inputConverted >= 5000000) {
            komisiInput = inputConverted*20/100;
            bonusTotal  = 300000 + komisiInput;
            JOptionPane.showMessageDialog(null, String.format("Bonus yang anda dapatkan: Rp%d", bonusTotal), "Bonus Yang Anda dapatkan", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "KERJALAH LEBIH GIAT LAGI!!!", "Mengharap Bonus?", JOptionPane.INFORMATION_MESSAGE);
        }

    }
}
