package SIA.model.classes;

import java.util.ArrayList;

public class MatkulAjar {
    private Matakuliah matkulYangDiajar;
    private ArrayList<PresensiStaff> presensi;

    public MatkulAjar(Matakuliah matkulYangDiajar, ArrayList<PresensiStaff> presensi) {
        this.matkulYangDiajar = matkulYangDiajar;
        this.presensi = presensi;
    }

    public Matakuliah getMatkulYangDiajar() {
        return matkulYangDiajar;
    }

    public void setMatkulYangDiajar(Matakuliah matkulYangDiajar) {
        this.matkulYangDiajar = matkulYangDiajar;
    }

    public ArrayList<PresensiStaff> getPresensi() {
        return presensi;
    }

    public void setPresensi(ArrayList<PresensiStaff> presensi) {
        this.presensi = presensi;
    }
}
