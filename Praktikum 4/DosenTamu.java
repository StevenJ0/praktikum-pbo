// Nama File : DosenTamu.java
// Deskripsi : Kelas DosenTamu yang merupakan turunan dari kelas Pegawai
// Pembuat   : Steven Jonathan Sihombing
// NIM       : 24060123120044 
// Tanggal   : 15 Maret 2025

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;


public class DosenTamu extends Pegawai {
    private LocalDate tanggalBerakhirKontrak;
    private double tunjangan; 

    
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("id", "ID"));

    public DosenTamu(String nip, String nama, LocalDate tanggalLahir, LocalDate TMT, String Jabatan, int gajiPokok, LocalDate tanggalBerakhirKontrak) {
        super(nip, nama, tanggalLahir, TMT, Jabatan, gajiPokok);
        this.tanggalBerakhirKontrak = tanggalBerakhirKontrak;
        this.tunjangan = hitungTunjangan(); 
    }

    public String getTanggalBerakhirKontrak() {
        return tanggalBerakhirKontrak.format(FORMATTER); 
    }

    public double getTunjangan() { 
        return tunjangan;
    }

    private double hitungTunjangan() {
        return (2.5 * super.getGajiPokok() ) / 100;
    }

    private int hitungLamaKerja() {
        return Period.between(super.getTMT(), LocalDate.now()).getYears();
    }

    
    public void printInfo() {
        super.printInfo();
        System.out.println("Tanggal Berakhir Kontrak : " + getTanggalBerakhirKontrak());
        System.out.printf("Tunjangan                : Rp %,d\n", (int) tunjangan); 
    }
}
