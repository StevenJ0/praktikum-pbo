
import java.util.ArrayList;


public class Mahasiswa{
    private String NIM , Nama , Prodi ;
    private static  ArrayList<MataKuliah> listMatKul;
    private Dosen dosenWali ; 
    private Kendaraan kendaraan ; 

    public Mahasiswa(){
        this.NIM = "" ;
        this.Nama = "" ;
        this.Prodi = "" ;
        this.dosenWali = new Dosen() ;
        this.kendaraan = new Kendaraan() ;
        this.listMatKul = new ArrayList<MataKuliah>(50) ;
    }

    public Mahasiswa(String NIM , String Nama , String Prodi  ){
        this.NIM = NIM ;
        this.Nama = Nama ;
        this.Prodi = Prodi ;
    }

    public String getNIM(){
        return this.NIM ;
    }

    public String getNama(){
        return this.Nama ;
    }

    public String getProdi(){
        return this.Prodi ;
    }

    public String getDosenWali(){
        return this.dosenWali.getNama() ;
    }

    public void getKendaraan(){
        System.out.println("Kendaraan Mahasiswa : "+this.kendaraan.getJenis()) ;
        System.out.println("No Plat Kendaraan : "+this.kendaraan.getNoPlat()) ;
    }

    public void getMataKuliah(){
        int i ; 
        System.out.println("Mata Kuliah yang diambil : ");
        for (i = 0; i < this.listMatKul.size(); i++) {
        System.out.println(i + 1 + ". " + this.listMatKul.get(i).getNamaMatkul() + " " );
    }
    }

    public void addMatkul(MataKuliah mk){
        if(listMatKul.size() == 50){
            System.out.println("Mata kuliah sudah penuh") ;
        } else {
            if(mk.getSKS() + this.getJumlahSKS() > 50){
                System.out.println("Jumlah SKS tidak boleh melebihi 50") ;
            } else {
                this.listMatKul.add(mk) ;
            }
        }
    }

    public int getJumlahMatkul(){
        return this.listMatKul.size() ;
    }

    public int getJumlahSKS(){
        return this.listMatKul.stream().mapToInt(MataKuliah::getSKS).sum() ;
    }

    public void printMhs(){
        System.out.println("NIM : "+this.NIM) ;
        System.out.println("Nama : "+this.Nama) ;
        System.out.println("Prodi : "+this.Prodi) ;
    }

    public void printDetailMhs(){
        System.out.println("NIM : "+this.NIM) ;
        System.out.println("Nama : "+this.Nama) ;
        System.out.println("Prodi : "+this.Prodi) ;
        System.out.println("Kendaraan Mahasiswa : "+this.kendaraan.getJenis()) ;
        System.out.println("No Plat Kendaraan : "+this.kendaraan.getNoPlat()) ;
        System.out.println("Dosen Wali : "+this.dosenWali.getNama()) ;
        int i ;
        for(i = 0 ; i < this.listMatKul.size() ; i++){
            System.out.println("Mata kuliah ke-"+(i+1)+" : "+this.listMatKul.get(i).getNamaMatkul()) ;
        }

    }

    public void setNIM(String NIM){
        this.NIM = NIM ;
    }

    public void setNama(String Nama){    
        this.Nama = Nama ;
    }

    public void setProdi(String Prodi){
        this.Prodi = Prodi ;
    }

    public void setDosenWali(Dosen dosenWali){
        this.dosenWali = dosenWali ;
    }

    public void setKendaraan(Kendaraan kendaraan){
        this.kendaraan = kendaraan ;
    }

    public void setMatkul(ArrayList<MataKuliah> MataKuliah){
        listMatKul = MataKuliah ;
    }
}