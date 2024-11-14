import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class MataKuliah {
    private String namaMataKuliah;
    private int sks;
    private String nilaiHuruf;
    private int bobot;

    public MataKuliah(String namaMataKuliah, int sks, String nilaiHuruf) {
        this.namaMataKuliah = namaMataKuliah;
        this.sks = sks;
        this.nilaiHuruf = nilaiHuruf.toUpperCase();  // Memastikan nilai huruf dalam huruf besar
        this.bobot = hitungBobot(this.nilaiHuruf);
    }

    private int hitungBobot(String nilaiHuruf) {
        switch (nilaiHuruf) {
            case "A": return 4;
            case "B": return 3;
            case "C": return 2;
            case "D": return 1;
            case "E": return 0;
            default: return 0;
        }
    }

    public int getSks() {
        return sks;
    }

    public int getBobot() {
        return bobot;
    }

    @Override
    public String toString() {
        return String.format("%-20s %-5d %-5s %-5d", namaMataKuliah, sks, nilaiHuruf, bobot);
    }
}

public class InputMataKuliah {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input nama mahasiswa dan semester
        System.out.print("Masukkan nama mahasiswa: ");
        String namaMahasiswa = scanner.nextLine();

        System.out.print("Masukkan semester: ");
        int semester = scanner.nextInt();
        scanner.nextLine();  // membersihkan newline

        // ArrayList untuk menyimpan mata kuliah
        List<MataKuliah> mataKuliahList = new ArrayList<>();

        // Looping untuk input mata kuliah
        String lagi;
        do {
            System.out.print("Masukkan nama mata kuliah: ");
            String namaMataKuliah = scanner.nextLine();

            System.out.print("Masukkan SKS: ");
            int sks = scanner.nextInt();
            scanner.nextLine();  // membersihkan newline

            System.out.print("Masukkan nilai (A/B/C/D/E): ");
            String nilaiHuruf = scanner.nextLine().trim().toUpperCase();

            // Menambahkan objek MataKuliah ke dalam list
            mataKuliahList.add(new MataKuliah(namaMataKuliah, sks, nilaiHuruf));

            System.out.print("Apakah Anda ingin menambahkan mata kuliah lagi? (ya/tidak): ");
            lagi = scanner.nextLine().trim();

        } while (lagi.equalsIgnoreCase("ya"));

        // Menghitung total SKS dan total nilai bobot
        int totalSKS = 0;
        double totalNilaiBobot = 0.0;

        for (MataKuliah mk : mataKuliahList) {
            totalSKS += mk.getSks();
            totalNilaiBobot += mk.getSks() * mk.getBobot();
        }

        double rataRata = totalNilaiBobot / totalSKS;

        // Menampilkan hasil input dalam bentuk tabel
        System.out.println("====================================================");
        System.out.println("Nama Mahasiswa: " + namaMahasiswa);
        System.out.println("Semester: " + semester);
        System.out.println("Daftar Mata Kuliah:");
        System.out.println("----------------------------------------------------");
        System.out.printf("%-20s %-5s %-5s %-5s\n", "Mata Kuliah", "SKS", "Nilai", "Bobot");
        System.out.println("----------------------------------------------------");

        for (MataKuliah mk : mataKuliahList) {
            System.out.println(mk);
        }

        System.out.println("----------------------------------------------------");
        System.out.println("Total SKS yang diambil: " + totalSKS);
        System.out.printf("Nilai rata-rata: %.2f\n", rataRata);

        scanner.close();
    }
}
