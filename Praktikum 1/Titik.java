
// Deskripsi : berisi atribut dan method dalam class Titik
// Pembuat : Steven Jonathan Sihombing
// Tanggal : 20 Februari 2025

public class Titik {
    // Atribut
    public double absis ; 
    public double ordinat ;
    static int counterTitik = 0 ;

    /* Method */ 

    // Konstruktor untuk membuat titik (0,0)
    Titik(){
        absis = 0 ;
        ordinat = 0 ;
        counterTitik++ ;
    }

    // Konstruktor untuk membuat titik (x,y)
    Titik(int x, int y){
        absis = x ;
        ordinat = y ;
        counterTitik++ ;
    }

    // Mengembalikan nilai absis 
    double getAbsis(){
        return absis ;
    }

    // Mengembalikan nilai ordinat
    double getOrdinat(){
        return ordinat ;
    }

    // Menset nilai absis 
    void setAbsis(double x){
        absis = x ;
    }

    // Menset nilai ordinat
    void setOrdinat(double y){
        ordinat = y ;
    }

    // Menggeser nilai absis dan ordinat titik masing-masih sejauh x dan y 
    void geser(int x, int y){
        absis += x ;
        ordinat += y ;
    }

    // Mencetak koordinat titik
    void printTitik(){
        System.out.println("Titik (" + absis + "," + ordinat + ")") ;
    }

    // Mencetak jumlah titik
    void getCounterTitik(){
        System.out.println("Jumlah titik : " + counterTitik) ;
    }

    // Mengembalikan kuadran
    int getKuadran(){
        if (this.absis > 0 && this.ordinat > 0){
            return 1 ;
        } else if (this.absis < 0 && this.ordinat > 0){
            return 2 ;
        } else if (this.absis < 0 && this.ordinat < 0){
            return 3 ;
        } else if (this.absis > 0 && this.ordinat < 0){
            return 4 ;
        } else {
            return 0 ;
        }
    }

    // Mengembalikan jarak ke titik pusat
    double getJarakPusat(){
        return Math.sqrt(this.absis * this.absis + this.ordinat * this.ordinat) ;
    }

    // Mengembalikan jarak ke titik T
    double getJarakTitik(Titik T){
        return Math.sqrt((T.absis - this.absis) * (T.absis - this.absis) + (T.ordinat - this.ordinat) * (T.ordinat - this.ordinat)) ;
    }    

    // Mengembalikan titik refleksi terhadap sumbu x
    void refleksiX(){
        this.absis = -this.absis ;
    }

    // Mengembalikan titik refleksi terhadap sumbu y
    void refleksiY(){
        this.ordinat = -this.ordinat ;
    }

    // Mengembalikan titik refleksi terhadap sumbu x
    Titik getRefleksiX(){
        Titik T = new Titik() ;
        T.absis = -this.absis ;
        T.ordinat = this.ordinat ;
        return T ;
    }

    // Mengembalikan titik refleksi terhadap sumbu y
    Titik getRefleksiY(){
        Titik T = new Titik() ;
        T.absis = this.absis ;
        T.ordinat = -this.ordinat ;
        return T ;
    }

}
