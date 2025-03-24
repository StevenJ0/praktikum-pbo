import java.time.LocalDate;

public class PNS extends Manusia implements Pajak {
    private String nip; 
    private static int counterPNS = 0;
    

    public PNS(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan, String nip) {
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public static int getCounterPNS() {
        return counterPNS;
    }

    @Override
    public int hitungMasaKerja() {
        int tahunSekarang = LocalDate.now().getYear();
        int tahunMulai = getTglMulaiKerja().getYear();

        return (tahunSekarang - tahunMulai) + 4; // Tambah 4 tahun untuk PNS
    }

    @Override
    public double hitungPajak() {
        return this.getPendapatan() * 0.1; // Pajak 10% dari pendapatan
    }
}
