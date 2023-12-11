package ip01_midterm_2022.component;

import ip01_midterm_2022.MyRandom;

public class Triangle extends Shape{
    private int x1;
    private int x2;
    private int x3;
    private int y1;
    private int y2;
    private int y3;


    public Triangle(String name, int min, int max){
        this.setName(name);
        this.x1 = MyRandom.randInt(min, max);
        this.y1 = MyRandom.randInt(min, max);
        this.x2 = MyRandom.randInt(min, max);
        this.y2 = MyRandom.randInt(min, max);
        this.x3 = MyRandom.randInt(min, max);
        this.y3 = MyRandom.randInt(min, max);
    }

    public int getMax(int n1, int n2, int n3){
        int max = 0;
        max = Integer.max(n1, n2);
        return Integer.max(max, n3);
    }

    public int getMin(int n1, int n2, int n3){
        int min = 0;
        min = Integer.min(n1, n2);
        return Integer.min(min, n3);
    }

    @Override
    public void calcBounds() {
        this.setMaxBoundsX(getMax(x1, x2, x3));
        this.setMinBoundsX(getMin(x1, x2, x3));
        this.setMaxBoundsY(getMax(y1, y2, y3));
        this.setMinBoundsY(getMin(y1, y2, y3));
    }

    @Override
    public String getShapeName() {
        return this.getName();
    }

}
