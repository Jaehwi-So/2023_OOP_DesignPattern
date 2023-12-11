package j12_facade_pattern;

public interface Preprocessor {
    /**
     * SourceCode를 입력으로 받고 새로운 SourceCode 객체 반환
     */
    public SourceCode preprocess(SourceCode sourceCode);
}
