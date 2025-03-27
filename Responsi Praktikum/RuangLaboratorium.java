public class RuangLaboratorium extends Ruang implements Fakultas{
    private String namaLab ; 
    public int hargaSewa ; 

    public RuangLaboratorium() {
        this.namaLab = "" ; 
        this.hargaSewa = 0 ; 
    }

    public RuangLaboratorium(String kode, double panjang, double lebar, double tinggi, int kapasitas, String namaLab, int hargaSewa) {
        super(kode, panjang, lebar, tinggi, kapasitas);
        this.namaLab = namaLab;
        this.hargaSewa = hargaSewa;
    }

    public String getNamaLab() {
        return namaLab;
    }

    public void setNamaLab(String namaLab) {    
        this.namaLab = namaLab;    
    }

    public int getHargaSewa() {
        return hargaSewa;
    }

    public void setHargaSewa(int hargaSewa) {
        this.hargaSewa = hargaSewa;
    }

    @Override

    public double getTarifKebersihan() {
        return TARIF_KEBERSIHAN;
    }

    public double hitungBiayaKebersihan() {
        return getTarifKebersihan() * getPanjang() * getLebar();
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Nama Laboratorium: " + this.namaLab);
        System.out.println("Harga Sewa: " + this.hargaSewa);
    }
    
}