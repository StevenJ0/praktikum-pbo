import java.util.List;

public class Main{
    public static void main(String[] args) {
        RuangKelas kelas = new RuangKelas("K01", 20, 10, 3, 50, 40, 10);

        System.out.println("=========================== Implementasi Ruang Kelas ==================================");
        kelas.printInfo();
        System.out.println("Biaya Kebersihan: " + kelas.hitungBiayaKebersihan());
        System.out.println("=============================================================");

        RuangDosen dosen = new RuangDosen("D01", 10, 5, 3, 50, "Departemen Teknologi Informasi", "Budi", 10000, "Santoso", 40, 20);

        System.out.println("============================ Implementasi Ruang Dosen =================================");
        dosen.printInfo();
        System.out.println("Biaya Kebersihan: " + dosen.hitungBiayaKebersihan());
        System.out.println("=============================================================");

        RuangDepartemen departemen = new RuangDepartemen("D01", 14, 25, 3, 50, "Departemen Teknologi Informasi", "Budi", 10000, 40, 20, 10);

        System.out.println("============================ Implementasi Ruang Departemen ============================");
        departemen.printInfo();
        System.out.println("Biaya Kebersihan: " + departemen.hitungBiayaKebersihan());
        System.out.println("=============================================================");

        RuangLaboratorium laboratorium = new RuangLaboratorium("L01", 11, 6, 3, 50, "Laboratorium Komputer", 100000);

        System.out.println("============================ Implementasi Ruang Laboratorium ============================");
        laboratorium.printInfo();
        System.out.println("Biaya Kebersihan: " + laboratorium.hitungBiayaKebersihan());
        System.out.println("=============================================================");

        LaboratoriumKomputer komputer = new LaboratoriumKomputer("L01", 11, 6, 3, 50, "Laboratorium Komputer", 10000 , 5 );

        System.out.println("============================ Implementasi Laboratorium Komputer ============================");
        komputer.printInfo();
        System.out.println("Biaya Kebersihan: " + komputer.hitungBiayaKebersihan());
        System.out.println("=============================================================");

        LaboratoriumNonKomputer nonKomputer = new LaboratoriumNonKomputer("L01", 11, 6, 3, 50, "Laboratorium Komputer", 200000, List.of("Matematika", "Fisika"));

        System.out.println("============================ Implementasi Laboratorium Non Komputer ============================");
        nonKomputer.printInfo();
        System.out.println("Biaya Kebersihan: " + nonKomputer.hitungBiayaKebersihan());
        System.out.println("=============================================================");
    }
}