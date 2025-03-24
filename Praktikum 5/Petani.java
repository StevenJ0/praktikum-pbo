import java.time.LocalDate;

public class Petani extends Manusia implements Pajak {
    private String asalKota;
    private static int counterPetani = 0;

    public Petani(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan, String asalKota) {
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.asalKota = asalKota;
        counterPetani++;
    }

    public String getAsalKota() {
        return asalKota;
    }

    public void setAsalKota(String asalKota) {    
        this.asalKota = asalKota;
    }

    public static int getCounterPetani() {
        return counterPetani;
    }

    @Override
    public int hitungMasaKerja() {
        int tahunSekarang = LocalDate.now().getYear();
        int tahunMulai = getTglMulaiKerja().getYear();

        return (tahunSekarang - tahunMulai) + 0; // Tambahan 0 untuk Petani sesuai aturan
    }

    @Override
    public double hitungPajak() {
        return 0; // Petani tidak dikenakan pajak
    }
}
