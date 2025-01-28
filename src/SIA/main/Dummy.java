package SIA.main;

import SIA.model.classes.*;
import SIA.model.enumeration.Status;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;

public class Dummy {
	public static ArrayList<Mahasiswa> getMahasiswa() {
		ArrayList<Mahasiswa> mahasiswa = new ArrayList<>();

		mahasiswa.addAll(getDoktor());
		mahasiswa.addAll(getMagister());
		mahasiswa.addAll(getSarjana());

		return mahasiswa;
	}

	public static ArrayList<Doktor> getDoktor() {
		ArrayList<Doktor> doktors = new ArrayList<>();
		Doktor doktor = new Doktor(
				"Doktor1",
				"Caringin",
				"Bandung, 22 Februari 1992",
				"08123456789",
				"111001",
				"Kedokteran",
				"Judul Dokter",
				80,
				85,
				82
		);

		doktors.add(doktor);

		return doktors;
	}

	public static ArrayList<Magister> getMagister() {
		ArrayList<Magister> magisters = new ArrayList<>();

		Presensi presensi1 = new Presensi("2010-08-01", 1);
		Presensi presensi2 = new Presensi("2010-08-08", 0);
		Presensi presensi3 = new Presensi("2010-08-08", 1);
		ArrayList<Presensi> presensiSatu = new ArrayList<>();
		presensiSatu.add(presensi1);
		presensiSatu.add(presensi2);
		ArrayList<Presensi> presensiDua = new ArrayList<>();
		presensiDua.add(presensi1);
		presensiDua.add(presensi3);
		Matakuliah algo = new Matakuliah(
				"Algoritma Pemograman",
				"IF-001",
				4
		);
		Matakuliah strukdat = new Matakuliah(
				"Struktur Data",
				"IF-011",
				3
		);
		MatkulAmbil Algo = new MatkulAmbil(
				algo,
				presensiSatu,
				90,
				85,
				97
		);
		MatkulAmbil Strukdat = new MatkulAmbil(
				strukdat,
				presensiDua,
				90,
				85,
				97
		);
		ArrayList<MatkulAmbil> matkulAmbils = new ArrayList<>();
		matkulAmbils.add(Algo);
		matkulAmbils.add(Strukdat);
		Magister magister = new Magister(
				"Magister1",
				"Waringin",
				"11 Januari 1991",
				"08987654321",
				"111002",
				"Informatika",
				matkulAmbils,
				"Judul Magister"
		);

		magisters.add(magister);

		return magisters;
	}

	public static ArrayList<Sarjana> getSarjana() {
		ArrayList<Sarjana> sarjanars = new ArrayList<>();

		Presensi presensi1 = new Presensi("2010-08-01", 1);
		Presensi presensi2 = new Presensi("2010-08-08", 0);
		Presensi presensi3 = new Presensi("2010-08-08", 1);
		ArrayList<Presensi> presensiSatu = new ArrayList<>();
		presensiSatu.add(presensi1);
		presensiSatu.add(presensi2);
		ArrayList<Presensi> presensiDua = new ArrayList<>();
		presensiDua.add(presensi1);
		presensiDua.add(presensi3);
		Matakuliah algo = new Matakuliah(
				"Algoritma Pemograman",
				"IF-001",
				4
		);
		Matakuliah strukdat = new Matakuliah(
				"Struktur Data",
				"IF-011",
				3
		);
		MatkulAmbil ambilAlgo = new MatkulAmbil(
				algo,
				presensiSatu,
				95,
				85,
				93
		);
		MatkulAmbil ambilStrukdat = new MatkulAmbil(
				strukdat,
				presensiDua,
				90,
				83,
				97
		);
		ArrayList<MatkulAmbil> matkulAmbils = new ArrayList<>();
		matkulAmbils.add(ambilAlgo);
		matkulAmbils.add(ambilStrukdat);

		Sarjana sarjana = new Sarjana(
				"Sarjana1",
				"Alamat 4",
				"Bandung, 01 April 2001",
				"0888776654",
				"111003",
				"Informatika",
				matkulAmbils
		);

		sarjanars.add(sarjana);

		return sarjanars;
	}

	public static ArrayList<Staff> getStaff() {
		ArrayList<Staff> staff = new ArrayList<>();

		staff.addAll(getDosenTetap());
		staff.addAll(getHonorer());
		staff.addAll(getKaryawan());

		return staff;
	}

	public static ArrayList<DosenTetap> getDosenTetap() {
		ArrayList<DosenTetap> dosenTetaps = new ArrayList<>();

		PresensiStaff presensiStaffHadir = new PresensiStaff(
				new Date(),
				Status.HADIR,
				LocalTime.now()
		);

		PresensiStaff presensiStaffTidakHadir = new PresensiStaff(
				new Date(),
				Status.ALPHA,
				LocalTime.now()
		);

		ArrayList<PresensiStaff> presensiStaffs = new ArrayList<>();
		presensiStaffs.add(presensiStaffHadir);
		presensiStaffs.add(presensiStaffTidakHadir);
		presensiStaffs.add(presensiStaffHadir);
		presensiStaffs.add(presensiStaffHadir);

		Matakuliah algo = new Matakuliah(
				"Algoritma Pemograman",
				"IF-001",
				4
		);

		MatkulAjar matkulAjar = new MatkulAjar(
				algo,
				presensiStaffs
		);

		ArrayList<MatkulAjar> matkulAjars = new ArrayList<>();
		matkulAjars.add(matkulAjar);

		DosenTetap dosenTetap = new DosenTetap(
				"Dosen Tetap 1",
				"Alamat 1",
				"Bandung, 01 Januari 1991",
				"08123456789",
				"0100011",
				"Departemen 1",
				matkulAjars,
				6000000
		);

		dosenTetaps.add(dosenTetap);

		return dosenTetaps;
	}

	public static ArrayList<Honorer> getHonorer() {
		ArrayList<Honorer> honorers = new ArrayList<>();

		PresensiStaff presensiStaffHadir = new PresensiStaff(
				new Date(),
				Status.HADIR,
				LocalTime.now()
		);

		PresensiStaff presensiStaffTidakHadir = new PresensiStaff(
				new Date(),
				Status.ALPHA,
				LocalTime.now()
		);

		ArrayList<PresensiStaff> presensiStaffs = new ArrayList<>();
		presensiStaffs.add(presensiStaffHadir);
		presensiStaffs.add(presensiStaffTidakHadir);
		presensiStaffs.add(presensiStaffHadir);
		presensiStaffs.add(presensiStaffHadir);

		Matakuliah strukdat = new Matakuliah(
				"Struktur Data",
				"IF-011",
				3
		);

		MatkulAjar matkulAjar = new MatkulAjar(
				strukdat,
				presensiStaffs
		);

		ArrayList<MatkulAjar> matkulAjars = new ArrayList<>();
		matkulAjars.add(matkulAjar);

		Honorer honorer = new Honorer(
				"Honorer 1",
				"Alamat 2",
				"Bandung, 01 February 1991",
				"08122345567",
				"0200022",
				"Departemen 2",
				matkulAjars,
				4
		);

		honorers.add(honorer);

		return honorers;
	}

	public static ArrayList<Karyawan> getKaryawan() {
		ArrayList<Karyawan> karyawans = new ArrayList<>();

		PresensiStaff presensiStaffHadir = new PresensiStaff(
				new Date(),
				Status.HADIR,
				LocalTime.now()
		);

		PresensiStaff presensiStaffTidakHadir = new PresensiStaff(
				new Date(),
				Status.ALPHA,
				LocalTime.now()
		);

		ArrayList<PresensiStaff> presensiStaffs = new ArrayList<>();
		presensiStaffs.add(presensiStaffHadir);
		presensiStaffs.add(presensiStaffTidakHadir);
		presensiStaffs.add(presensiStaffHadir);
		presensiStaffs.add(presensiStaffHadir);

		Karyawan karyawan = new Karyawan(
				"Karyawan 1",
				"Alamat 3",
				"Bandung, 01 Maret 1991",
				"0811223344",
				"0300033",
				3000000,
				presensiStaffs
		);

		karyawans.add(karyawan);

		return karyawans;
	}
}