package sortalgorithms;

/**
 * Associado a uma ação de interface ou de negócio realiza a ordenação
 *
 * @author Filipe Ramos e Paula Campigotto
 *
 */
public class StrategyCommand {

    /**
     * Ordena o array usando o algoritmo definido
     *
     * @param elements
     * @param strategy
     */
    public static void execute(int[] elements, IStrategy strategy) {
        strategy.setElements(elements);
        strategy.sort();
    }
}
