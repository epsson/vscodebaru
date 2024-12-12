import java.util.Scanner;

public class gajilembursederhana {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan gaji bulanan: ");
        double gaji = scanner.nextDouble();

        double upahPerJam = gaji / 150;
        double totalUpahLembur = 5 * upahPerJam * 1.5;  // 6 jam lembur * 1.5 upah lembur per jam
        double gajiTotal = gaji + totalUpahLembur;

        // Tampilkan hasil tanpa format khusus
        System.out.println("Gaji total termasuk lembur: Rp " + gajiTotal);

        scanner.close();
    }
}
