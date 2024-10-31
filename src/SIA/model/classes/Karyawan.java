package SIA.model.classes;

import java.util.ArrayList;

public class Karyawan extends Staff {
    private int salary;
    private ArrayList<PresensiStaff> presensi;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public ArrayList<PresensiStaff> getPresensi() {
        return presensi;
    }

    public void setPresensi(ArrayList<PresensiStaff> presensi) {
        this.presensi = presensi;
    }
}
