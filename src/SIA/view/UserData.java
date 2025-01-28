package SIA.view;

import SIA.controler.Controller;

import javax.swing.*;

public class UserData {
	public UserData() {
		String nama = JOptionPane.showInputDialog("Input Nama:");
		JOptionPane.showMessageDialog(null, new Controller().printUserData(nama));
	}
}
