package PRAK301_2510817120009_SitiNafisah;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList<Dadu> daftarDadu = new LinkedList<>();

        int jumlahDadu = input.nextInt();
        int total = 0;

        for (int i = 0; i < jumlahDadu; i++) {
            Dadu dadu = new Dadu();
            daftarDadu.add(dadu);
        }

        int nomor = 1;

        for (Dadu dadu : daftarDadu) {
            int nilai = dadu.getNilai();

            System.out.println("Dadu ke-" + nomor + " bernilai " + nilai);
            total += nilai;
            nomor++;
        }

        System.out.println("Total nilai dadu keseluruhan " + total);

        input.close();
    }
}