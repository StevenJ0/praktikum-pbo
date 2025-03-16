// Nama File : Pegawai.java
// Deskripsi : Kelas Pegawai yang merupakan turunan dari kelas Pegawai
// Pembuat   : Steven Jonathan Sihombing
// NIM       : 24060123120044 
// Tanggal   : 15 Maret 2025

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Pegawai {
    private String nip;
    private String nama;
    private LocalDate tanggalLahir;
    private LocalDate TMT; // Ubah TMT menjadi LocalDate
    private String jabatan;
    private int gajiPokok;
    private int usia; // Tambahkan atribut usia

    // Formatter untuk tanggal dalam format "5 Mei 1990"
    private static final DateTimeFormatter FORMATTER = 
        DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("id", "ID"));

    // Konstruktor
    public Pegawai(String nip, String nama, LocalDate tanggalLahir, LocalDate TMT, String jabatan, int gajiPokok) {
        this.nip = nip;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.TMT = TMT;
        this.jabatan = jabatan;
        this.gajiPokok = gajiPokok;
        this.usia = hitungUsia(); // Hitung usia saat objek dibuat
    }

    // Method untuk menghitung usia berdasarkan tanggal lahir
    private int hitungUsia() {
        return Period.between(this.tanggalLahir, LocalDate.now()).getYears();
    }

    // Getter
    public String getNip() {
        return this.nip;
    }

    public String getNama() {
        return this.nama;
    }

    public LocalDate ambilTangganLahir() {
        return this.tanggalLahir;
    }

    public String getTanggalLahir() {
        return this.tanggalLahir.format(FORMATTER);
    }

    public LocalDate getTMT() { 
        return this.TMT;
    }

    public int getGajiPokok() {
        return this.gajiPokok;
    }

    public int getUsia() {
        return this.usia;
    }

    public String getJabatan() {
        return this.jabatan;
    }

    public void setJabatan(String Jabatan){
        this.jabatan = Jabatan;
    }

    // Setter
    public void setNip(String nip) {
        this.nip = nip;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setTanggalLahir(String tanggalLahir) {
        this.tanggalLahir = LocalDate.parse(tanggalLahir, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        this.usia = hitungUsia(); // Perbarui usia saat tanggal lahir berubah
    }

    public void setTMT(String TMT) { 
        this.TMT = LocalDate.parse(TMT, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }

    public void setGajiPokok(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public String hitungMasaKerja() {
        Period selisih = Period.between(getTMT(), LocalDate.now());
        int tahun = selisih.getYears();
        int bulan = selisih.getMonths();
        return tahun + " tahun " + bulan + " bulan";
    }

    // Method untuk menampilkan informasi pegawai
    public void printInfo() {
        System.out.println("\n=== Informasi Pegawai ===");
        System.out.println("NIP          : " + nip);
        System.out.println("Nama         : " + nama);
        System.out.println("Tanggal Lahir: " + getTanggalLahir());
        System.out.println("Jabatan      : " + jabatan);
        System.out.println("Usia         : " + usia + " tahun");
        System.out.println("TMT          : " + getTMT());
        System.out.println("Gaji Pokok   : Rp " + String.format("%,d", gajiPokok));
        System.out.println("Masa Kerja   : " + hitungMasaKerja());
    }

}
