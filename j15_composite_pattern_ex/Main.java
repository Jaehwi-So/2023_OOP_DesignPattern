package j15_composite_pattern_ex;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Rectangle square = new Rectangle();

        Group group = new Group();
        group.addShape(circle);
        group.addShape(square);

        // 그룹화된 도형 그리기
        group.draw();
    }
}
