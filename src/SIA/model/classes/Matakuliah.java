package SIA.model.classes;

public class Matakuliah {
    private String nama;
    private String kode;
    private int SKS;

    public Matakuliah(String nama, String kode, int SKS) {
        this.nama = nama;
        this.kode = kode;
        this.SKS = SKS;
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
}
