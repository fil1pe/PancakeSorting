package sortalgorithms;

/**
 * Implementa a lógica que deve ser usada pelas classes que realizam as trocas
 * procura diminuir a redundãncia no código
 *
 * @author udesc
 *
 */
abstract class AbstractSortStrategy implements IStrategy {

    /**
     * Dados que serão ordenados
     */
    private int[] elements;

    public AbstractSortStrategy() {
        super();
    }

    public AbstractSortStrategy(int[] elements) {
        this.elements = elements;
    }

    @Override
    public abstract int sort();

    @Override
    public int[] getElements() {
        return elements;
    }

    @Override
    public void setElements(int[] elements) {
        this.elements = elements;
    }

    // Método que troca as posições de elements[a] e elements[b]
    public void swap(int a, int b) {
        int tmp = this.getElements()[a];
        this.getElements()[a] = this.getElements()[b];
        this.getElements()[b] = tmp;
    }

    // Método que reverte a ordem de elements[0] a elements[i]
    public void flip(int i) {
        int temp, j = 0;
        while (j < i) {
            swap(i, j);
            j++;
            i--;
        }
    }

    // Método que retorna a posição do máximo elemento entre elements[0] a elements[i]
    public int max(int i) {
        int[] arr = this.getElements();
        int pos = 0;
        for (int j = 1; j <= i; j++) {
            if (arr[j] > arr[pos]) {
                pos = j;
            }
        }
        return pos;
    }

    // Método que imprime o vetor
    public void print() {
        for (int i = 0; i < elements.length; i++) {
            int j = elements[i];
            System.out.println(j);
        }
    }

}
