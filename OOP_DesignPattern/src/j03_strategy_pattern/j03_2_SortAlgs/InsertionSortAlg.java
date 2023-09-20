package j03_strategy_pattern.j03_2_SortAlgs;

public class InsertionSortAlg implements SortAlgs {
    @Override
    public void sort(int[] data) {
        for (int i = 1; i < data.length; i++) {
            int key = data[i];
            int j;
            for (j = i - 1; j >= 0 && data[j] > key; j--) {
                data[j + 1] = data[j];
            }
            data[j + 1] = key;
        }
    }
}
