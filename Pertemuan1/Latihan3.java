package Pertemuan1;

/*
* Pak Soleh ingin naik haji, kemudian ikut tabungan haji
* ONH. Biaya haji pada waktu itu adalah Rp50juta. Pak
* Soleh sudah mengumpulkan tabungan di rumah sebanyak
* Rp20juta, kemudian sebagai tabungan pembuka ia
* memasukkan tabungan ONH sebesar Rp10juta. Jika bulan ini
* Pak Soleh baru membuka tabungan dan cicilan pertama
* dimulai bulan depan, maka berapa minimal cicilan
* yang harus ia tabungkan jika dijadwalkan Pak Soleh
* naik haji 2 tahun lagi? Selesaikan program untuk
* menghitung nilai cicilan tersebut!
*/

public class Latihan3 {
    public static void main(String[] args) {

        int biayaHaji = 50000000;
        int tabunganAwal = 10000000;

        int sisaBiayaHaji = biayaHaji - tabunganAwal;

        int jumlahTargetBulan = 24;

        int targetPerBulan = sisaBiayaHaji/jumlahTargetBulan;

        System.out.println(String.format("Minimal cicilan jika dijadwalkan naik haji dalam 2 tahun adalah: Rp%,d", targetPerBulan));


    }
}
