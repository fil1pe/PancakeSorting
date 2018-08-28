package sortalgorithms;

public interface IStrategy {

    /**
     * Realiza a ordenação
     * @return 
     */
    public abstract int sort();

    /**
     * Retorna o array com os dados
     *
     * @return
     */
    public int[] getElements();

    /**
     * Registra os elementos que serão ordenados
     *
     * @param elements
     */
    public void setElements(int[] elements);

}
