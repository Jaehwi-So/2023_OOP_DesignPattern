package ip01_midterm_2022.component;

import ip01_midterm_2022.MyRandom;

public class Rectangle extends Shape{
    private int x1;
    private int x2;
    private int y1;
    private int y2;


    public Rectangle(String name, int min, int max){
        this.setName(name);
        this.x1 = MyRandom.randInt(min, max);
        this.y1 = MyRandom.randInt(min, max);
        this.x2 = x1 + 30;
        this.y2 = y1 + 20;
    }

    @Override
    public void calcBounds() {
        this.setMinBoundsX(x1);
        this.setMinBoundsY(y1);
        this.setMaxBoundsX(x2);
        this.setMaxBoundsY(y2);

    }

    @Override
    public String getShapeName() {
        return this.getName();
    }

}
