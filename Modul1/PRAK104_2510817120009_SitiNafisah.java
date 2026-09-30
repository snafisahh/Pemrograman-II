import java.util.Scanner;

public class PRAK104_2510817120009_SitiNafisah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char[] abu = new char[3];
        char[] bagas = new char[3];

        System.out.print("Tangan Abu: ");
        for (int i = 0; i < 3; i++) {
            abu[i] = input.next().charAt(0);
        }

        System.out.print("Tangan Bagas: ");
        for (int i = 0; i < 3; i++) {
            bagas[i] = input.next().charAt(0);
        }

        int skor = 0;

        for (int i = 0; i < 3; i++) {
            if (abu[i] == 'G' && bagas[i] == 'K') {
                skor++;
            } else if (abu[i] == 'B' && bagas[i] == 'G') {
                skor++;
            } else if (abu[i] == 'K' && bagas[i] == 'B') {
                skor++;
            } else if (abu[i] == 'G' && bagas[i] == 'B') {
                skor--;
            } else if (abu[i] == 'B' && bagas[i] == 'K') {
                skor--;
            } else if (abu[i] == 'K' && bagas[i] == 'G') {
                skor--;
            }
        }

        if (skor > 0) {
            System.out.println("Abu");
        } else if (skor < 0) {
            System.out.println("Bagas");
        } else {
            System.out.println("Seri");
        }

        input.close();
    }
}