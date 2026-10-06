package PRAK203_2510817120009_SitiNafisah;

public class Soal3Main {
    public static void main(String[] args) {
        Pegawai p1 = new Pegawai();

        // Kurang tanda titik koma (;) di akhir baris.
        // p1.nama = "Roi"
        p1.nama = "Roi";

        p1.asal = "Kingdom of Orvel";
        p1.setJabatan("Assasin");

        // Umur belum diberi nilai, jadi diisi 17 sesuai dengan output soal.
        p1.umur = 17;

        // Pada output soal tertulis "Nama", bukan "Nama Pegawai".
        // System.out.println("Nama Pegawai: " + p1.getNama());
        System.out.println("Nama: " + p1.getNama());
        System.out.println("Asal: " + p1.getAsal());
        System.out.println("Jabatan: " + p1.jabatan);

        // Pada output soal ditambahkan tulisan "tahun".
        // System.out.println("Umur: " + p1.umur);
        System.out.println("Umur: " + p1.umur + " tahun");
    }
}