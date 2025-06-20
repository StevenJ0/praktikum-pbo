public class MainAnabul{
    public static void main(String[] args) {
        Anabul burung1 = new Burung("Burung") ;
        Anabul kucing1 = new Kucing("Kucing") ;
        Anabul anjing1 = new Anjing("Anjing") ;

        System.out.println("Nama burung : " + burung1.getNama()) ;
        burung1.bersuara();
        burung1.bergerak();

        System.out.println("Nama kucing : " + kucing1.getNama()) ;
        kucing1.bersuara();
        kucing1.bergerak();

        System.out.println("Nama anjing : " + anjing1.getNama()) ;
        anjing1.bersuara();
        anjing1.bergerak();



    }
}