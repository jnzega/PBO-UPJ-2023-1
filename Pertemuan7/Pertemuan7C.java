package Pertemuan7;

class Manusia{
    private String nama;
    private int umur;
    public void setNama(String a){
        nama = a;
    }
    public void setUmur(int b){
        umur = b;
    }

    public int getUmur(){
        return umur;
    }

    public String getNama(){
        return nama;
    }
}

public class Pertemuan7C {
    public static void main(String[] args) {
        Manusia orang1 = new Manusia();
        Manusia orang2 = new Manusia();

        orang1.setNama("Budi");
        orang1.setUmur(20);

        orang2.setNama("Andi");
        orang2.setUmur(25);

        System.out.println(orang1.getNama());
        System.out.println(orang1.getUmur());

        System.out.println(orang2.getNama());
        System.out.println(orang2.getUmur());
    }
}
