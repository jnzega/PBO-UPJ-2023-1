package Pertemuan6;

import javax.swing.*;

public class Latihan6C {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Masukkan kode barang: ");
        int pilih = 0;
        if (input.matches("\\d+")) {
            pilih = Integer.parseInt(input);
            switch (pilih){
                case 1:
                    JOptionPane.showMessageDialog(null, "Alat Olahraga", "Barang yang Anda cari", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Alat Elektronik", "Barang yang Anda cari", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Alat Masak", "Barang yang Anda cari", JOptionPane.INFORMATION_MESSAGE);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Anda Salah Memasukkan Kode", "Barang yang Anda cari", JOptionPane.INFORMATION_MESSAGE);
                    break;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Anda Salah Memasukkan Kode", "Barang yang Anda cari", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
