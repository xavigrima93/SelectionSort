package ioc.xtec.cat.selectionsort;

public class SelectionSort {

    /**
 * Classe que implementa l'algorisme de Selection Sort per ordenar arrays.
 * 
 * Autor: Xavier Grima Salinas
 * Versió: 2.0
 */
    
   public void sort(int[] arr) {
        // Imprimir nom, cognoms i missatge personal
        System.out.println("Nom i cognoms: Xavier Grima Salinas");
        System.out.println("Missatge: He aprés molt fent el mòdul 8 de DAW encara que hagi estat dur!!!");

       
       int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public boolean contains(int[] arr, int value) {
        if (arr == null) {
            throw new IllegalArgumentException("L'array no pot ser nul.");
        }

        for (int num : arr) {
            if (num == value) {
                return true;
            }
        }
        return false;
    }
    
}
