package j12_composite_pattern;

public class Rectangle extends Shape{
    private int[] coords;
    private int minX;
    private int minY;
    private int maxX;
    private int maxY;

    public Rectangle(String name, int[] coords, int idx){
        super(name);
        this.coords[0] = coords[idx];
        this.coords[1] = coords[idx + 1];
        this.coords[2] = coords[idx + 2];
        this.coords[3] = coords[idx + 3];
        this.calcBound();

    }

    private void calcBound(){
        this.minX = this.coords[0];
        this.maxX = this.coords[2];

        if(this.coords[0] > this.coords[2]){
            this.minX = this.coords[2];
            this.maxX = this.coords[0];
        }

        this.minY = this.coords[1];
        this.maxY = this.coords[3];
        if(this.coords[1] > this.coords[3]){
            this.minY = this.coords[3];
            this.maxY = this.coords[1];
        }
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
    public String getName() {
        return super.getName();
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
        System.out.println(getName());
        System.out.println(String.format("minBoundsX: %d, minBoundsY: %d", this.minX, this.minY));
        System.out.println(String.format("maxBoundsX: %d, maxBoundsY: %d", this.maxX, this.maxY));
    }
}
