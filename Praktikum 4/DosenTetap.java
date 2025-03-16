// Nama File : DosenTetap.java
// Deskripsi : Kelas DosenTetap yang merupakan turunan dari kelas Pegawai
// Pembuat   : Steven Jonathan Sihombing
// NIM       : 24060123120044 
// Tanggal   : 15 Maret 2025

import java.time.LocalDate;
import java.time.Period;
import java.time.format.TextStyle;
import java.util.Locale;

public class DosenTetap extends Pegawai {
    private String NIDN;
    private int tunjangan;

    public DosenTetap(String nip, String nama, LocalDate tanggalLahir, LocalDate TMT,String Jabatan, int gajiPokok, String NIDN) {
        super(nip, nama, tanggalLahir, TMT, Jabatan, gajiPokok);

        if (super.getUsia() > 65) {
            throw new IllegalArgumentException("Usia dosen tetap tidak boleh lebih dari 65 tahun!");
        }

        this.NIDN = NIDN;
        this.tunjangan = hitungTunjangan();
    }

    private int hitungLamaKerja() {
        return Period.between(super.getTMT(), LocalDate.now()).getYears();
    }

    private int hitungTunjangan() {
        return (2 * super.getGajiPokok() * hitungLamaKerja()) / 100;
    }

    public String getNIDN() {
        return this.NIDN;
    }

    public void setNIDN(String NIDN) {
        this.NIDN = NIDN;
    }

    public int getTunjangan() {
        return this.tunjangan;
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
        System.out.println("NIDN         : " + NIDN);
        super.printInfo();
        System.out.println("Tunjangan    : Rp " + String.format("%,d", tunjangan));
        System.out.println("BUP          : " + BUP());
    }
}
