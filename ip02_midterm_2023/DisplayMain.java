package ip02_midterm_2023;

import java.util.List;


/**
 * 휴먼지능정보공학과 201810776 소재휘
 * ID: 휘릴리76
 */
public class DisplayMain {
    public static void main(String[] args) {
        List<String> list;
        String filename = "src/displays.txt";
//        String filename = "displays.txt";
        LoadDisplayInterface loadDisplay = new LoadDisplayModules(filename);
        list = loadDisplay.load();


        DisplayFactory factory = new DisplayDecoratorFactory(); //Factory
        Display display = factory.createTitleDisplay(list.get(0), 60, 3);

        for (int i = 1; i < list.size(); i++) {
            String moduleName = list.get(i);
            display = factory.createDecoratorDisplay(moduleName, 60, 3, display);    //팩토리 내에서 데코레이터 패턴으로 감싸진 객체 생성
        }
        display.show(); // 나머지 디스플레이 출력



    }
}