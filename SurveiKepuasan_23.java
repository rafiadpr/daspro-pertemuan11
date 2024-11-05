public class SurveiKepuasan_23 {
    public static void main(String[] args) {
        // Deklarasi data survei dengan nilai awal
        int[][] survei = {
            {5, 4, 3, 4, 5, 2},
            {3, 2, 4, 5, 4, 3},
            {4, 5, 5, 3, 4, 4},
            {3, 3, 2, 4, 4, 5},
            {4, 4, 3, 3, 5, 2},
            {5, 4, 4, 4, 3, 4},
            {3, 5, 3, 5, 2, 3},
            {4, 4, 5, 4, 4, 4},
            {5, 3, 4, 4, 5, 3},
            {4, 5, 4, 3, 4, 5}
        };

        // Hitung Rata-Rata Per Responden
        System.out.println("Rata-rata untuk setiap responden:");
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
    }
}
