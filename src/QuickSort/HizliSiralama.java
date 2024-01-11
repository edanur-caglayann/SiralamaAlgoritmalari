package QuickSort;

public class HizliSiralama {
    /*
    Böl ve yönet mantığı ile çalışır.
    Dizide bir pivot eleman seçilir,
    bu pivot bir nevi referans noktası olarak kabul edilir.
    Bu referans noktasının soluna kendinden küçük değerler,
    sağına ise kendinden büyük değerler getirilir.
    Ardından solda ve sağda oluşan dizilerde de pivot eleman
    seçilip aynı işlem uygulanır. Bu işlemlerin sonucunda dizimiz
    sıralanmış olur. Daha somut bir örnek için aşağıdaki şemayı inceleyebilirsiniz.
     */
    int partition(int arr[], int low, int hight) {
        int pivot = arr[hight];
        int i = (low - 1); // i değişkeni, pivotun solundaki elemanları takip etmek için kullanılır.
        for (int j = low; j < hight; j++) { // j değişkeni, pivotun sağındaki elemanları takip etmek için kullanılır.

            if (arr[j] <= pivot) {
                i++;

                //pivotu (last elemanı) ve i + 1’inci elemanı yer değiştirir. Bu, pivotun doğru konumuna yerleştirilmesini sağlar.
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[hight];
        arr[hight] = temp;

        return i + 1; //  pivotun son konumunu döndürür.
    }

    void sort(int arr[], int low, int hight) {
        if (low < hight) {
            //partition fonksiyonunu çağırır ve sonucunu pi adlı bir değişkene atar.
            // pi, pivotun son konumunu temsil eder.
            int pi = partition(arr, low, hight);


            sort(arr, low, pi - 1); // pivotun solundaki alt dizi üzerinde sort fonksiyonunu özyinelemeli olarak çağırır.
            sort(arr, pi + 1, hight); // pivotun sağındaki alt dizi üzerinde sort fonksiyonunu özyinelemeli olarak çağırır.
        }
    }


}
