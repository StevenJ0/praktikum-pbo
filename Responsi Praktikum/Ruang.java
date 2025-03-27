public class Ruang {
    private String kode ; 
    private double panjang ;
    private double lebar ;
    private double tinggi ;
    private int kapasitas ; 

    public Ruang(){
        this.kode = "" ; 
        this.panjang = 0 ;
        this.lebar = 0 ;
        this.tinggi = 0 ;
        this.kapasitas = 0 ;
    }

    public Ruang(String kode, double panjang, double lebar, double tinggi, int kapasitas) {
        this.kode = kode;
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
        this.kapasitas = kapasitas;
    }

    public String getKode() {
        return kode;
    }

    public double getPanjang() {
        return panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public double getTinggi() {
        return tinggi;
    }

    public int getKapasitas() {
        return kapasitas;
    }

    public void setKapasitas(int kapasitas) {
        this.kapasitas = kapasitas;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public void printInfo() {
        System.out.println("Kode: " + this.kode);
        System.out.println("Panjang: " + this.panjang);
        System.out.println("Lebar: " + this.lebar);
        System.out.println("Tinggi: " + this.tinggi);
        System.out.println("Kapasitas: " + this.kapasitas);
    }
}