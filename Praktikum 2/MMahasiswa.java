public class MMahasiswa{
    public static void main(String[] args) {
        Mahasiswa M1 = new Mahasiswa() ;
        Dosen D1 = new Dosen("123","Dony","T3"); 
        Kendaraan K1 = new Kendaraan("B 1234 AB","Mobil");
        MataKuliah MK1 = new MataKuliah("TI01","Pemrograman Berbasis Objek",3);
        MataKuliah MK2 = new MataKuliah("TI02","Pemrograman Berbasis Web",3);
        M1.setNIM("12345");
        M1.setNama("Asep");
        M1.setProdi("TI");
        M1.setDosenWali(D1);
        M1.setKendaraan(K1);
        M1.addMatkul(MK1);
        M1.addMatkul(MK2);

        System.out.println("NIM Mahasiswa : "+M1.getNIM()) ;
        System.out.println("");
        System.out.println("Nama Mahasiswa : "+M1.getNama()) ;
        System.out.println("");
        System.out.println("Jurusan : "+M1.getProdi()) ;
        System.out.println("");
        System.out.println("Dosen Wali : "+M1.getDosenWali()) ;
        System.out.println("");
        System.out.println("Kendaraan : ");
        M1.getKendaraan();
        System.out.println("");
        M1.getMataKuliah();
        System.out.println("");
        System.out.println("Jumlah Matkul : "+M1.getJumlahMatkul()) ;
        System.out.println("");
        System.out.println("Jumlah SKS : "+M1.getJumlahSKS()) ;
        System.out.println("");
        M1.printMhs();
        System.out.println("");
        M1.printDetailMhs();

    }
}