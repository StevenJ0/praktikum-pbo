public abstract class Departemen extends Ruang {
    private String namaDepartemen ; 
    private String ketuaDepartemen ;
    private double tariifBiayaKebersihan ; 

    public Departemen(String kode, double panjang, double lebar, double tinggi, int kapasitas, String namaDepartemen, String ketuaDepartemen, double tariifBiayaKebersihan) {
        super(kode, panjang, lebar, tinggi, kapasitas);
        this.namaDepartemen = namaDepartemen;
        this.ketuaDepartemen = ketuaDepartemen;
        this.tariifBiayaKebersihan = tariifBiayaKebersihan;
    }

    public String getNamaDepartemen() {
        return namaDepartemen;
    }

    public void setNamaDepartemen(String namaDepartemen) {
        this.namaDepartemen = namaDepartemen;
    }

    public String getKetuaDepartemen() {
        return ketuaDepartemen;
    }

    public void setKetuaDepartemen(String ketuaDepartemen) {
        this.ketuaDepartemen = ketuaDepartemen;
    }

    public double getTariifBiayaKebersihan() {
        return tariifBiayaKebersihan;
    }

    public void setTariifBiayaKebersihan(double tariifBiayaKebersihan) {
        this.tariifBiayaKebersihan = tariifBiayaKebersihan;
    }


    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Nama Departemen: " + this.namaDepartemen);
        System.out.println("Ketua Departemen: " + this.ketuaDepartemen);
        System.out.println("Tariif Biaya Kebersihan: " + this.tariifBiayaKebersihan);
    }

    public abstract double hitungBiayaKebersihan();
}