public class RuangDosen extends Departemen {
    private String namaDosen ; 
    private int jumlahKursi ;
    private int jumlahMeja ;

    public RuangDosen(String kode, double panjang, double lebar, double tinggi, int kapasitas, String namaDepartemen, String ketuaDepartemen, double tariifBiayaKebersihan, String namaDosen, int jumlahKursi, int jumlahMeja) {
        super(kode, panjang, lebar, tinggi, kapasitas, namaDepartemen, ketuaDepartemen, tariifBiayaKebersihan);
        this.namaDosen = namaDosen;
        this.jumlahKursi = jumlahKursi;
        this.jumlahMeja = jumlahMeja;
    }

    public String getNamaDosen() {
        return namaDosen;
    }

    public int getJumlahKursi() {
        return jumlahKursi;
    }

    public int getJumlahMeja() {
        return jumlahMeja;
    }

    public void setNamaDosen(String namaDosen) {
        this.namaDosen = namaDosen;
    }

    public void setJumlahKursi(int jumlahKursi) {
        this.jumlahKursi = jumlahKursi;
    }

    public void setJumlahMeja(int jumlahMeja) {
        this.jumlahMeja = jumlahMeja;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Nama Dosen: " + this.namaDosen);
        System.out.println("Jumlah kursi: " + this.jumlahKursi);
        System.out.println("Jumlah meja: " + this.jumlahMeja);
    }

    @Override
    public double hitungBiayaKebersihan() {
        return getPanjang() * getLebar() * getTariifBiayaKebersihan() ; 
    }


}