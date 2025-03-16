// Nama File : MDosenTamu.java
// Deskripsi : Kelas Main DosenTamu yang merupakan turunan dari kelas Pegawai
// Pembuat   : Steven Jonathan Sihombing
// NIM       : 24060123120044 
// Tanggal   : 15 Maret 2025

import java.time.LocalDate;

public class MDosenTamu {
    public static void main(String[] args) {
        DosenTamu d1 = new DosenTamu("12345", "Budi",
                LocalDate.of(2000, 1, 1),
                LocalDate.of(2022, 1, 1),
                "Dosen Tamu",
                5000000,
                LocalDate.of(2025, 1, 1));

        d1.printInfo();
    }
}
