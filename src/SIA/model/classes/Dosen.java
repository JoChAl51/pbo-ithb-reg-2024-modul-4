package SIA.model.classes;

import java.util.ArrayList;

public abstract class Dosen extends Staff {
    private String departemen;
    private ArrayList<MatkulAjar> matkul;

    public String getDepartemen() {
        return departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    public String getMatkul() {
        String listMatkul = "";
        for (int i = 0; i < matkul.size(); i++) {
            listMatkul += i + 1 + ". " + matkul.get(i).getMatkulYangDiajar() + "\n";
        }
        return listMatkul;
    }

    public void setMatkul(ArrayList<MatkulAjar> matkul) {
        this.matkul = matkul;
    }
}
