	package Tugas2;
	
	public class TranskripNilaiMain {
		public static void main(String[] args) {
			Dosen dosen1 = new Dosen("Pak Fajar Darmawan");
			Dosen dosen2 = new Dosen("Pak Siroj Nur Ulum");
			Dosen dosen3 = new Dosen("Pak Shandika Galih");
			
			
			
			MataKuliah mk1 = new MataKuliah("001", "Algoritma Pemrograman 1", "A", 3, dosen1);
			MataKuliah mk2 = new MataKuliah("002", "Algoritma Pemrograman 2", "BC", 3, dosen3);
			MataKuliah mk3 = new MataKuliah("003", "Pemrograman Berorientasi Objek", "B", 3, dosen2);
			
			
			KartuHasilStudi khs = new KartuHasilStudi("20222");
			khs.addMataKuliah(mk1);
			khs.addMataKuliah(mk2);
			khs.addMataKuliah(mk3);
			
			
			Mahasiswa mhs = new Mahasiswa("303040001", "Jhon");
			
			
			TranskripNilai transkrip = new TranskripNilai(mhs);
			transkrip.addKHS(khs);
			transkrip.display();
		}
	}
