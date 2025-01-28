package SIA.model.classes;

public class MatkulPilihan {
    private String nama;
    private String kode;
    private int SKS;
    private int jumlahMinimum;

    public MatkulPilihan(String nama, String kode, int SKS, int jumlahMinimum) {
        this.nama = nama;
        this.kode = kode;
        this.SKS = SKS;
        this.jumlahMinimum = jumlahMinimum;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public int getSKS() {
        return SKS;
    }

    public void setSKS(int SKS) {
        this.SKS = SKS;
    }

    public int getJumlahMinimum() {
        return jumlahMinimum;
    }

    public void setJumlahMinimum(int jumlahMinimum) {
        this.jumlahMinimum = jumlahMinimum;
    }
}
