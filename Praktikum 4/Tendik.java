// Nama File : Tendik.java
// Deskripsi : Kelas Tendik yang merupakan turunan dari kelas Pegawai
// Pembuat   : Steven Jonathan Sihombing
// NIM       : 24060123120044 
// Tanggal   : 15 Maret 2025

import java.time.LocalDate;
import java.time.Period;
import java.time.format.TextStyle;
import java.util.Locale;


public class Tendik extends Pegawai {
    private String bidang; 
    private int tunjangan; 

    public Tendik(String nip, String nama, LocalDate tanggalLahir, LocalDate TMT, String jabatan , int gajiPokok, String bidang) {
        super(nip, nama, tanggalLahir, TMT, jabatan, gajiPokok);

        if (super.getUsia() > 55) { 
            throw new IllegalArgumentException("Usia tenaga kependidikan tidak boleh lebih dari 55 tahun!");
        }

        this.bidang = bidang;
        this.tunjangan = hitungTunjangan();
    }

    public String getBidang() {
        return this.bidang;
    }

    public int getTunjangan() { 
        return this.tunjangan;
    }

    private int hitungLamaKerja() {
        return Period.between(super.getTMT(), LocalDate.now()).getYears();
    }

    private int hitungTunjangan() {
        return (super.getGajiPokok() * hitungLamaKerja()) / 100;
    }

    public void setBidang(String bidang) {
        this.bidang = bidang;
    }

    public LocalDate hitungBUP() {
        return ambilTangganLahir().plusYears(65).withDayOfMonth(1).plusMonths(1);
    }

    public String BUP(){
        LocalDate tanggalBUP = hitungBUP();
        String bulan = tanggalBUP.getMonth().getDisplayName(TextStyle.FULL, new Locale("id"));
        return tanggalBUP.getDayOfMonth() + " " + bulan + " " + tanggalBUP.getYear();
    }
    

    public void printInfo() {
        super.printInfo();
        System.out.println("Bidang       : " + bidang);
        System.out.printf("Tunjangan    : Rp %,d\n", tunjangan);
        System.out.println("BUP          : " + BUP()); 
    }
}
