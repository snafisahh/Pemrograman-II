package PRAK201_2510817120009_SitiNafisah;

public class Buah {
    private String nama;
    private double berat;
    private double harga;
    private double jumlahBeli;

    public Buah(String nama, double berat, double harga, double jumlahBeli) {
        this.nama = nama;
        this.berat = berat;
        this.harga = harga;
        this.jumlahBeli = jumlahBeli;
    }

    public double getDiskon() {
        double diskon = 0;

        int jumlahDiskon = (int) (jumlahBeli / 4);

        for (int i = 0; i < jumlahDiskon; i++) {
            double harga4Kg = harga * (4.0 / berat);
            diskon += harga4Kg * 0.02;
        }
        return diskon;
    }

    public void info() {
        double hargaSebelumDiskon = (harga / berat) * jumlahBeli;
        double diskon = getDiskon();
        double hargaSetelahDiskon = hargaSebelumDiskon - diskon;

        System.out.println("Nama Buah: " + nama);
        System.out.println("Berat: " + berat);
        System.out.println("Harga: " + harga);
        System.out.println("Jumlah Beli: " + jumlahBeli + "kg");
        System.out.printf("Harga Sebelum Diskon: Rp%.2f%n", hargaSebelumDiskon);
        System.out.printf("Total Diskon: Rp%.2f%n", diskon);
        System.out.printf("Harga Setelah Diskon: Rp%.2f%n", hargaSetelahDiskon);
        System.out.println();
    }
}