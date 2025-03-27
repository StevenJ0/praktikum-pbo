import java.util.List;

public class LaboratoriumNonKomputer extends RuangLaboratorium {
    private List<String> daftarMataKuliah;

    public LaboratoriumNonKomputer(String kode, double panjang, double lebar, double tinggi, int kapasitas, 
                                   String namaLab, int hargaSewa, List<String> daftarMataKuliah) {
        super(kode, panjang, lebar, tinggi, kapasitas, namaLab, hargaSewa);
        this.daftarMataKuliah = daftarMataKuliah;
    }

    public List<String> getDaftarMataKuliah() {
        return daftarMataKuliah;
    }

    public void setDaftarMataKuliah(List<String> daftarMataKuliah) {
        this.daftarMataKuliah = daftarMataKuliah;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Mata Kuliah yang Di-handle: " + String.join(", ", daftarMataKuliah));
    }
}
