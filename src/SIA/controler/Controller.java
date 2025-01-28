package SIA.controler;

import SIA.main.Dummy;
import SIA.model.classes.*;

import javax.swing.*;

public class Controller {
    public String printUserData (String nama) {
        for (Mahasiswa mahasiswa : Dummy.getMahasiswa()) {
            if (mahasiswa.getNama().equalsIgnoreCase(nama)) {
                return mahasiswa + "Status: " + mahasiswa.getClass().getSimpleName();
            }
        }

        for (Staff staff : Dummy.getStaff()) {
            if (staff.getNama().equalsIgnoreCase(nama)) {
                return staff + "Status: " + staff.getClass().getSimpleName();
            }
        }

        return "User Data Tidak Ditemukan.";
    }

    public double printNilaiAkhir(String nim, String kodeMK) {
        for (Sarjana sarjana : Dummy.getSarjana()) {
            if (sarjana.getNim().equals(nim)) {
                for (MatkulAmbil matakuliah : sarjana.getMatkul()) {
                    if (matakuliah.getMatkulYangDiambil().getKode().equalsIgnoreCase(kodeMK)) {
                        return (double) (matakuliah.getN1() + matakuliah.getN2() + matakuliah.getN3()) / 3;
                    }
                }
            }
        }

        for (Magister magister : Dummy.getMagister()) {
            if (magister.getNim().equals(nim)) {
                for (MatkulAmbil matakuliah : magister.getMatkul()) {
                    if (matakuliah.getMatkulYangDiambil().getKode().equalsIgnoreCase(kodeMK)) {
                        return (double) (matakuliah.getN1() + matakuliah.getN2() + matakuliah.getN3()) / 3;
                    }
                }
            }
        }


        for (Doktor doktor : Dummy.getDoktor()) {
            if (doktor.getNim().equals(nim)) {
                return (double) (doktor.getNilaiSidang1() + doktor.getNilaiSidang2() + doktor.getNilaiSidang3()) / 3;
            }
        }

        return -1;
    }

    public double printRataRataNilaiAkhir(String kodeMK) {
        double rata2 = 0;

        for (Magister magister : Dummy.getMagister()) {
            for (MatkulAmbil matakuliah : magister.getMatkul()) {
                if (matakuliah.getMatkulYangDiambil().getKode().equalsIgnoreCase(kodeMK)) {
                    rata2 += (double) (matakuliah.getN1() + matakuliah.getN2() + matakuliah.getN3()) / 3;
                }
            }
        }

        for (Sarjana sarjana : Dummy.getSarjana()) {
            for (MatkulAmbil matakuliah : sarjana.getMatkul()) {
                if (matakuliah.getMatkulYangDiambil().getKode().equalsIgnoreCase(kodeMK)) {
                    rata2 += (double) (matakuliah.getN1() + matakuliah.getN2() + matakuliah.getN3()) / 3;
                }
            }
        }

        return rata2 / (Dummy.getMagister().size() + Dummy.getSarjana().size());
    }

    public String[] printBanyakMahasiswaTidakLulus(String kodeMK) {
        int count = 0;
        int countMahasiswa = 0;
        String namaMK = "";

        for (Magister magister : Dummy.getMagister()) {
            for (MatkulAmbil matkulAmbil : magister.getMatkul()) {
                if (matkulAmbil.getMatkulYangDiambil().getKode().equalsIgnoreCase(kodeMK)) {
                    countMahasiswa++;
                    namaMK = matkulAmbil.getMatkulYangDiambil().getNama();
                    if (printNilaiAkhir(magister.getNim(), kodeMK) < 56) {
                        count++;
                    }
                }
            }
        }

        for (Sarjana sarjana : Dummy.getSarjana()) {
            for (MatkulAmbil matkulAmbil : sarjana.getMatkul()) {
                if (matkulAmbil.getMatkulYangDiambil().getKode().equalsIgnoreCase(kodeMK)) {
                    namaMK = matkulAmbil.getMatkulYangDiambil().getNama();
                    countMahasiswa++;
                    if (printNilaiAkhir(sarjana.getNim(), kodeMK) < 56) {
                        count++;
                    }
                }
            }
        }

        return new String[]{count + "", countMahasiswa + "", namaMK};
    }
}
