// Nama File : MTendik.java
// Deskripsi : Kelas Main Tendik yang merupakan turunan dari kelas Pegawai
// Pembuat   : Steven Jonathan Sihombing
// NIM       : 24060123120044 
// Tanggal   : 15 Maret 2025

import java.time.LocalDate;

public class MTendik {
    public static void main(String[] args) {
        Tendik t1 = new Tendik("12345", "Budi",
                LocalDate.of(2000, 1, 1),
                LocalDate.of(2022, 1, 1),
                "Tenaga Pendidik" , 
                5000000,
                "Matematika");

        t1.printInfo();
    }
}