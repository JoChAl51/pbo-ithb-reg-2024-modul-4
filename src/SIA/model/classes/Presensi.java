package SIA.model.classes;

public class Presensi {
    private String tanggal;
    private int status;

    public Presensi(String tanggal, int status) {
        this.tanggal = tanggal;
        this.status = status;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getStatus() {
        String output = "";
        if (status == 1) {
            output = "Hadir";
        } else {
            output = "Alpha";
        }
        return output;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
