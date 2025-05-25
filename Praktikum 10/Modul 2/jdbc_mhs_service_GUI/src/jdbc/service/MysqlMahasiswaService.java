package jdbc.service ;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import jdbc.model.Mahasiswa;
import jdbc.utilities.MysqlUtility;
/**
 *
 * @author LENOVO
 */
public class MysqlMahasiswaService {
    Connection koneksi = null;
    
    public MysqlMahasiswaService(){
        koneksi = MysqlUtility.getConnection();
    }
    
      // Membuat objek mahasiswa dari ResultSet
    public Mahasiswa makeMhsObject(ResultSet rs) throws SQLException {
        Mahasiswa mhs = new Mahasiswa();
        mhs.setId(rs.getInt("id"));
        mhs.setNama(rs.getString("name"));
        return mhs;
    }

    // Menambahkan data mahasiswa
    public void add(Mahasiswa mhs) {
        try {
            String sql = "INSERT INTO mahasiswa(name) VALUES (?)";
            PreparedStatement stmt = koneksi.prepareStatement(sql);
            stmt.setString(1, mhs.getNama());
            stmt.executeUpdate();
            System.out.println("Berhasil insert: " + mhs);
        } catch (SQLException e) {
            System.out.println("Gagal tambah data: " + e.getMessage());
        }
    }



    // Update data mahasiswa
    public void update(Mahasiswa mhs) {
        try {
            String sql = "UPDATE mahasiswa SET name=? WHERE id=?";
            PreparedStatement ps = koneksi.prepareStatement(sql);
            ps.setString(1, mhs.getNama());
            ps.setInt(2, mhs.getId());
            int affectedRows = ps.executeUpdate();
            
            if (affectedRows == 0) {
                System.out.println("Tidak ada data yang diupdate");
            } else {
                System.out.println("Berhasil update data: " + mhs);
            }
        } catch (SQLException e) {
            System.out.println("Error update data: " + e.getMessage());
        }
    }

    // Delete data mahasiswa
    public void delete(int id) {
        try {
            String sql = "DELETE FROM mahasiswa WHERE id=?";
            PreparedStatement ps = koneksi.prepareStatement(sql);
            ps.setInt(1, id);
            int affectedRows = ps.executeUpdate();
            
            if (affectedRows == 0) {
                System.out.println("Tidak ada data yang dihapus");
            } else {
                System.out.println("Berhasil hapus data dengan ID: " + id);
            }
        } catch (SQLException e) {
            System.out.println("Error delete data: " + e.getMessage());
        }
    }

    // Ambil mahasiswa berdasarkan ID
    public Mahasiswa getById(int id) {
        Mahasiswa mhs = null;
        try {
            String sql = "SELECT * FROM mahasiswa WHERE id=?";
            PreparedStatement ps = koneksi.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                mhs = makeMhsObject(rs);
            }
        } catch (SQLException e) {
            System.out.println("Error getById: " + e.getMessage());
        }
        return mhs;
    }

    // Ambil semua mahasiswa
    public List<Mahasiswa> getAll() {
        List<Mahasiswa> list = new ArrayList<>();
        try {
            String sql = "SELECT * FROM mahasiswa";
            Statement stmt = koneksi.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Mahasiswa mhs = makeMhsObject(rs);
                list.add(mhs);
            }
        } catch (SQLException e) {
            System.out.println("Error getAll: " + e.getMessage());
        }
        return list;
    }
    public void indexReset(){
        try{
            String sql = "Alter table mahasiswa auto_increment = 1" ;
            Statement stmt = koneksi.createStatement() ;
            stmt.executeUpdate(sql) ;
            System.out.println("Index berhasil direset") ;
        } catch(SQLException e) {
            System.out.println("Error indexReset: " + e.getMessage());
        }
    }
    
    public boolean isEmpty(){
        boolean kosong = true ;
        
        try{
            String sql = "Select count(*) as total from mahasiswa" ; 
            Statement stmt = koneksi.createStatement() ;
            ResultSet rs = stmt.executeQuery(sql) ;
            
            if(rs.next()){
                int total = rs.getInt("total") ; 
                kosong = (total == 0) ; 
            }
        } catch (SQLException e){
            System.out.println("Error is empyty : " + e.getMessage()) ;
        }
        
        return kosong ;
    }
    
    public void closeConnection(){
        try {
            if (koneksi != null && !koneksi.isClosed()){
                koneksi.close() ;
            }
        } catch (SQLException e){
            System.out.println("Error close connection: " + e.getMessage());
        }
    }
}