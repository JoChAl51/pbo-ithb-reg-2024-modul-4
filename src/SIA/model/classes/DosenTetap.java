package SIA.model.classes;

import SIA.model.interfaces.Action;
import java.util.ArrayList;

public class DosenTetap extends Dosen implements Action {
    private int salary;

    public DosenTetap(String departemen, ArrayList<MatkulAjar> matkul, int salary) {
        this.setDepartemen(departemen);
        this.setMatkul(matkul);
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
            "Salary: " + salary + "\n" +
            "Mata Kuliah yang Diambil:\n" + getMatkul();
    }
}
