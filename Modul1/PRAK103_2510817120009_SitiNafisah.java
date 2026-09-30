import java.util.Scanner;

public class PRAK103_2510817120009_SitiNafisah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int angka = input.nextInt();
        int jumlah = 0;

        do {
            if (angka % 2 != 0) {
                System.out.print(angka);
                jumlah++;

                if (jumlah < n) {
                    System.out.print(", ");
                }
            }

            angka++;
        } while (jumlah < n);

        input.close();
    }
}