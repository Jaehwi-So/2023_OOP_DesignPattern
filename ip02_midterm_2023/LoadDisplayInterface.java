package ip02_midterm_2023;

import java.util.List;

public interface LoadDisplayInterface {
    /**
     * <p> 파일을 읽고 각 줄에 있는 내용을 리스트로 구성해서 반환함
     * </p>
     * @param 없음
     * @return 파일에 있는 각 줄의 내용을 각각 요소로 갖는 리스트
     */
    public List<String> load();
}