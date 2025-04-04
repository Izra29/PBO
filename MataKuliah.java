package Tugas2;

public class MataKuliah {
	private String kode;
	private String nama;
	private String index;
	private int sks;
	private Dosen dosen;
	
	/*konstruktor*/
	public MataKuliah(String kode, String nama, String index, int sks, Dosen dosen)
	{
		super();
		this.kode = kode;
		this.nama = nama;
		this.index = index;
		this.setSks(sks);
		this.dosen = dosen;
	}
	
	public double nilaiIndex()
	{
		 switch (index.toUpperCase()) {
         case "A": return 4.0;
         case "AB": return 3.5;
         case "B": return 3.0;
         case "BC": return 2.5;
         case "C": return 2.0;
         case "D": return 1.0;
         case "E": return 0.0;
         default: return -1.0; // Nilai tidak valid
     }
 }
	
	public String display()
	{
		return kode + " - "+ nama + " - "+ index + " - " + dosen.display();
	}

	public int getSks() {
		return sks;
	}

	public void setSks(int sks) {
		this.sks = sks;
	}
}
