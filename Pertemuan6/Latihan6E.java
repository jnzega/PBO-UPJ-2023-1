package Pertemuan6;

import javax.swing.JOptionPane;

public class Latihan6E {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Masukkan total belanja (Rp)");
        int totalPembelian = 0;
        if (input.matches("\\d+")) {
            totalPembelian = Integer.parseInt(input);

            if (totalPembelian >= 50000) {
                int potonganDidapat = totalPembelian * 20/100;
                int totalPotongan = totalPembelian - potonganDidapat;
                JOptionPane.showMessageDialog(null, String.format("Selamat Anda hemat Rp%,d. Potongan yang Anda dapatkan dari belanja Rp%,d menjadi Rp%,d.", potonganDidapat, totalPembelian, totalPotongan), "POTONGAN YANG DIDAPAT", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Belanja lebih banyak lagi agar dapat menikmati potongan harga 20%", "POTONGAN YANG DIDAPAT", JOptionPane.INFORMATION_MESSAGE);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Total yang Anda masukkan tidak valid", "SISTEM ERROR!", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
