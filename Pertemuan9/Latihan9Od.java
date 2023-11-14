package Pertemuan9;
class VolumeBangunRuang{
    public double volumeTabung(double r, double t){
        double volume = Math.PI * Math.pow(r, 2) * t;
        return volume;
    }
    public double volumeKerucut(double r, double t){
        double volume = 1/3 * (Math.PI * Math.pow(r, 2) * t);
        return volume;
    }
    public double volumeBola(double r){
        double volume = 4/3 * Math.PI * Math.pow(r, 3);
        return volume;
    }
}
public class Latihan9Od {
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args){

        System.out.println("MENCARI VOLUME: ");
        System.out.println("1. Tabung");
        System.out.println("2. Kerucut");
        System.out.println("3. Bola");
        System.out.println("Masukkan Pilihan = ");
        InputConsole input = new InputConsole();
        int pilihan = input.readInt();

        if (pilihan == 1){
            clearScreen();
            System.out.println("Masukkan jari-jari = ");
            double jariJari = input.readInt();
            System.out.println("Masukkan tinggi = ");
            double tinggi = input.readInt();
            VolumeBangunRuang tabung = new VolumeBangunRuang();
            double tabung1 = tabung.volumeTabung(jariJari, tinggi);
            clearScreen();
            System.out.println("Volume tabung = " + tabung1);
        } else if (pilihan == 2) {
            clearScreen();
            System.out.println("Masukkan jari-jari = ");
            double jariJari = input.readInt();
            System.out.println("Masukkan tinggi = ");
            double tinggi = input.readInt();
            VolumeBangunRuang kerucut = new VolumeBangunRuang();
            double kerucut1 = kerucut.volumeKerucut(jariJari, tinggi);
            clearScreen();
            System.out.println("Volume kerucut = " + kerucut1);
        } else if (pilihan == 3) {
            clearScreen();
            System.out.println("Masukkan jari-jari = ");
            double jariJari = input.readInt();
            VolumeBangunRuang bola = new VolumeBangunRuang();
            double bola1 = bola.volumeBola(jariJari);
            clearScreen();
            System.out.println("Volume bola = " + bola1);
        } else {
            clearScreen();
            System.out.println("PILIHAN TIDAK TERSEBDIA");
        }
    }
}
