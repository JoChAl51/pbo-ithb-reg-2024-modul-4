package SIA.view;

import SIA.controler.Controller;
import SIA.main.Dummy;
import SIA.model.classes.Mahasiswa;

import javax.swing.*;

public class Rata2NilaiAkhir {
	public Rata2NilaiAkhir() {
		String kodeMK = JOptionPane.showInputDialog("Input Kode MK:");
		JOptionPane.showMessageDialog(null, new Controller().printRataRataNilaiAkhir(kodeMK));
	}
}
