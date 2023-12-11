package j15_composite_pattern.leaf;

public class Rectangle extends Shape {
    private int[] coords = new int[4];

    public Rectangle(String name, int[] coords, int idx){
        super(name);
        this.coords[0] = coords[idx];
        this.coords[1] = coords[idx + 1];
        this.coords[2] = coords[idx + 2];
        this.coords[3] = coords[idx + 3];
        this.calcBound();

    }

    private void calcBound(){
        super.setMinX(Math.min(this.coords[0], this.coords[2]));
        super.setMaxX(Math.max(this.coords[0], this.coords[2]));
        super.setMinY(Math.min(this.coords[1], this.coords[3]));
        super.setMaxY(Math.max(this.coords[1], this.coords[3]));
    }
}
