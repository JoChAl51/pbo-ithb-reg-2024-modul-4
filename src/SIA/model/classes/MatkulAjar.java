package SIA.model.classes;

import java.util.ArrayList;

public class MatkulAjar {
    private String matkulYangDiajar;
    private ArrayList<PresensiStaff> presensi;

    public MatkulAjar(String matkulYangDiajar, ArrayList<PresensiStaff> presensi) {
        this.matkulYangDiajar = matkulYangDiajar;
        this.presensi = presensi;
    }

    public String getMatkulYangDiajar() {
        return matkulYangDiajar;
    }

    public void setMatkulYangDiajar(String matkulYangDiajar) {
        this.matkulYangDiajar = matkulYangDiajar;
    }

    public ArrayList<PresensiStaff> getPresensi() {
        return presensi;
    }

    public void setPresensi(ArrayList<PresensiStaff> presensi) {
        this.presensi = presensi;
    }
}
