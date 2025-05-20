package Tugas11_1;

abstract class Hewan {
	String nama;
	
	public Hewan(String nama) {
		this.nama = nama;
	}
	
	public String getNama() {
		return nama;
	}
	
	public abstract void suara();
}

