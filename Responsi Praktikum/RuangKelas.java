public class RuangKelas extends Ruang implements Fakultas {
    private int jumlahKursiTersedia ; 
    private int jumlahKursiRusak ;

    public RuangKelas() {
        this.jumlahKursiTersedia = 0;
        this.jumlahKursiRusak = 0;
    }

    public RuangKelas(String kode, double panjang, double lebar, double tinggi, int kapasitas, int jumlahKursiTersedia, int jumlahKursiRusak) {
        super(kode, panjang, lebar, tinggi, kapasitas);
        this.jumlahKursiTersedia = jumlahKursiTersedia;
        this.jumlahKursiRusak = jumlahKursiRusak;
    }

    public int getJumlahKursiTersedia() {
        return jumlahKursiTersedia;
    }

    public int getJumlahKursiRusak() {
        return jumlahKursiRusak;
    }

    public void setJumlahKursiTersedia(int jumlahKursiTersedia) {
        this.jumlahKursiTersedia = jumlahKursiTersedia;
    }

    public void setJumlahKursiRusak(int jumlahKursiRusak) {
        this.jumlahKursiRusak = jumlahKursiRusak;
    }

    @Override

    public double getTarifKebersihan() {
        return TARIF_KEBERSIHAN;
    }

    public double hitungBiayaKebersihan() {
        return getTarifKebersihan() * getPanjang() * getLebar() ;
    }


    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jumlah kursi tersedia: " + this.jumlahKursiTersedia);
        System.out.println("Jumlah kursi rusak: " + this.jumlahKursiRusak);
    }
}