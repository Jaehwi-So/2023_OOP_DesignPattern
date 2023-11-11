package ip01_midterm_2022.decorator;

import ip01_midterm_2022.component.Shape;

public class Group extends ShapeDecorator{
    private Shape existShape;
    private Shape newShape;

    public Group(String name, Shape existShape, Shape newShape){
        this.setName(name);
        this.existShape = existShape;
        this.newShape = newShape;
    }

    @Override
    public void calcBounds() {
        this.existShape.calcBounds();
        this.newShape.calcBounds();
        this.setMinBoundsX(Integer.min(existShape.getMinBoundsX(), newShape.getMinBoundsX()));
        this.setMinBoundsY(Integer.min(existShape.getMinBoundsY(), newShape.getMinBoundsY()));
        this.setMaxBoundsX(Integer.max(existShape.getMaxBoundsX(), newShape.getMaxBoundsX()));
        this.setMaxBoundsY(Integer.max(existShape.getMaxBoundsY(), newShape.getMaxBoundsY()));
    }

    @Override
    public String getShapeName() {
        return this.getName();
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(getShapeName() + ":\n" + "minBoundsX: " + getMinBoundsX() + ", minBoundsY: " + getMinBoundsY() + "\n"
                + "maxBoundsX: " + getMaxBoundsX() + ", maxBoundsY: " + getMaxBoundsY() + "\n");
        builder.append(this.newShape.toString());
        builder.append(this.existShape.toString());

        String result = builder.toString();
        return result;
    }
}


