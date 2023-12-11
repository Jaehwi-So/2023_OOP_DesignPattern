package ip01_midterm_2022.component;

public abstract class Shape {


    private String name;
    private int minBoundsX;
    private int minBoundsY;
    private int maxBoundsX;
    private int maxBoundsY;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getMinBoundsX() { return minBoundsX; }
    public int getMinBoundsY() { return minBoundsY; }
    public int getMaxBoundsX() { return maxBoundsX; }
    public int getMaxBoundsY() { return maxBoundsY; }

    public void setMinBoundsX(int minX) {
        minBoundsX = minX;
    }

    public void setMinBoundsY(int minY) {
        minBoundsY = minY;
    }

    public void setMaxBoundsX(int maxX) {
        maxBoundsX = maxX;
    }

    public void setMaxBoundsY(int maxY) {
        maxBoundsY = maxY;
    }

    public String toString() {
        return getShapeName() + ":\n" + "minBoundsX: " + getMinBoundsX() + ", minBoundsY: " + getMinBoundsY() + "\n"
                + "maxBoundsX: " + getMaxBoundsX() + ", maxBoundsY: " + getMaxBoundsY() + "\n";
    }

    public abstract void calcBounds();

    public abstract String getShapeName();
}
