package SIA.model.classes;

import java.util.ArrayList;

public class MatkulAmbil {
    private Matakuliah matkulYangDiambil;
    private ArrayList<Presensi> presensi;
    private int n1;
    private int n2;
    private int n3;

    public MatkulAmbil(Matakuliah matkulYangDiambil, ArrayList<Presensi> presensi, int n1, int n2, int n3) {
        this.matkulYangDiambil = matkulYangDiambil;
        this.presensi = presensi;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    public Matakuliah getMatkulYangDiambil() {
        return matkulYangDiambil;
    }

    public void setMatkulYangDiambil(Matakuliah matkulYangDiambil) {
        this.matkulYangDiambil = matkulYangDiambil;
    }

    public ArrayList<Presensi> getPresensi() {
        return presensi;
    }

    public void setPresensi(ArrayList<Presensi> presensi) {
        this.presensi = presensi;
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public int getN3() {
        return n3;
    }

    public void setN3(int n3) {
        this.n3 = n3;
    }
}
