package MergeSort;

public class Main {
    public static void main(String[] args) {
        int[] array = {3, 7, 2, 13, 21, 12}; // Sıralanacak dizi
        System.out.println("Original Array:");
        printArray(array);

        BirlestirmeSiralama.mergeSort(array, 0, array.length - 1); // Merge sort çağrısı

        System.out.println("Sorted Array:");
        printArray(array);
    }

    public static void printArray(int[] array) { // Diziyi yazdırmak için yardımcı metod
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}

