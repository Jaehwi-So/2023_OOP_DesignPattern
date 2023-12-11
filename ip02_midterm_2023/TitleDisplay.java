package ip02_midterm_2023;

public class TitleDisplay implements Display {
    private int height;
    private int width;
    private String title;

    public TitleDisplay(String title, int width, int height) {
        this.width = width;
        this.height = height;
        this.title = title;
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
        drawHorizontalBorderLine();
        drawBlankLines();
        System.out.println(title);
        drawBlankLines();
        drawHorizontalBorderLine();
    }
}
