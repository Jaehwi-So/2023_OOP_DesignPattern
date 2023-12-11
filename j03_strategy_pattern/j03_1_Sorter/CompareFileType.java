package j03_strategy_pattern.j03_1_Sorter;

public class CompareFileType implements Comparable {
    @Override
    public int compareTo(Object o1, Object o2) {
        FileInfo f1 = (FileInfo)o1;
        FileInfo f2 = (FileInfo)o2;

        return f1.getType().compareTo(f2.getType());
    }
}
