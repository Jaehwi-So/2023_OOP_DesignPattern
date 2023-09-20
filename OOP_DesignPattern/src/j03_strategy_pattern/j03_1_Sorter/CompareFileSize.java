package j03_strategy_pattern.j03_1_Sorter;

public class CompareFileSize implements Comparable {
    @Override
    public int compareTo(Object o1, Object o2) {
        FileInfo f1 = (FileInfo)o1;
        FileInfo f2 = (FileInfo)o2;

        return f1.getSize() > f2.getSize() ? 1 : 0;
    }
}
