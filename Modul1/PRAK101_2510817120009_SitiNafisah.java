import java.util.Scanner;

class Validasi {

    public int inputAngka(Scanner input, String pesan) {
        while (true) {
            System.out.print(pesan);
            if (input.hasNextInt()) {
                return input.nextInt();
            }
            System.out.println("Input harus berupa angka.");
            input.next();
        }
    }

    public int inputRentang(Scanner input, String pesan, int min, int max) {
        while (true) {
            int angka = inputAngka(input, pesan);
            if (angka >= min && angka <= max) {
                return angka;
            }
            System.out.println("Input harus antara " + min + " dan " + max + ".");
        }
    }

    public boolean tahunKabisat(int tahun) {
        if (tahun % 400 == 0) {
            return true;
        } else if (tahun % 100 == 0) {
            return false;
        } else {
            return tahun % 4 == 0;
        }
    }

    public int jumlahHari(int bulan, int tahun) {
        if (bulan == 2) {
            if (tahunKabisat(tahun)) {
                return 29;
            }
            return 28;
        }
        if (bulan == 4 || bulan == 6 || bulan == 9 || bulan == 11) {
            return 30;
        }
        return 31;
    }
}

public class PRAK101_2510817120009_SitiNafisah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Validasi validasi = new Validasi();

        System.out.print("Masukkan Nama Lengkap: ");
        String nama = input.nextLine();

        System.out.print("Masukkan Tempat Lahir: ");
        String tempat = input.nextLine();

        int tanggal = validasi.inputRentang(input, "Masukkan Tanggal Lahir: ", 1, 31);
        int bulan = validasi.inputRentang(input, "Masukkan Bulan Lahir: ", 1, 12);
        int tahun = validasi.inputAngka(input, "Masukkan Tahun Lahir: ");

        while (tanggal > validasi.jumlahHari(bulan, tahun)) {
            System.out.println("Tanggal tidak sesuai dengan bulan.");
            tanggal = validasi.inputRentang(input, "Masukkan Tanggal Lahir: ", 1, 31);
        }

        int tinggi = validasi.inputAngka(input, "Masukkan Tinggi Badan: ");

        double berat;
        while (true) {
            System.out.print("Masukkan Berat Badan: ");
            if (input.hasNextDouble()) {
                berat = input.nextDouble();
                break;
            }
            System.out.println("Input harus berupa angka.");
            input.next();
        }

        String[] namaBulan = {
                "", "Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"
        };

        System.out.println();
        System.out.println("Nama Lengkap " + nama + ", Lahir di " + tempat + " pada Tanggal " + tanggal + " " + namaBulan[bulan] + " " + tahun);
        System.out.println("Tinggi Badan " + tinggi + " cm dan Berat Badan " + berat + " kilogram");

        input.close();
    }
}