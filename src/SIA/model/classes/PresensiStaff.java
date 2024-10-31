package SIA.model.classes;

import SIA.model.enumeration.Status;
import java.sql.Time;
import java.util.Date;

public class PresensiStaff {
    private Date tanggal;
    private Status status;
    private Time jam;

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Time getJam() {
        return jam;
    }

    public void setJam(Time jam) {
        this.jam = jam;
    }
}
