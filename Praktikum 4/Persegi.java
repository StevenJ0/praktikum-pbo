public class Persegi extends BangunDatar{
    private double sisi ;

    public Persegi(){
        setJmlSisi(4);
    }

    public Persegi(double sisi , String warna , String Border){
        super(4 , warna , Border);
        this.sisi = sisi ; 
         
    }

    public double getSisi(){
        return sisi ;
    }

    public void setSisi(double sisi){
        this.sisi = sisi ;
    }
    public void printInfo(){
        super.printInfo();
        System.out.println("Sisi : " + sisi);
    }
    
}