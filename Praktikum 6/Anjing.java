public class Anjing extends Anabul {

    public Anjing(String nama){
        this.setNama(nama);
    }
    @Override

    public void bergerak(){
        System.out.println("Gerak anjing : Melata");
    }

    @Override
    public void bersuara(){
        System.out.println("Suara anjing : Guk guk");
    }
}