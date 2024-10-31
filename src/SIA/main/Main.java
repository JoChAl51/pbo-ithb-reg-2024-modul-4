package SIA.main;

import SIA.view.*;
import SIA.model.classes.*;
import SIA.model.enumeration.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Doktor
        Doktor doktor1 = new Doktor(
                "Doktor1",
                "Caringin",
                "Bandung, 22 Februari 1992",
                "08123456789",
                "011001",
                "Kedokteran",
                "Judul Dokter",
                80,
                85,
                82
        );
        System.out.println(doktor1.toString());

        // println
        System.out.println();

        // Magister
        Presensi presensi1 = new Presensi("2010-08-01", Status.HADIR);
        Presensi presensi2 = new Presensi("2010-08-08", Status.ALPHA);
        Presensi presensi3 = new Presensi("2010-08-08", Status.HADIR);
        ArrayList<Presensi> presensiSatu = new ArrayList<>();
        presensiSatu.add(presensi1);
        presensiSatu.add(presensi2);
        ArrayList<Presensi> presensiDua = new ArrayList<>();
        presensiDua.add(presensi1);
        presensiDua.add(presensi3);
        MatkulAmbil Algo = new MatkulAmbil(
                "Algoritma Pemograman",
                presensiSatu,
                90,
                85,
                97
        );
        MatkulAmbil Strukdat = new MatkulAmbil(
                "Struktur Data",
                presensiDua,
                90,
                85,
                97
        );
        ArrayList<MatkulAmbil> matkulAmbils = new ArrayList<>();
        matkulAmbils.add(Algo);
        matkulAmbils.add(Strukdat);
        Magister magister1 = new Magister(
                "Magister1",
                "Waringin",
                "11 Januari 1991",
                "08987654321",
                "021001",
                "Informatika",
                matkulAmbils,
                "Judul Magister"
        );
        System.out.println(magister1.toString());
        Menu menu = new Menu();
        menu.listMenu();
    }
}
