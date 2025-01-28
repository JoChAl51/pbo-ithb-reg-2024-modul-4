package SIA.view;

import SIA.controler.Controller;

import javax.swing.*;

public class MahasiswaTidakLulus {
	public MahasiswaTidakLulus() {
		String kodeMK = JOptionPane.showInputDialog("Input MK:");
		String[] tidakLulus = new Controller().printBanyakMahasiswaTidakLulus(kodeMK);
		if (tidakLulus[2].isEmpty()) {
			JOptionPane.showMessageDialog(null, "Tidak ada mahasiswa yang mengikuti kode MK '" + kodeMK + "'");
		} else {
			JOptionPane.showMessageDialog(null, tidakLulus[0] + " dari " + tidakLulus[1] + " mahasiswa tidak lulus matakuliah " + tidakLulus[2]);
		}
	}
}
