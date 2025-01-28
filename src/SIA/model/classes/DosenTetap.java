package SIA.model.classes;

import SIA.model.interfaces.Action;
import java.util.ArrayList;

public class DosenTetap extends Dosen implements Action {
    private int salary;

    public DosenTetap(String nama, String alamat, String ttl, String telepon, String nik, String departemen, ArrayList<MatkulAjar> matkul, int salary) {
        super(nama, alamat, ttl, telepon, nik, departemen, matkul);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
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
            "Salary: " + getSalary() + "\n" +
            "Mata Kuliah yang Diambil:\n" + getMatkul();
    }
}
