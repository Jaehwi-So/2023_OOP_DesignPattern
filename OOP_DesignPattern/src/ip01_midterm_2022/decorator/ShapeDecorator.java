package ip01_midterm_2022.decorator;

import ip01_midterm_2022.component.Shape;

public abstract class ShapeDecorator extends Shape {

    public abstract void calcBounds();

    public abstract String getShapeName();

    public abstract String toString();
}
