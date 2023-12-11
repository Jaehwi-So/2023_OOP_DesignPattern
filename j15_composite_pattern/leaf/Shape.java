package j15_composite_pattern.leaf;

import j15_composite_pattern.component.Selectable;

public abstract class Shape implements Selectable {
    private String name;

    private int minX;
    private int minY;
    private int maxX;
    private int maxY;

    public Shape(String name){
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
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
        return this.maxX;
    }

    @Override
    public int getMaxBoundsY() {
        return this.maxY;
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
        System.out.println(String.format("minBoundsX: %d, minBoundsY: %d", this.minX, this.minY));
        System.out.println(String.format("maxBoundsX: %d, maxBoundsY: %d", this.maxX, this.maxY));
    }



    public void setMinX(int minX) {
        this.minX = minX;
    }


    public void setMinY(int minY) {
        this.minY = minY;
    }


    public void setMaxX(int maxX) {
        this.maxX = maxX;
    }

    public void setMaxY(int maxY) {
        this.maxY = maxY;
    }
}
