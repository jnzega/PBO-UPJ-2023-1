package Pertemuan9;

public class Latihan9Oa {
    public void Segiempat(int panjang, int lebar){
        double luas, keliling;
        luas = panjang * lebar;
        System.out.println("--------------------------------------");
        System.out.println("Panjang Segi Empat = " + panjang);
        System.out.println("Lebar Segi Empat = " + lebar);
        System.out.println("Luas Segi Empat = " + luas);
        System.out.println("--------------------------------------");
    }

    public static void main(String[] args) {
        Latihan9Oa se = new Latihan9Oa();
        se.Segiempat(10, 5);
    }
}
