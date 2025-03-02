public class MMataKuliah{
    public static void main(String[] args) {
        MataKuliah M1 = new MataKuliah() ;
        M1.setIDMatkul("TI01");
        M1.setNamaMatkul("Pemrograman Berbasis Objek");
        M1.setSKS(3);
        System.out.println("ID Mata Kuliah : "+M1.getIdMatkul());
        System.out.println("Nama Mata Kuliah : "+M1.getNamaMatkul());
        System.out.println("SKS Mata Kuliah : "+M1.getSKS());
    }
}