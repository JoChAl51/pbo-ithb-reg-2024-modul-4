package SIA.model.classes;

import SIA.model.interfaces.Action;

import java.util.ArrayList;

public class Karyawan extends Staff implements Action {
    private int salary;
    private ArrayList<PresensiStaff> presensi;

    public Karyawan(String nama, String alamat, String ttl, String telepon, String nik, int salary, ArrayList<PresensiStaff> presensi) {
        super(nama, alamat, ttl, telepon, nik);
        this.salary = salary;
        this.presensi = presensi;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getPresensi() {
        String output = "";
        for (int i = 0; i < presensi.size(); i++) {
            output += "Presensi-" + (i + 1) + " = " + presensi.get(i).toString();
        }

        return output;
    }

    public void setPresensi(ArrayList<PresensiStaff> presensi) {
        this.presensi = presensi;
    }

    @Override
    public String toString() {
        return "Nama: " + getNama() + "\n" +
                "Alamat: " + getAlamat() + "\n" +
                "Tempat, Tanggal Lahir: " + getTtl() + "\n" +
                "Telepon: " + getTelepon() + "\n" +
                "NIK: " + getNik() + "\n" +
                "Salary: " + getSalary() + "\n" +
                "List Presensi: \n" + getPresensi();
    }
}
