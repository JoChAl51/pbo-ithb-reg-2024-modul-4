package SIA.model.classes;

import SIA.model.interfaces.Action;
import java.util.ArrayList;

public class Magister extends Mahasiswa implements Action {
    private ArrayList<MatkulAmbil> matkul;
    private String judulPenelitianTesis;

    public Magister(String nama, String alamat, String ttl, String telepon, String nim, String jurusan, ArrayList<MatkulAmbil> matkul, String judulPenelitianTesis) {
        this.setNama(nama);
        this.setAlamat(alamat);
        this.setTtl(ttl);
        this.setTelepon(telepon);
        this.setNim(nim);
        this.setJurusan(jurusan);
        this.matkul = matkul;
        this.judulPenelitianTesis = judulPenelitianTesis;
    }

    public String getMatkul() {
        String listMatkul = "";
        for (int i = 0; i < matkul.size(); i++) {
            listMatkul += i + 1 + ". " + matkul.get(i).getMatkulYangDiambil() + "\n";
        }
        return listMatkul;
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
            "Mata Kuliah yang Diambil:\n" + getMatkul() +
            "Judul Penelitian Tesis: '" + judulPenelitianTesis + '\'';
    }
}
