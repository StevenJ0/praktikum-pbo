public class Pegawai {
    private String nama ; 
    private int gajiPokok = 5000000 ;

    public Pegawai(String nama){
        this.nama = nama ; 
    }

    public String getNama(){
        return this.nama ;
    }

    public void setNama(String nama){
        this.nama = nama ; 
    }

    public void tampilData(){
        System.out.println("Nama Pegawai : " + this.nama + ", " + "Gaji Pokok : " + this.gajiPokok); 
    }


}