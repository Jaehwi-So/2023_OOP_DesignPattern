package j15_composite_pattern.composite;

import j15_composite_pattern.component.Selectable;

import java.util.ArrayList;
import java.util.List;

public class Group implements Selectable {
    private int num;
    private List<Selectable> selects = new ArrayList<>();

    private int maxX = 0;
    private int maxY = 0;
    private int minX = Integer.MAX_VALUE;
    private int minY = Integer.MAX_VALUE;


    public Group(int num){
        this.num = num;
    }
    public void add(Selectable select){
        selects.add(select);
        this.calcBound();
    }


    @Override
    public int getMinBoundsX() {
        return this.minX;
    }

    @Override
    public int getMinBoundsY() {
        return this.minY;
    }

    @Override
    public int getMaxBoundsX() {
        return maxX;
    }

    @Override
    public int getMaxBoundsY() {
        return maxY;
    }

    private void calcBound(){
        for(Selectable s : selects) {
            this.minX = Math.min(this.minX, s.getMinBoundsX());
            this.minY = Math.min(this.minY, s.getMinBoundsY());
            this.maxX = Math.max(this.maxX, s.getMaxBoundsX());
            this.maxY = Math.max(this.maxY, s.getMaxBoundsY());

        }
    }

    @Override
    public String getName() {
        return "Group:" + this.num;
    }

    @Override
    public boolean isSelected(int x, int y) {
        if (x <= maxX && x >= minX && y <= maxY && y >= minY) {
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public void print() {
        System.out.println(this.getName());
        System.out.println("NumOfSelectables: " + selects.size());
        System.out.println(String.format("minBoundsX: %d, minBoundsY: %d", this.minX, this.minY));
        System.out.println(String.format("maxBoundsX: %d, maxBoundsY: %d", this.maxX, this.maxY));
        for(Selectable s : selects){
            s.print();
        }
    }
}
