package SIA.model.classes;

public abstract class Mahasiswa extends User {
    private String nim;
    private String jurusan;

    public Mahasiswa(String nama, String alamat, String ttl, String telepon, String nim, String jurusan) {
        super(nama, alamat, ttl, telepon);
        this.nim = nim;
        this.jurusan = jurusan;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }
}