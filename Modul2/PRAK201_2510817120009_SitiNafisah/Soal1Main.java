package PRAK201_2510817120009_SitiNafisah;

public class Soal1Main {
    public static void main(String[] args) {

        Buah apel = new Buah("Apel", 0.4, 7000, 40);
        apel.info();

        Buah mangga = new Buah("mangga", 0.2, 3500, 15);
        mangga.info();

        Buah alpukat = new Buah("alpukat", 0.25, 10000, 12);
        alpukat.info();
    }
}