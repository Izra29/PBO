package Tugas11_1;

public class MainAbstrak {
	public static void main(String[] args) {
		Hewan h1 = new Kucing("Mimi");
		Hewan h2 = new Anjing("Doggy");
		
		h1.suara();
		h2.suara();
	}
}
