package Tugas2;

// Kelas Dosen untuk menyimpan informasi dosen pengampu
public class Dosen {
    private String nama;
    
    public Dosen(String nama) {
        this.nama = nama;
    }
    
    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String display() {
        return "Dosen: " + nama;
    }
}