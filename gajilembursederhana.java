import java.util.Scanner;

public class gajilembursederhana {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input gaji bulanan
        System.out.print("Masukkan gaji bulanan: ");
        double gaji = scanner.nextDouble();

        // Asumsi: jam lembur tetap 6 jam, dan upah lembur 1,5 kali upah per jam
        double upahPerJam = gaji / 173;
        double totalUpahLembur = 6 * upahPerJam * 1.5;  // 6 jam lembur * 1.5 upah lembur per jam
        double gajiTotal = gaji + totalUpahLembur;

        // Tampilkan hasil tanpa format khusus
        System.out.println("Gaji total termasuk lembur: Rp " + gajiTotal);

        scanner.close();
    }
}
