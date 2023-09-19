package Pertemuan4;

/*
* Ambil sebuah angka sebagai input dari user, dan outputnya
* berupa kata yang sesuai dengan angka. Angka yang
* dimasukkan antara 1 - 10. Jika user memasukkan nilai yang
* tidak sesuai berikan output "invalid number"
* a. Gunakan statement if-else untuk menyelesaikan.
* b. Gunakan statement switch case untuk menyelesaikan.
*/

import javax.swing.JOptionPane;

public class AngkaToKata {
    public static String atkIfElse(int x) {

        String y = "Anda belum memasukan angka!";

        if (x == 1) {
            y = "Satu";
        } else if (x == 2) {
            y = "Dua";
        } else if (x == 3) {
            y = "Tiga";
        } else if (x == 4) {
            y = "Empat";
        } else if (x == 5) {
            y = "Lima";
        } else if (x == 6) {
            y = "Enam";
        } else if (x == 7) {
            y = "Tujuh";
        } else if (x == 8) {
            y = "Delapan";
        } else if (x == 9) {
            y = "Sembilan";
        } else if (x == 10) {
            y = "Sepuluh";
        } else {
            y = "Masukkan Angka di antara 1 - 10";
        }

        return y;
    }

    public static String atkSwitch(int x){

        String y = "Anda belum memasukan angka!";

        switch (x) {
            case 1:
                y = "Satu";
                break;
            case 2:
                y = "Dua";
                break;
            case 3:
                y = "Tiga";
                break;
            case 4:
                y = "Empat";
                break;
            case 5:
                y = "Lima";
                break;
            case 6:
                y = "Enam";
                break;
            case 7:
                y = "Tujuh";
                break;
            case 8:
                y = "Delapan";
                break;
            case 9:
                y = "Sembilan";
                break;
            case 10:
                y = "Sepuluh";
                break;
            default:
                y = "Angka yang Anda masukkan salah";
        }

        return y;
    }
    public static void main(String[] args) {

        // a. Statement if-else
        String input = JOptionPane.showInputDialog("Masukkan Angka di antara 1 - 10: ");
        int inputConverted = Integer.parseInt(input);
        JOptionPane.showMessageDialog(null, String.format("Angka yang Anda masukkan adalah: %s", atkIfElse(inputConverted)), "Angka ke Kata", JOptionPane.INFORMATION_MESSAGE);

        // b. Statement switch case
        String inputSwitch = JOptionPane.showInputDialog("Masukkan Angka di antara 1 - 10: ");
        int inputConvertedSwitch = Integer.parseInt(inputSwitch);
        JOptionPane.showMessageDialog(null, String.format("Angka yang Anda masukkan adalah: %s", atkSwitch(inputConvertedSwitch)), "Angka ke Kata", JOptionPane.INFORMATION_MESSAGE);
    }
}
