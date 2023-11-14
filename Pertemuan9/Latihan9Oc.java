package Pertemuan9;

public class Latihan9Oc {
    public double luas_lingkaran(int diameter) {
        int jari2 = diameter/2;
        double luas = Math.PI * Math.pow(jari2,2);
        return luas;
    }
    public void hitungLuasLingkaran(int jari2){
        double luas = Math.PI * Math.pow(jari2, 2);
        System.out.println(luas);
    }
    public static void main(String[] args) {
        Latihan9Oc mt = new Latihan9Oc();
        mt.hitungLuasLingkaran(10);
        System.out.println(mt.luas_lingkaran(20));
        System.exit(0);
    }
}
