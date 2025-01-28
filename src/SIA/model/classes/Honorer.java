package SIA.model.classes;

import SIA.model.interfaces.Action;
import java.util.ArrayList;

public class Honorer extends Dosen implements Action {
    private int honorPerSKS;

    public Honorer(String nama, String alamat, String ttl, String telepon, String nik, String departemen, ArrayList<MatkulAjar> matkul, int honorPerSKS) {
        super(nama, alamat, ttl, telepon, nik, departemen, matkul);
        this.honorPerSKS = honorPerSKS;
    }

    public int getHonorPerSKS() {
        return honorPerSKS;
    }

    public void setHonorPerSKS(int honorPerSKS) {
        this.honorPerSKS = honorPerSKS;
    }

    @Override
    public String toString() {
        return
            "Nama: " + getNama() + "\n" +
            "Alamat: " + getAlamat() + "\n" +
            "Tempat Tanggal Lahir: " + getTtl() + "\n" +
            "Telepon: " + getTelepon() + "\n" +
            "NIK: " + getNik() + "\n" +
            "Departemen: " + getDepartemen() + "\n" +
            "Honor Per SKS: " + getHonorPerSKS() + "\n" +
            "Mata Kuliah yang Diambil:\n" + getMatkul();
    }
}
