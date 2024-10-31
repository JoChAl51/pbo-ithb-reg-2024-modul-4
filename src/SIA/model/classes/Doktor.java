package SIA.model.classes;

import SIA.model.interfaces.Action;

public class Doktor extends Mahasiswa implements Action {
    private String judulPenelitianDisertasi;
    private int nilaiSidang1;
    private int nilaiSidang2;
    private int nilaiSidang3;

    public Doktor(String nama, String alamat, String ttl, String telepon, String nim, String jurusan, String judulPenelitianDisertasi, int nilaiSidang1, int nilaiSidang2, int nilaiSidang3) {
        this.setNama(nama);
        this.setAlamat(alamat);
        this.setTtl(ttl);
        this.setTelepon(telepon);
        this.setNim(nim);
        this.setJurusan(jurusan);
        this.judulPenelitianDisertasi = judulPenelitianDisertasi;
        this.nilaiSidang1 = nilaiSidang1;
        this.nilaiSidang2 = nilaiSidang2;
        this.nilaiSidang3 = nilaiSidang3;
    }



    public String getJudulPenelitianDisertasi() {
        return judulPenelitianDisertasi;
    }

    public void setJudulPenelitianDisertasi(String judulPenelitianDisertasi) {
        this.judulPenelitianDisertasi = judulPenelitianDisertasi;
    }

    public int getNilaiSidang1() {
        return nilaiSidang1;
    }

    public void setNilaiSidang1(int nilaiSidang1) {
        this.nilaiSidang1 = nilaiSidang1;
    }

    public int getNilaiSidang2() {
        return nilaiSidang2;
    }

    public void setNilaiSidang2(int nilaiSidang2) {
        this.nilaiSidang2 = nilaiSidang2;
    }

    public int getNilaiSidang3() {
        return nilaiSidang3;
    }

    public void setNilaiSidang3(int nilaiSidang3) {
        this.nilaiSidang3 = nilaiSidang3;
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
            "Judul Penelitian Disertasi: '" + judulPenelitianDisertasi + "'\n" +
            "Nilai Sidang 1: " + nilaiSidang1 + '\n' +
            "Nilai Sidang 2: " + nilaiSidang2 + '\n' +
            "Nilai Sidang 3: " + nilaiSidang3;
    }
}