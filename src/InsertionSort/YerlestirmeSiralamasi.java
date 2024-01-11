package InsertionSort;

public class YerlestirmeSiralamasi {
    /*
    Dizinin ilk elemanı grup kabul edilir.
    Ardından bu gruba diğer taraftan sırayla yeni elemanlar alınır.
    Yeni elemanlar dizi içerisinde sola doğru ilerleyerek kendi yerlerini bulurlar.
     */

    public static void insertionSort(int[] array, int n) {
        int i, j;
        for (i = 1; i < n; i++) { //  dizinin ikinci elemanından başlayarak her elemanı kontrol etmek için bir for döngüsü başlatılır.
            int tmp = array[i];
            j = i;
            while (j > 0 && array[j - 1] > tmp) { // j’nci elemanın bir önceki elemandan küçük olup olmadığı kontrol edilir. Eğer küçükse, while döngüsü devam eder
                array[j] = array[j - 1]; // j’nci elemanın yerine bir önceki elemanın değeri atanır.
                --j;
            }
            array[j] = tmp; // j’nci elemanın yerine tmp’nin değeri atanır. Bu, tmp’nin doğru konuma taşındığı anlamına gelir.
        }
    }
}

