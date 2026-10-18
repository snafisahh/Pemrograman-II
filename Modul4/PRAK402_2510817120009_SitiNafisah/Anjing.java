package PRAK402_2510817120009_SitiNafisah;

public class Anjing extends HewanPeliharaan {
    private String warnaBulu;
    private String[] kemampuan;

    public Anjing(String n, String r, String w, String[] k) {
        super(r, n);
        this.warnaBulu = w;
        this.kemampuan = k;
    }

    public void displayDetailAnjing() {
        super.display();
        System.out.println("Memiliki warna bulu : " + this.warnaBulu);
        System.out.println("Memiliki kemampuan : " + String.join(" ", this.kemampuan));
    }
}