package Pertemuan2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Latihan1 {
    public static void main(String[] args) {
        BufferedReader dataIn =  new BufferedReader(new InputStreamReader(System.in));
        String name = "";
        System.out.println("Silahkan Masukkan Nama Anda: ");
        try{
            name = dataIn.readLine();
        } catch (IOException e) {
            System.out.println("Error!");
        }
        System.out.println("Hello " + name + " Anda berhasil Mebuatnya!!!");
    }
}
