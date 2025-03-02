public class MDosen{
    public static void main(String[] args) {
        Dosen D1 = new Dosen() ;
        D1.setNIP("12345");
        D1.setNama("Asep");
        D1.setProdi("TI");
        System.out.println("NIP Dosen : "+D1.getNIP()) ;
        System.out.println("Nama Dosen : "+D1.getNama()) ;
        System.out.println("Prodi : "+D1.getProdi()) ;
    }
}