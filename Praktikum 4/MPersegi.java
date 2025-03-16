public class MPersegi {
    public static void main(String[] args) {
        Persegi p1 = new Persegi(5 , "Merah" , "Hitam");
        System.out.println("==============================================");
        System.out.println("Ukuran sisi : " + p1.getSisi());
        System.out.println("==============================================");
        p1.printInfo();
    }
}