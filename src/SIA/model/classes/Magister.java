package SIA.model.classes;

import SIA.model.interfaces.Action;
import java.util.ArrayList;

public class Magister extends Mahasiswa implements Action {
    private ArrayList<MatkulAmbil> matkul;
    private String judulPenelitianTesis;

    public Magister(String nama, String alamat, String ttl, String telepon, String nim, String jurusan, ArrayList<MatkulAmbil> matkul, String judulPenelitianTesis) {
        super(nama, alamat, ttl, telepon, nim, jurusan);
        this.matkul = matkul;
        this.judulPenelitianTesis = judulPenelitianTesis;
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

    public String getJudulPenelitianTesis() {
        return judulPenelitianTesis;
    }

    public void setJudulPenelitianTesis(String judulPenelitianTesis) {
        this.judulPenelitianTesis = judulPenelitianTesis;
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
            "Mata Kuliah yang Diambil:\n" + getListMatkul() +
            "Judul Penelitian Tesis: '" + getJudulPenelitianTesis() + '\n';
    }
}
