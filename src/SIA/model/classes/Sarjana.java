package SIA.model.classes;

import SIA.model.interfaces.Action;
import java.util.ArrayList;

public class Sarjana extends Mahasiswa implements Action {
    private ArrayList<MatkulAmbil> matkul;

    public Sarjana(String nama, String alamat, String ttl, String telepon, String nim, String jurusan, ArrayList<MatkulAmbil> matkul) {
        super(nama, alamat, ttl, telepon, nim, jurusan);
        this.matkul = matkul;
    }

    public String getListMatkul() {
        String listMatkul = "";
        for (int i = 0; i < matkul.size(); i++) {
            listMatkul += i + 1 + ". " + matkul.get(i).getMatkulYangDiambil() + "\n";
        }
        return listMatkul;
    }

    public ArrayList<MatkulAmbil> getMatkul() {
        return matkul;
    }

    public void setMatkul(ArrayList<MatkulAmbil> matkul) {
        this.matkul = matkul;
    }

    @Override
    public String toString() {
        return
            "Nama: " + getNama() + "\n" +
            "Alamat: " + getAlamat() + "\n" +
            "Tempat Tanggal Lahir: " + getTtl() + "\n" +
            "Telepon: " + getTelepon() + "\n" +
            "Nim: " + getNim() + "\n" +
            "Jurusan: " + getJurusan() + "\n" +
            "Mata Kuliah yang Diambil:\n" + getListMatkul();
    }
}
