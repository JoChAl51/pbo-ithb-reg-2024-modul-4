package SIA.model.classes;

import SIA.model.enumeration.Status;

public class Presensi {
    private String tanggal;
    private Status status;

    public Presensi(String tanggal, Status status) {
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
        if (status.equals(Status.HADIR)) {
            output = "Hadir";
        } else {
            output = "Alpha";
        }
        return output;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
