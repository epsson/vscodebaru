import java.util.Scanner;

public class GajiDanLembur {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input gaji bulanan
        System.out.print("Masukkan gaji bulanan: ");
        double gajiBulanan = scanner.nextDouble();

        // Input jam lembur
        System.out.print("Masukkan jam lembur: ");
        int jamLembur = scanner.nextInt();

        // Menghitung upah lembur per jam
        int upahPerJam = (int) Math.ceil(gajiBulanan / 173);

        // Menghitung total upah lembur
        int upahLemburTotal;
        if (jamLembur <= 4) {
            upahLemburTotal = jamLembur * upahPerJam;
        } else {
            // 4 jam pertama
            upahLemburTotal = 4 * upahPerJam;
            // Jam lembur lebih dari 4
            int jamLemburLebih = jamLembur - 4;
            upahLemburTotal += jamLemburLebih * (2 * upahPerJam);
        }

        // Total gaji
        double totalGaji = gajiBulanan + upahLemburTotal;

        // Menampilkan hasil
        System.out.println("Upah lembur per jam: " + upahPerJam);
        System.out.println("Total upah lembur: " + upahLemburTotal);
        System.out.println("Total gaji yang diberikan: " + totalGaji);
        
        scanner.close();
    }
}
