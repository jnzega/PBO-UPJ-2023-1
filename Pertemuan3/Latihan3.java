package Pertemuan3;

/*
* Pada suatu ujian didapatkan nilai hasil ujian sebagai
* berikut:
*
* +---------+-------+-------+
* | Nama    | Nilai | Grade |
* +---------+-------+-------+
* | Adi     | 70    |       |
* | Budi    | 65    |       |
* | Caca    | 90    |       |
* | Deny    | 75    |       |
* +---------+-------+-------+
*
* Buatlah listing program untuk memberikan Grade pada
* masing-masing mahasiswa pada tabel tersebut. Jika
* kaidah pemberian Grade seperti berikut:
*
* 36 - 45 = D
* 46 - 55 = C
* 65 - 65 = C+
* 66 - 75 = B
* 76 - 85 = B+
* 86 - 100 = A
*
* Kemudian munculkan pesan pemilik nilai terendah dan pemilik
* nilai terkecil.
*/

import java.util.Arrays;

public class Latihan3 {
    public static boolean isBetween(int x, int lower, int upper) {
        return lower <= x && x <= upper;
    }

    public static void main(String[] args) {
        String[] name = {"Adi", "Budi", "Caca", "Deny"};
        int[] nilai = {70, 65, 90, 75};
        String[] grade = new String[4];

        for (int i = 0; i < grade.length; i++) {
            if (isBetween(nilai[i], 36, 45)) {
                grade[i] = "D";
            } else if (isBetween(nilai[i], 46, 55)) {
                grade[i] = "C";
            } else if (isBetween(nilai[i], 56, 65)) {
                grade[i] = "C+";
            } else if (isBetween(nilai[i], 66, 75)) {
                grade[i] = "B";
            } else if (isBetween(nilai[i], 76, 85)) {
                grade[i] = "B+";
            } else if (isBetween(nilai[i], 86, 100)) {
                grade[i] = "A";
            }
        }

        for (int i = 0; i < name.length; i++) {
            System.out.println(String.format("%s %d %s", name[i], nilai[i], grade[i]));
        }

        Arrays.sort(nilai);

        System.out.println(String.format("Nilai terkecil: %d", nilai[0]));
        System.out.println(String.format("Nilai terbesar: %d", nilai[nilai.length - 1]));
    }
}
