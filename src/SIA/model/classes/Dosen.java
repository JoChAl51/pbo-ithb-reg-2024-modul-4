package SIA.model.classes;

import java.util.ArrayList;

public abstract class Dosen extends Staff {
    private String departemen;
    private ArrayList<MatkulAjar> matkul;

    public Dosen(String nama, String alamat, String ttl, String telepon, String nik, String departemen, ArrayList<MatkulAjar> matkul) {
        super(nama, alamat, ttl, telepon, nik);
        this.departemen = departemen;
        this.matkul = matkul;
    }

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
