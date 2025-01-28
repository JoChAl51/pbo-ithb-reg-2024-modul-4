package SIA.view;

import SIA.controler.Controller;
import SIA.main.Dummy;
import SIA.model.classes.Mahasiswa;

import javax.swing.*;

public class NilaiAkhir {
	public NilaiAkhir() {
		String nim = JOptionPane.showInputDialog("Input NIM:");
		String kodeMK = "";
		for (Mahasiswa mahasiswa : Dummy.getMahasiswa()) {
			if (mahasiswa.getNim().equals(nim) && !mahasiswa.getClass().getSimpleName().equals("Doktor")) {
				kodeMK = JOptionPane.showInputDialog("Input Kode MK:");
			}
		}
		double nilaiAkhir = new Controller().printNilaiAkhir(nim, kodeMK);
		if (nilaiAkhir == -1) {
			JOptionPane.showMessageDialog(null, "Kode Matakuliah '" + kodeMK + "' tidak ditemukan.");
		} else {
			JOptionPane.showMessageDialog(null, "Nilai Akhir (NA): " + nilaiAkhir);
		}
	}
}
