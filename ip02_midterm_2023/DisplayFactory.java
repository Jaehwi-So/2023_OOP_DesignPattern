package ip02_midterm_2023;

public abstract class DisplayFactory{

    public abstract Display createDecoratorDisplay(String moduleName, int width, int height, Display display);

    public abstract Display createTitleDisplay(String title, int width, int height);



}
