import java.util.Random;

public class insertionSort {
    
    //pembuat angka random
    public static void main(String[] args){
        Random rand = new Random();
        int[] numbers = new int[5];//banyaknya angka yang di hasilkan
        
        //membuat angka random antara 0 sampai 49 (50 angka)
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(50);
        }
        //output yang akan dikeluarkan
        System.out.println("sebelum: ");
        printArray(numbers);

        InsertionSort(numbers);

        System.out.println("\nsesudah:");
        printArray(numbers);
    }

    //metode penyelesaian insertionsort atau eksekusinya
    private static void InsertionSort(int[] inputArray) {
    for (int i = 1; i < inputArray.length; i++){
        //mencari posisi angka yang seharusnya
        int totalangka = inputArray[i];
        
        //memundurkan angka dari yang terkecil kebelakang
        //mencari posisi array
        int j = i - 1;
        //untuk memindahkan angka yang lebih besar ke bagian depan dari angka yang terkecil
        while (j >= 0 && inputArray[j] > totalangka) {
            inputArray[j + 1] = inputArray[j];
            j--;
            }
            inputArray[j + 1] = totalangka;
        }
    }   
    //fungsi untuk mengeluarkan hasil sebelum dan sesudah pada bagian atas
    private static void printArray(int[] numbers){
        for (int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }
}
