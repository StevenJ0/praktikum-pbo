import java.time.LocalDate;

public class Pengusaha extends Manusia implements Pajak {
    private String npwp; 
    private static int counterPengusaha = 0;

    public Pengusaha(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan, String npwp) {
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    public String getNpwp() {
        return npwp;
    }

    public void setNpwp(String npwp) {
        this.npwp = npwp;
    }

    public static int getCounterPengusaha() {
        return counterPengusaha;
    }

    @Override
    public int hitungMasaKerja() {
        int tahunSekarang = LocalDate.now().getYear();
        int tahunMulai = getTglMulaiKerja().getYear();

        return (tahunSekarang - tahunMulai) + 4; // Tambah 4 tahun untuk Pengusaha
    }

    @Override
    public double hitungPajak() {
        return this.getPendapatan() * 0.15; // Pajak 15% dari pendapatan
    }
}
