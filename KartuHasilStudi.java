package Tugas2;

import java.util.ArrayList;
import java.util.List;

public class KartuHasilStudi {
    private String semester;
    private double ips;
    private List<MataKuliah> daftarMataKuliah;

    public KartuHasilStudi(String semester) {
        this.semester = semester;
        this.daftarMataKuliah = new ArrayList<>();
        this.ips = 0.0;
    }

    public void addMataKuliah(MataKuliah matakuliah) {
        if (matakuliah != null) {
            daftarMataKuliah.add(matakuliah);
        }
    }

    public void hitungIPS() {
        if (daftarMataKuliah.isEmpty()) {
            ips = 0.0;
            return;
        }

        double totalBobot = 0;
        double totalNilai = 0;

        for (MataKuliah mk : daftarMataKuliah) {
            if (mk != null) {
            	 totalNilai += mk.nilaiIndex() * mk.getSks();
                 totalBobot += mk.getSks();
            }
        }

        ips = (totalBobot == 0) ? 0.0 : totalNilai / totalBobot;
    }

    public String display() {
        StringBuilder sb = new StringBuilder();
        sb.append("Semester: ").append(semester).append("\n");
        sb.append("Daftar Mata Kuliah:\n");

        if (daftarMataKuliah.isEmpty()) {
            sb.append("Tidak ada mata kuliah yang terdaftar.\n");
        } else {
            for (MataKuliah mk : daftarMataKuliah) {
                if (mk != null) {
                    sb.append(mk.display()).append("\n");
                }
            }
        }

        hitungIPS();
        sb.append("IPS: ").append(String.format("%.2f", ips)).append("\n");
        return sb.toString();
    }

	public String getSemester() {
		return semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}

	public double getIps() {
		return ips;
	}

	public void setIps(double ips) {
		this.ips = ips;
	}

	public List<MataKuliah> getDaftarMataKuliah() {
		return daftarMataKuliah;
	}

	public void setDaftarMataKuliah(List<MataKuliah> daftarMataKuliah) {
		this.daftarMataKuliah = daftarMataKuliah;
	}

	public int nilaiIndex() {
		// TODO Auto-generated method stub
		return 0;
	}

	public double getSks() {
		// TODO Auto-generated method stub
		return 0;
	}


}