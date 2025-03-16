// Nama File : MDosenTetap.java
// Deskripsi : Kelas Main DosenTetap yang merupakan turunan dari kelas Pegawai
// Pembuat   : Steven Jonathan Sihombing
// NIM       : 24060123120044 
// Tanggal   : 15 Maret 2025

import java.time.LocalDate;

public class MDosenTetap {
    public static void main(String[] args) {
        
        DosenTetap d1 = new DosenTetap("12345", "Budi", 
                        LocalDate.of(2000, 1, 1), 
                        LocalDate.of(2022, 1, 1), 
                        "Dosen Tetap",
                        5000000, "12345");

        System.out.println("==============================================");
        System.out.println("NIDN         : " + d1.getNIDN());
        System.out.println("Tunjangan    : " + d1.getTunjangan());
        System.out.println("==============================================");
        d1.printInfo();
    }
}
