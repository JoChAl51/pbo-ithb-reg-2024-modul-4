package SIA.model.classes;

public abstract class Staff extends User {
    private String nik;

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }
}
