package sortalgorithms;

/**
 * Faz Pancake Sorting com busca binária
 *
 * baseado em https://www.geeksforgeeks.org/a-pancake-sorting-question/
 *
 * @author Filipe Ramos e Paula Campigotto
 */
public class BetterPancakeSortStrategy extends AbstractSortStrategy {

    /**
     * Implementa ordenação Pancake Sorting com busca binária
     *
     * @return número de flips
     */
    @Override
    public int sort() {
        int ans = 0;

        int[] elements = this.getElements();
        int length = elements.length;

        for (int i = 1; i < length; i++) {
            int aux = ceilSearch(elements, 0, i - 1, elements[i]);

            if (aux != -1) {
                flip(aux - 1);
                flip(i - 1);
                flip(i);
                flip(aux);
                ans += 4;
            }
        }

        return ans;
    }

    int ceilSearch(int arr[], int low, int high, int x) { // busca binária do menor y >= x entre arr[low] e arr[high]
        if (x <= arr[low]) {
            return low;
        }

        if (x > arr[high]) {
            return -1;
        }

        int mid = (low + high) / 2;

        if (arr[mid] == x) {
            return mid;
        }

        if (arr[mid] < x) {
            if (mid + 1 <= high && x <= arr[mid + 1]) {
                return mid + 1;
            } else {
                return ceilSearch(arr, mid + 1, high, x);
            }
        }

        if (mid - 1 >= low && x > arr[mid - 1]) {
            return mid;
        } else {
            return ceilSearch(arr, low, mid - 1, x);
        }
    }
}
