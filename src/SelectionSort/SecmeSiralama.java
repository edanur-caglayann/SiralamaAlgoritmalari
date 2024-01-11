package SelectionSort;

public class SecmeSiralama {
    /*
    Selection sort algoritması ile sıralanmamış bir listede
    her iterasyonda en küçük eleman bulunur. İterasyon sonunda
    belirlenen en küçük eleman listenin başında bulunan eleman
    ile yer değiştirir. Bir sonraki iterasyona dahil edilmez.
    İkinci iterasyonda yine array elemanlarından en küçük olanı bulunur
    ve bu sefer listedeki 2.eleman ile yer değiştirir ve bu şekilde
    liste sıralanana kadar devam eder.
     */
    public static void selectionSort(int[] array, int n) {
        int i, j, min;
        for (i = 0; i < n - 1; i++) { // Dizinin elemanlarını karşılaştırmak için bir for döngüsü başlattık.
            min = i; // min, her iterasyonda en küçük elemanın indeksini tutar.
            for (j = i + 1; j < n; j++) { // i’nci elemandan sonraki tüm elemanları kontrol etmek için bir iç for döngüsü başlatılır.
                if (array[j] < array[min]) { // j’nci elemanın min’deki elemandan küçük olup olmadığı kontrol edilir.
                    // Eğer j’nci eleman, min’deki elemandan küçükse, min’e j’nin değeri atanır.
                    min = j;
                    int tmp;
                    tmp = array[min];
                    array[min] = array[i];
                    array[i] = tmp;
                }
            }
        }
    }
}
