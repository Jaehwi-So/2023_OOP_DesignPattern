package ip02_midterm_2023;

import java.time.LocalDateTime;

public class TimeDisplay extends DisplayDecorator{
    private Display display;
    private int height;
    private int width;
    private LocalDateTime t;

    public TimeDisplay(Display display, int width, int height) {
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
        System.out.println("Date: " + LocalDateTime.now().toString());
        drawBlankLines();
        drawHorizontalBorderLine();
    }
}
