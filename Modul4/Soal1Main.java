package PRAK401_2510817120009_SitiNafisah;

import java.util.Scanner;

public class Soal1Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nama Hewan Peliharaan: ");
        String nama = input.nextLine();

        System.out.print("Ras: ");
        String ras = input.nextLine();

        System.out.println();

        HewanPeliharaan hewan = new HewanPeliharaan(ras, nama);
        hewan.display();

        input.close();
    }
}