package ip02_midterm_2023;

public class SpeedDisplay extends DisplayDecorator {
    private Display display;
    private int height;
    private int width;
    private int speed;

    public SpeedDisplay(Display display, int width, int height) {
        this.display = display;
        this.width = width;
        this.height = height;
        speed = RandIntInRange.nextInt(40, 50);
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
        System.out.println("Speed: " + speed);
        drawBlankLines();
        drawHorizontalBorderLine();
    }

}
