package ip02_midterm_2023;

public class DisplayDecoratorFactory extends DisplayFactory{
    @Override
    public Display createDecoratorDisplay(String moduleName, int width, int height, Display display){
        Display tmp = null;
        if (moduleName.equals("speed")) {
            tmp = new SpeedDisplay(display, 60, 3);
        }
        else if (moduleName.equals("time")) {
            tmp= new TimeDisplay(display,60, 3);
        }
        else if (moduleName.equals("weather")) {
            tmp= new WeatherDisplay(display, 60, 3);
        }
        return tmp;
    }

    @Override
    public Display createTitleDisplay(String title, int width, int height){
        return new TitleDisplay(title, width, height);
    }
}
