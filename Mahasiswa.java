package Tugas2;

public class Mahasiswa {
	private String NRP;
	private String Nama;
	
	public Mahasiswa()
	{
		//TODO Auto-generated construktor stub
	}
	
	public Mahasiswa(String nRP, String nama)
	{
		super();
		NRP = nRP;
		this.Nama = nama;
	}
	
	public String display()
	{
		return "NRP: "+ NRP+ ", Nama: "+ Nama;
	}

	public String getNRP() {
		return NRP;
	}

	public void setNRP(String nRP) {
		NRP = nRP;
	}

	public String getNama() {
		return Nama;
	}

	public void setNama(String nama) {
		Nama = nama;
	}
}
