// File : ExceptionOnArray.java
// Nama : Steven Jonathan Sihombing 
// NIM : 24060123120044

public class ExceptionOnArray{
    public static void main(String[] args) {
        Integer[] arrayInteger = new Integer[4] ;
        try {
            arrayInteger[2] = 11 ; 
            arrayInteger[4] = 10 ;
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        } finally{
            System.err.println("clean up code ....");
        }

    }
}