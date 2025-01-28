package SIA.model.classes;

import SIA.model.enumeration.Status;
import SIA.model.interfaces.Action;

import java.time.LocalTime;
import java.util.Date;

public class PresensiStaff implements Action {
    private Date tanggal;
    private Status status;
    private LocalTime jam;

    public PresensiStaff(Date tanggal, Status status, LocalTime jam) {
        this.tanggal = tanggal;
        this.status = status;
        this.jam = jam;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    public String getStatus() {
        if (status.equals(Status.HADIR)) {
            return "Hadir";
        }
        return "Alpha";
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public LocalTime getJam() {
        return jam;
    }

    public void setJam(LocalTime jam) {
        this.jam = jam;
    }

    @Override
    public String toString() {
        return "Tanggal: " + tanggal.toString() + ", Status: " + getStatus() + ", Jam: " + jam.toString() + '\n';
    }
}
