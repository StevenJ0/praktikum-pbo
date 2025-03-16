public class Lingkaran extends BangunDatar{
    private double jari2 ;
    public Lingkaran(){
        setJmlSisi(1);
    } 
    public Lingkaran(double jari2 , String warna , String border){
        super(1 , warna , border);
        this.jari2 = jari2 ;
    }
    public double getJari2(){
        return jari2 ;
    }
    public void setJari2(double jari2){
        this.jari2 = jari2 ;
    }
    public double getLuas(){
        return 3.14 * jari2 * jari2 ;
    }
    public double getKeliling(){
        return 2 * 3.14 * jari2 ;
    }
}