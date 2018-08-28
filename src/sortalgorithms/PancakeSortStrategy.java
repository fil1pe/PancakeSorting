package sortalgorithms;

/**
 * Faz Pancake Sorting tradicional
 *
 * @author Filipe Ramos e Paula Campigotto
 */
public class PancakeSortStrategy extends AbstractSortStrategy {

    /**
     * Implementa a ordenação Pancake Sorting tradicional
     *
     * @return número de flips
     */
    @Override
    public int sort() {
        int ans = 0;

        int[] elements = this.getElements();
        int length = elements.length;

        for (int n = length; n > 1; n--) {
            int maxPos = max(n - 1);
            if (maxPos != length - 1) {
                if (maxPos != 0) {
                    flip(maxPos);
                    ans++;
                }
                flip(n - 1);
                ans++;
            }
        }

        return ans;
    }
}
