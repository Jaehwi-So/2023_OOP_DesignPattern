import java.time.LocalDateTime;

public class WeatherDisplay extends DisplayDecorator {
    private Display display;
    private int height;
    private int width;
    private LocalDateTime t;

    public WeatherDisplay(Display display, int width, int height) {
        this.display = display;
        this.width = width;
        this.height = height;
    }


    public int getWidth() { return width; }
    public int getHeight() { return height; }

    public void drawHorizontalBorderLine() {
        System.out.print("+");
        for (int i = 0; i < getWidth() - 2; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }

    public void drawBlankLines() {
        for (int i = 0; i < height / 2; i++) {
            System.out.print("\n");
        }
    }

    public void show() {
        this.display.show();
        drawHorizontalBorderLine();
        drawBlankLines();
        System.out.println("Wearhter: 섭씨 " + RandIntInRange.nextInt(15, 25) + "도");
        drawBlankLines();
        drawHorizontalBorderLine();
    }
}