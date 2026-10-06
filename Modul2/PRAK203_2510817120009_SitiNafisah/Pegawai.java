package PRAK203_2510817120009_SitiNafisah;

// Nama class harus sama dengan nama file, file ini bernama Pegawai.java
// public class Employee {
public class Pegawai {

    public String nama;

    // char cuma bisa menyimpan satu karakter, sedangkan asal berupa teks.
    // public char asal;
    public String asal;

    public String jabatan;
    public int umur;

    public String getNama() {
        return nama;
    }

    public String getAsal() {
        return asal;
    }

    // Parameter j belum ada, padahal j digunakan untuk mengisi jabatan.
    // public void setJabatan() {
    //     this.jabatan = j;
    // }
    public void setJabatan(String j) {
        this.jabatan = j;
    }
}