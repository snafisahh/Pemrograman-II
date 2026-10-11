package PRAK302_2510817120009_SitiNafisah;

import java.util.LinkedList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        LinkedList<Negara> daftarNegara = new LinkedList<>();

        HashMap<Integer, String> daftarBulan = new HashMap<>();
        daftarBulan.put(1, "Januari");
        daftarBulan.put(2, "Februari");
        daftarBulan.put(3, "Maret");
        daftarBulan.put(4, "April");
        daftarBulan.put(5, "Mei");
        daftarBulan.put(6, "Juni");
        daftarBulan.put(7, "Juli");
        daftarBulan.put(8, "Agustus");
        daftarBulan.put(9, "September");
        daftarBulan.put(10, "Oktober");
        daftarBulan.put(11, "November");
        daftarBulan.put(12, "Desember");

        int jumlahNegara = input.nextInt();
        input.nextLine();

        for (int i = 0; i < jumlahNegara; i++) {
            String nama = input.nextLine();
            String jenis = input.nextLine();
            String pemimpin = input.nextLine();

            int tanggal = 0;
            int bulan = 0;
            int tahun = 0;

            if (!jenis.equalsIgnoreCase("monarki")) {
                tanggal = input.nextInt();
                bulan = input.nextInt();
                tahun = input.nextInt();
                input.nextLine();
            }

            Negara negara = new Negara(nama, jenis, pemimpin, tanggal, bulan, tahun);
            daftarNegara.add(negara);
        }

        for (Negara n : daftarNegara) {
            String jenis = n.getJenisKepemimpinan();

            if (jenis.equalsIgnoreCase("monarki")) {
                System.out.println("Negara " + n.getNama() + " mempunyai Raja bernama " + n.getNamaPemimpin());
            } else {
                String jabatan;
                if (jenis.equalsIgnoreCase("presiden")) {
                    jabatan = "Presiden";
                } else {
                    jabatan = "Perdana Menteri";
                }

                String namaBulan = daftarBulan.get(n.getBulanKemerdekaan());

                System.out.println("Negara " + n.getNama() + " mempunyai " + jabatan + " bernama " + n.getNamaPemimpin());
                System.out.println("Deklarasi Kemerdekaan pada Tanggal " + n.getTanggalKemerdekaan() + " " + namaBulan + " " + n.getTahunKemerdekaan());
            }

            System.out.println();
        }

        input.close();
    }
}