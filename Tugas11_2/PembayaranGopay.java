package Tugas11_2;

class PembayaranGopay implements Pembayaran {
	public void prosesPembayaran(double jumlah) {
		System.out.println("Pembayaran sebesar Rp" + jumlah + "menggunakan Gopay berhasil");
	}
}
