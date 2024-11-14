public class soso {
    public static void main(String[] args) {
        int n = 4; // total jumlah loop

        for (int i = 0; i < n; i++) { // Loop untuk row
            for (int j = 0; j < n; j++) { // Loop untuk column
                if (j < n - i - 1) {
                    System.out.print("S");
                } else {
                    System.out.print("O");
                }
            }
            System.out.println(); // Move to the next line
        }
    }
}
