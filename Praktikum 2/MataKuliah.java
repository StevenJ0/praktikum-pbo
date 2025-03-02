public class MataKuliah {
    private  String IDMatkul , NamaMatkul ; 
    private int SKS ;

    public MataKuliah(){
        this.IDMatkul = "" ;
        this.NamaMatkul = "" ;
        this.SKS = 0 ;
    }

    public MataKuliah(String IDMatkul , String NamaMatkul , int SKS ){
        this.IDMatkul = IDMatkul ;
        this.NamaMatkul = NamaMatkul ;
        this.SKS = SKS ;
    } 

    public String getIdMatkul(){
        return this.IDMatkul ;
    }

    public String getNamaMatkul(){
        return this.NamaMatkul ;
    }

    public int getSKS(){
        return this.SKS ;
    }

    public void setNamaMatkul(String NamaMatkul){
        this.NamaMatkul = NamaMatkul ;
    }

    public void setSKS(int SKS){
        this.SKS = SKS ;
    }

    public void setIDMatkul(String IDMatkul){
        this.IDMatkul = IDMatkul ;
    }

}