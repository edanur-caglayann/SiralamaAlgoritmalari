package BubbleSort;

public class BaloncukSiralamasi {
    /*
    Veri kümesinden bir eleman alınır. Kendinden sonraki veriden büyükse
    yer değiştirilie. Diğer veriye geçildikten sonra bu işlem tekrarlanır.
    En son veriye gelindiğinde en büyük elemanımız sonda yer alır. Performans
    açısından orta~iyi olarak ifade edilir.
     */
    public static void BubbleSort(int[] array, int n) { // Dizi ve dizinin eleman sayısını parametre olarak alalım.
        boolean Continue = true; // Bu değişken döngünün devam edip etmeyeceğini kontrol eder.
        while (Continue) { // Continue değişkeni true olduğu sürece döngü devam eder.
            Continue = false; // Her döngü başında Continue değişkeni false olarak ayarlanır
            for (int j = 0; j < n - 1; j++) { //Karşılaştıracağımız için dizinin sonundan bir önceki elemana kadar bakacağız
                if (array[j] > array[j + 1]) { // Mevcut elemanın bir sonraki elemandan büyük olup olmadığı kontrol edilir.
                    // Mevcut eleman bir sonraki elemandan büyükse, iki eleman yer değiştirir.
                    int tmp;
                    tmp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = tmp;
                    Continue = true; // Döngünün bir sonraki iterasyon için devam etmesini sağlar.
                }
            }
        }
    }


}
