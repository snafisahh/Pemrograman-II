import java.util.Scanner;

public class PRAK102_2510817120009_SitiNafisah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int angka = input.nextInt();
        int jumlah = 0;

        while (jumlah < 10) {
            if (angka % 5 == 0) {
                System.out.print((angka / 5) - 1);
            } else {
                System.out.print(angka);
            }

            if (jumlah < 9) {
                System.out.print(", ");
            }

            angka++;
            jumlah++;
        }

        input.close();
    }
}