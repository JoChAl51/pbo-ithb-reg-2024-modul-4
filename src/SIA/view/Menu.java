package SIA.view;

import javax.swing.*;

public class Menu {
    public Menu() {
        String menu = JOptionPane.showInputDialog(
                "Menu:\n" +
                        "1. User Data\n" +
                        "2. Nilai Akhir\n" +
                        "3. Rata-rata Nilai Akhir\n" +
                        "4. Banyak Mahasiswa yang Tidak Lulus\n" +
                        "5. Matkul Ambil\n" +
                        "6. Total Jam Dosen\n" +
                        "7. Gaji Staff\n" +
                        "8. Exit"
        );
        switch (Integer.parseInt(menu)) {
            case 8:
                System.exit(0);
            case 1:
                new UserData();
                new Menu();
                break;
            case 2:
                new NilaiAkhir();
                new Menu();
                break;
            case 3:
                new Rata2NilaiAkhir();
                new Menu();
                break;
            case 4:
                new MahasiswaTidakLulus();
                new Menu();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Nomor tersebut tidak ada di menu.");
                new Menu();
        }
    }
}
