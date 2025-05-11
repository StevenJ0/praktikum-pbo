public class MainKoleksi {
    public static void main(String[] args) {
        Koleksi<Character> koleksiChar = new Koleksi<>();
        for (char c = 'A'; c <= 'J'; c++) {
            koleksiChar.add(c);
        }

        koleksiChar.showAll();
    }
}
