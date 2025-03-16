public class  BangunDatar{
    private int jmlSisi ; 
    private String warna ;
    private String border ; 
    private static int counterBangunDatar = 0 ;

    public BangunDatar(){
        counterBangunDatar ++ ; 
    }
    public BangunDatar(int jmlSisi , String warna , String border){
        this.jmlSisi = jmlSisi ; 
        this.warna = warna ; 
        this.border = border ;
        counterBangunDatar ++ ;
    }

    public int getJmlSisi(){
        return jmlSisi ;  
    }

    public void setJmlSisi(int x){
        this.jmlSisi = x ; 
    }

    public String getWarna(){
        return this.warna ;
    }

    public void setWarna(String X){
        this.warna = X ; 
    }

    public String getBorder(){
        return this.border ; 
    }

    public void setBorder(String X){
        this.border = X ; 
    }

    public void printInfo(){
        System.err.println("Jumlah sisi : " + jmlSisi);
        System.err.println("Warna : " + warna);
        System.err.println("Border : " + border);
    }

    public static void getCounterBangunDatar(){
        System.out.println("Jumlah bangun datar : " + counterBangunDatar);
    }


}