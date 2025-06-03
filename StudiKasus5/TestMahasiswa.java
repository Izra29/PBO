package StudiKasus5;

public class TestMahasiswa {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa("20250101", "Andi");
        Mahasiswa m2 = new Mahasiswa("20250102", "Budi");

        m1.displayInfo();
        System.out.println();
        m2.displayInfo();

        System.out.println("\nTotal Mahasiswa: " + Mahasiswa.getTotalMahasiswa());
    }
}

