package Pertemuan11;

import java.awt.*;
import javax.swing.*;
public class Pertemuan11F extends JFrame{
    JLabel labelPertama = new JLabel("Masukkan Angka Pertama : ");
    JLabel labelKedua = new JLabel("Masukkan Angka Kedua : ");
    JLabel labelKetiga = new JLabel("Masukkan Angka Ketiga : ");
    JTextField angkaPertama = new JTextField(10);
    JTextField angkaKedua = new JTextField(10);
    JTextField angkaKetiga = new JTextField(10);
    JButton tambah = new JButton("+");
    JButton kurang = new JButton("-");
    JButton bagi = new JButton("/");
    JButton kali = new JButton("*");

    Pertemuan11F(){
        setTitle("DESIGN GUI TUGAS PBO");
        setLocation(200, 200);
        setSize(200, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    void output(){
        getContentPane().add(labelPertama);
        getContentPane().add(angkaPertama);
        getContentPane().add(labelKedua);
        getContentPane().add(angkaKedua);
        getContentPane().add(labelKetiga);
        getContentPane().add(angkaKetiga);
        getContentPane().add(tambah);
        getContentPane().add(kurang);
        getContentPane().add(bagi);
        getContentPane().add(kali);
        getContentPane().setLayout(new FlowLayout());
        setVisible(true);
    }

    public static void main(String[] args) {
        Pertemuan11F tugas = new Pertemuan11F();
        tugas.output();
    }
}
