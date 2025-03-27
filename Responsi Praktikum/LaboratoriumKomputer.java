public class LaboratoriumKomputer extends RuangLaboratorium {
    private int jumlahKomputer;

    public LaboratoriumKomputer(String kode, double panjang, double lebar, double tinggi, int kapasitas, String namaLab, int hargaSewa, int jumlahKomputer) {
        super(kode, panjang, lebar, tinggi, kapasitas, namaLab, hargaSewa);
        this.jumlahKomputer = jumlahKomputer;
    }

    public int getJumlahKomputer() {
        return jumlahKomputer;
    }

    public void setJumlahKomputer(int jumlahKomputer) {
        this.jumlahKomputer = jumlahKomputer;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jumlah Komputer: " + this.jumlahKomputer);
    }
}
