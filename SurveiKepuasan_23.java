
import java.util.Scanner;

public class SurveiKepuasan_23 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] survei = new int[10][6];  // Array 2 dimensi untuk menyimpan hasil survei (10 responden, 6 pertanyaan)

        // Input Hasil Survei
        System.out.println("Masukkan hasil survei (nilai 1-5 untuk setiap pertanyaan):");
        for (int i = 0; i < 10; i++) {
            System.out.println("Responden " + (i + 1) + ":");
            for (int j = 0; j < 6; j++) {
                System.out.print("Pertanyaan " + (j + 1) + ": ");
                survei[i][j] = scanner.nextInt();
            }
        }

        // Hitung Rata-Rata Per Responden
        System.out.println("\nRata-rata untuk setiap responden:");
        for (int i = 0; i < 10; i++) {
            double total = 0;
            for (int j = 0; j < 6; j++) {
                total += survei[i][j];
            }
            double rataRataResponden = total / 6;
            System.out.printf("Responden %d: %.2f%n", (i + 1), rataRataResponden);
        }

        // Hitung Rata-Rata Per Pertanyaan
        System.out.println("\nRata-rata untuk setiap pertanyaan:");
        for (int j = 0; j < 6; j++) {
            double total = 0;
            for (int i = 0; i < 10; i++) {
                total += survei[i][j];
            }
            double rataRataPertanyaan = total / 10;
            System.out.printf("Pertanyaan %d: %.2f%n", (j + 1), rataRataPertanyaan);
        }

        // Hitung Rata-Rata Keseluruhan
        double totalKeseluruhan = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 6; j++) {
                totalKeseluruhan += survei[i][j];
            }
        }
        double rataRataKeseluruhan = totalKeseluruhan / 60;
        System.out.printf("\nRata-rata keseluruhan: %.2f%n", rataRataKeseluruhan);

        scanner.close();
    }
}
