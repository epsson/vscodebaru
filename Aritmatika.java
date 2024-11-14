import java.util.InputMismatchException;
import java.util.Scanner;

public class Aritmatika {
    public static void main(String[] args) {

        // membuat scanner
        Scanner input = new Scanner(System.in);

        System.out.println("Aritmatika Dasar");
        System.out.println("Berapa angka yang ingin di hitung");

        int x = 0; // x adalah jumlah angka yang ingin dihitung
        int hasil = 0; // hasil adalah hasil dari operasi aritmatika

        // memasukan value untuk x
        // menggunakan try-catch untuk menangkap error jika input bukan angka
        while (true) {
            try {
                x = input.nextInt();

                // jika x lebih dari 1, maka program akan di lanjutkan
                if (x > 1) {
                    input.nextLine();
                    break;
                } else {
                    System.out.println("\nMasukkan angka lebih dari 1. Coba lagi.");
                }

            } catch (InputMismatchException e) {
                System.out.println("\nInput bukan angka. Coba lagi.");
                input.next();
            }
        }

        String op = ""; // op adalah operasi aritmatika yang diinginkan

        boolean programDone = true; // programDone adalah status program
        boolean angkaHitung = true; // angkaHitung digunakan untuk menentukan apakah program akan menyuruh user
                                    // menginput value x

        while (programDone) {

            // jika angkaHitung false, maka program akan meminta user untuk menginput value
            // x
            if (angkaHitung == false) {

                hasil = 0; // reset hasil
                System.out.println("\nBerapa angka yang ingin di hitung");
                x = input.nextInt();
                input.nextLine();
            }
            System.out.println("\nPilih operasi yang diinginkan:");
            System.out.println("A. Penjumlahan\nB. Pengurangan\nC. Perkalian\nD. Pembagian");

            op = input.nextLine(); // memasukan value untuk op

            // jika op adalah penjumlahan, maka program akan menjalankan operasi penjumlahan
            if (op.equalsIgnoreCase("A") || op.equalsIgnoreCase("penjumlahan")) {

                while (true) {
                    try {
                        for (int i = 0; i < x; i++) {
                            System.out.println("\nMasukkan angka ke-" + (i + 1) + ":");
                            int a = input.nextInt();
                            hasil += a;
                            System.out.println("\nHasil operasi: " + hasil);
                        }

                        // menanyakan apakah user ingin menggunakan program ini lagi
                        System.out.println("\nApakah masih ingin menggunakan program ini? (Y/N)");
                        op = input.nextLine();
                        String last = input.nextLine();

                        if (last.equalsIgnoreCase("Y")) {
                            angkaHitung = false; // jika user ingin menggunakan program ini lagi, maka angkaHitung akan
                                                 // di set false
                            break;
                        } else {
                            programDone = false; // jika user tidak ingin menggunakan program ini lagi, maka programDone
                                                 // akan di set false
                            break;
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("\nInput bukan angka. Coba lagi.");
                        hasil = 0;
                        input.next();
                    }
                }

                // jika op adalah pengurangan, maka program akan menjalankan operasi pengurangan
            } else if (op.equalsIgnoreCase("B") || op.equalsIgnoreCase("pengurangan")) {

                while (true) {
                    try {
                        System.out.println("\nMasukkan angka ke-1:");
                        hasil = input.nextInt();
                        for (int i = 1; i < x; i++) {
                            System.out.println("\nMasukkan angka ke-" + (i + 1) + ":");
                            int a = input.nextInt();
                            hasil -= a;
                            System.out.println("\nHasil operasi: " + hasil);
                        }

                        System.out.println("\nApakah masih ingin menggunakan program ini? (Y/N)");
                        op = input.nextLine();
                        String last = input.nextLine();

                        if (last.equalsIgnoreCase("Y")) {
                            angkaHitung = false; // jika user ingin menggunakan program ini lagi, maka angkaHitung akan
                                                 // di set false
                            break;
                        } else {
                            programDone = false; // jika user tidak ingin menggunakan program ini lagi, maka programDone
                                                 // akan di set false
                            break;
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("\nInput bukan angka. Coba lagi.");
                        hasil = 0;
                        input.next();
                    }
                }

                // jika op adalah perkalian, maka program akan menjalankan operasi perkalian
            } else if (op.equalsIgnoreCase("C") || op.equalsIgnoreCase("perkalian")) {

                while (true) {
                    try {
                        System.out.println("\nMasukkan angka ke-1:");
                        hasil = input.nextInt();
                        for (int i = 1; i < x; i++) {
                            System.out.println("\nMasukkan angka ke-" + (i + 1) + ":");
                            int a = input.nextInt();
                            hasil *= a;
                            System.out.println("\nHasil operasi: " + hasil);
                        }

                        System.out.println("\nApakah masih ingin menggunakan program ini? (Y/N)");
                        op = input.nextLine();
                        String last = input.nextLine();

                        if (last.equalsIgnoreCase("Y")) {
                            angkaHitung = false; // jika user ingin menggunakan program ini lagi, maka angkaHitung akan
                                                 // di set false
                            break;
                        } else {
                            programDone = false; // jika user tidak ingin menggunakan program ini lagi, maka programDone
                                                 // akan di set false
                            break;
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("\nInput bukan angka. Coba lagi.");
                        hasil = 0;
                        input.next();
                    }
                }

                // jika op adalah pembagian, maka program akan menjalankan operasi pembagian
            } else if (op.equalsIgnoreCase("D") || op.equalsIgnoreCase("pembagian")) {
                while (true) {
                    try {
                        System.out.println("\nMasukkan angka ke-1:");
                        hasil = input.nextInt();
                        for (int i = 1; i < x; i++) {
                            System.out.println("\nMasukkan angka ke-" + (i + 1) + ":");
                            float a = input.nextInt();
                            hasil /= a;
                            System.out.println("\nHasil operasi: " + hasil);
                        }

                        System.out.println("\nApakah masih ingin menggunakan program ini? (Y/N)");
                        op = input.nextLine();
                        String last = input.nextLine();

                        if (last.equalsIgnoreCase("Y")) {
                            angkaHitung = false; // jika user ingin menggunakan program ini lagi, maka angkaHitung akan
                                                 // di set false
                            break;
                        } else {
                            programDone = false; // jika user tidak ingin menggunakan program ini lagi, maka programDone
                                                 // akan di set false
                            break;
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("\nInput bukan angka. Coba lagi.");
                        hasil = 0;
                        input.next();
                    }
                }

            } else {
                System.out.println("Operasi tidak ditemukan. Coba lagi.");
            }

        }

        input.close(); // menutup input



        
    }
}