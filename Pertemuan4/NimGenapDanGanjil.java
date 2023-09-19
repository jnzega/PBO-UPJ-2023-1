package Pertemuan4;

import javax.swing.JOptionPane;

public class NimGenapDanGanjil {
    public static String nimGanjilGenap(int x){
        String y = "NIM Anda tidak valid";

        if (x%2 == 0) {
            y = "NIM Anda Genap";
        } else if (x%2 == 1) {
            y = "NIM Anda Ganjil";
        } else {
            y = "NIM Anda tidak valid";
        }

        return y;
    }
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Masukkan NIM Anda: ");
        int inputConverted = Integer.parseInt(input);
        JOptionPane.showMessageDialog(null, String.format("NIM Anda adalah: %s", nimGanjilGenap(inputConverted)), "Pendeteksi NIM", JOptionPane.INFORMATION_MESSAGE);
    }
}
