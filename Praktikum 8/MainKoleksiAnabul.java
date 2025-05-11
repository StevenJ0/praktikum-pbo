import java.util.Random;

public class MainKoleksiAnabul {
    public static void main(String[] args) {
        Koleksi<Anabul> koleksiAnabul = new Koleksi<>();
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            int pilih = rand.nextInt(3);
            Anabul a;
            switch (pilih) {
                case 0: a = new Kucing("Kucing " + i); break;
                case 1: a = new Anjing("Anjing " + i); break;
                default: a = new Burung("Burung " + i); break;
            }
            koleksiAnabul.add(a);
        }

        // Show all
        for (int i = 0; i < koleksiAnabul.getSize(); i++) {
            koleksiAnabul.getIsi(i).showInfo();
            System.out.println("-----");
        }
    }
}
