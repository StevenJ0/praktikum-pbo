import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Manusia {
    private String nama;
    private LocalDate tglMulaiKerja;
    private String alamat;
    private double pendapatan;
    private static int counterMns = 0;

    public Manusia () {
        this.nama = "" ; 
        
    }

    public Manusia(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan) {
        this.nama = nama;
        this.tglMulaiKerja = tglMulaiKerja;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }

    public String getNama() {
        return nama;
    }

    public LocalDate getTglMulaiKerja() {   
        return tglMulaiKerja;
    }

    public String getFormattedTglMulaiKerja() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return tglMulaiKerja.format(formatter);
    }

    public String getAlamat() {
        return alamat;
    }

    public double getPendapatan() {
        return pendapatan;
    }

    public static int getCounterMns() {
        return counterMns;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setTglMulaiKerja(LocalDate tglMulaiKerja) {  
        this.tglMulaiKerja = tglMulaiKerja;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setPendapatan(double pendapatan) {
        this.pendapatan = pendapatan;
    }

    public void cetakInfo() {
        System.out.println("Nama : " + this.getNama());
        System.out.println("Tanggal Mulai Kerja : " + this.getFormattedTglMulaiKerja());
        System.out.println("Alamat : " + this.getAlamat());
        System.out.println("Pendapatan : " + this.getPendapatan());
    }

    public abstract int hitungMasaKerja();
}
