package Pertemuan7;
class Phone {
    private String merk;
    private int harga;

    public Phone() {
        this.merk = "Unknown";
        this.harga = 0;
    }

    public Phone(String merk) {
        this.merk = merk;
        this.harga = 0;
    }

    public Phone(String merk, int harga) {
        this.merk = merk;
        this.harga = harga;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void lihatPhone() {
        System.out.println("Merk: " + merk);
        System.out.println("Harga: " + harga);
        System.out.println();
    }
}

public class Pertemuan7D {
    public static void main(String[] args) {
        System.out.println("Perbedaan Output dari masing-masing konstruktor");
        Phone p1 = new Phone();
        p1.lihatPhone();

        Phone p2 = new Phone("Nokia");
        p2.lihatPhone();

        Phone p3 = new Phone("Sony Ericsson", 500);
        p3.lihatPhone();

        System.out.println("Perbedaan Output dari masing-masing method");
        Phone p4 = new Phone();
        Phone p5 = new Phone();
        p4.setMerk("Samsung");
        p5.setMerk("Samsung");
        p5.setHarga(5000);
        p4.lihatPhone();
        p5.lihatPhone();
    }
}