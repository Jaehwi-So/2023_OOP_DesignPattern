package j03_strategy_pattern.j03_2_SortAlgs;

public class Sorter {
    private SortAlgs soltAlgs;

    public Sorter(SortAlgs soltAlgs){

        this.soltAlgs = soltAlgs;
    }

    public void setSortAlgs(SortAlgs soltAlgs){

        this.soltAlgs = soltAlgs;
    }

    public void sort(int[] data) {
        this.soltAlgs.sort(data);
    }
}
