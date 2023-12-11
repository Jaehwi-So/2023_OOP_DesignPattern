package j15_composite_pattern.leaf;

public class Triangle extends Shape {
    private int[] coords = new int[6];

    public Triangle(String name, int[] coords, int idx){
        super(name);
        this.coords[0] = coords[idx];
        this.coords[1] = coords[idx + 1];
        this.coords[2] = coords[idx + 2];
        this.coords[3] = coords[idx + 3];
        this.coords[4] = coords[idx + 4];
        this.coords[5] = coords[idx + 5];
        this.calcBound();

    }

    private int getMin(int x, int y, int z){
        int min = Math.min(Math.min(x, y), z);
        return min;
    }

    private int getMax(int x, int y, int z){
        int max = Math.max(Math.max(x, y), z);
        return max;
    }

    private void calcBound(){
        super.setMinX(this.getMin(coords[0], coords[2], coords[4]));
        super.setMaxX(this.getMax(coords[0], coords[2], coords[4]));
        super.setMinY(this.getMin(coords[1], coords[3], coords[5]));
        super.setMaxY(this.getMax(coords[1], coords[3], coords[5]));
    }

}
