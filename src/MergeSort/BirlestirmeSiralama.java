package MergeSort;

public class BirlestirmeSiralama {
    public static void mergeSort(int[] array, int first, int last) {
        if (first < last) {
            int mid = (first + last) / 2;  // Diziyi ikiye bölme işlemi
            mergeSort(array, first, mid); // Dizinin ilk yarısını sıralama
            mergeSort(array, mid + 1, last); // Dizinin ikinci yarısını sıralama

            merge(array, first, mid, last); // İki yarıyı birleştirme
        }
    }

    public static void merge(int[] array, int first, int mid, int last) {
        int[] tmpArray = new int[last - first + 1];  // Geçici dizi oluşturma
        int first1 = first; // İlk yarının başlangıcı
        int last1 = mid; // İlk yarının sonu
        int first2 = mid + 1; // İkinci yarının başlangıcı
        int last2 = last; // İkinci yarının sonu
        int index = 0; // Geçici dizi için indeks

        while (first1 <= last1 && first2 <= last2) {  // İki yarıyı karşılaştırma ve birleştirme
            if (array[first1] < array[first2]) {
                tmpArray[index] = array[first1];
                ++first1;
            } else {
                tmpArray[index] = array[first2];
                ++first2;
            }
            ++index;
        }

        while (first1 <= last1) {  // İlk yarıda kalan elemanları ekler
            tmpArray[index] = array[first1];
            ++first1;
            ++index;
        }

        while (first2 <= last2) { // İkinci yarıda kalan elemanları ekler
            tmpArray[index] = array[first2];
            ++first2;
            ++index;
        }

        // Geçici diziyi orijinal diziye kopyalar
        for (index = 0; index < tmpArray.length; ++index) {
            array[index + first] = tmpArray[index];
        }

    }

}
