package SIA.model.classes;

import SIA.model.interfaces.Action;
import java.util.ArrayList;

public class Honorer extends Dosen implements Action {
    private int honorPerSKS;

    public Honorer(String departemen, ArrayList<MatkulAjar> matkul, int honorPerSKS) {
        this.setDepartemen(departemen);
        this.setMatkul(matkul);
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
            "Honor: " + honorPerSKS + "\n" +
            "Mata Kuliah yang Diambil:\n" + getMatkul();
    }
}
