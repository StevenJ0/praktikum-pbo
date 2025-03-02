public class MKendaraan{
    public static void main(String[] args) {
        Kendaraan K1 = new Kendaraan() ;
        K1.setNoPlat("B 1234 AB");
        K1.setJenis("Mobil");
        System.out.println("No Plat Kendaraan : "+K1.getNoPlat()) ;
        System.out.println("Jenis Kendaraan : "+K1.getJenis()) ;
    }   
}