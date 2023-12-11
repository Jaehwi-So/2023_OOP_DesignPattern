package ip01_midterm_2022.factory;

import ip01_midterm_2022.component.Shape;

public interface ShapeFactoryInterface {
    public Shape createShape(String type, String name, int min, int max);
}
