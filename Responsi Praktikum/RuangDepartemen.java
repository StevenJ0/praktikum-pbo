public class RuangDepartemen extends Departemen{
    private int jumlahMeja ; 
    private int jumlahKursi ;
    private int jumlahLemari ;

    public RuangDepartemen(String kode, double panjang, double lebar, double tinggi, int kapasitas, String namaDepartemen, String ketuaDepartemen, double tariifBiayaKebersihan, int jumlahMeja, int jumlahKursi, int jumlahLemari) {
        super(kode, panjang, lebar, tinggi, kapasitas, namaDepartemen, ketuaDepartemen, tariifBiayaKebersihan);
        this.jumlahMeja = jumlahMeja;
        this.jumlahKursi = jumlahKursi;
        this.jumlahLemari = jumlahLemari;
    }

    public int getJumlahMeja() {
        return jumlahMeja;
    }

    public int getJumlahKursi() {
        return jumlahKursi;
    }

    public int getJumlahLemari() {
        return jumlahLemari;
    }

    public void setJumlahMeja(int jumlahMeja) {
        this.jumlahMeja = jumlahMeja;
    }

    public void setJumlahKursi(int jumlahKursi) {
        this.jumlahKursi = jumlahKursi;
    }

    public void setJumlahLemari(int jumlahLemari) {
        this.jumlahLemari = jumlahLemari;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jumlah meja: " + this.jumlahMeja);
        System.out.println("Jumlah kursi: " + this.jumlahKursi);
        System.out.println("Jumlah lemari: " + this.jumlahLemari);
    }

    @Override
    public double hitungBiayaKebersihan() {
        return getPanjang() * getLebar() * getTariifBiayaKebersihan() ; 
    }


}