public class MBangunDatar extends BangunDatar{
    public static void main(String[] args) {
        BangunDatar b1 = new BangunDatar(4 , "Merah" , "Biru") ;
        System.out.println("==============================================");
        System.out.println("=================== Jumlah Sisi ======================");
        System.out.println("Jumlah sisi :" + b1.getJmlSisi());
        System.out.println("=================== Warna Bangun Datar :  ======================");
        System.out.println("Warna :" + b1.getWarna());
        System.out.println("=================== Warna Border Bangun Datar :  ======================");
        System.out.println("Border :" + b1.getBorder());
        System.out.println("=================== Info Bangun Datar :  ======================");
        b1.printInfo();
        System.out.println("=======================Jumlah Sisi Baru ========================");
        b1.setJmlSisi(5);
        System.out.println("Jumlah sisi :" + b1.getJmlSisi());
        System.out.println("======================= Warna Baru ========================");
        b1.setWarna("Hijau");
        System.out.println("Warna :" + b1.getWarna());
        System.out.println("======================= Border Baru ========================");
        b1.setBorder("Hitam");
        System.out.println("Border :" + b1.getBorder());
        System.out.println("======================= Info Baru ========================");
        b1.printInfo();
    }
}