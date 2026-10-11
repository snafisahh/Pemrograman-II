package PRAK303_2510817120009_SitiNafisah;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();
        HashMap<String, Mahasiswa> dataMahasiswa = new HashMap<>();

        int pilihan;

        do {
            System.out.println("Menu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa berdasarkan NIM");
            System.out.println("3. Cari Mahasiswa berdasarkan NIM");
            System.out.println("4. Tampilkan Daftar Mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");

            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Nama Mahasiswa: ");
                    String nama = input.nextLine();

                    System.out.print("Masukkan NIM Mahasiswa (harus unik): ");
                    String nim = input.nextLine();

                    if (dataMahasiswa.containsKey(nim)) {
                        System.out.println("NIM sudah digunakan.");
                    } else {
                        Mahasiswa mahasiswa = new Mahasiswa(nama, nim);

                        daftarMahasiswa.add(mahasiswa);
                        dataMahasiswa.put(nim, mahasiswa);

                        System.out.println("Mahasiswa " + nama + " ditambahkan.");
                    }
                    break;

                case 2:
                    System.out.print("Masukkan NIM Mahasiswa yang akan dihapus: ");
                    String nimHapus = input.nextLine();

                    if (dataMahasiswa.containsKey(nimHapus)) {
                        Mahasiswa mahasiswa = dataMahasiswa.get(nimHapus);

                        daftarMahasiswa.remove(mahasiswa);
                        dataMahasiswa.remove(nimHapus);

                        System.out.println("Mahasiswa dengan NIM " + nimHapus + " dihapus.");
                    } else {
                        System.out.println("Mahasiswa dengan NIM " + nimHapus + " tidak ditemukan.");
                    }
                    break;

                case 3:
                    System.out.print("Masukkan NIM Mahasiswa yang dicari: ");
                    String nimCari = input.nextLine();

                    if (dataMahasiswa.containsKey(nimCari)) {
                        Mahasiswa mahasiswa = dataMahasiswa.get(nimCari);

                        System.out.println("NIM: " + mahasiswa.getNim() + ", Nama: " + mahasiswa.getNama());
                    } else {
                        System.out.println("Mahasiswa dengan NIM " + nimCari + " tidak ditemukan.");
                    }
                    break;

                case 4:
                    System.out.println("Daftar Mahasiswa:");

                    if (daftarMahasiswa.isEmpty()) {
                        System.out.println("Belum ada data mahasiswa.");
                    } else {
                        for (Mahasiswa mahasiswa : daftarMahasiswa) {
                            System.out.println("NIM: " + mahasiswa.getNim() + ", Nama: " + mahasiswa.getNama());
                        }
                    }
                    break;

                case 0:
                    daftarMahasiswa.clear();
                    dataMahasiswa.clear();
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak tersedia.");
            }

        } while (pilihan != 0);

        input.close();
    }
}