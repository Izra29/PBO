package Tugas11_2;

public class MainInterface {
	public static void main(String[] args) {
		Pembayaran p1 = new PembayaranOVO();
		Pembayaran p2 = new PembayaranGopay();
		
		p1.prosesPembayaran(50000);
		p2.prosesPembayaran(75000);
	}
}
