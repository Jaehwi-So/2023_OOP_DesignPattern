package j12_facade_pattern;

public interface Compiler {
    /**
     * SourceCode를 입력으로 받고 ObjectCode를 반환하는 compile() 함수 포함
     */
    public ObjectCode compile(SourceCode sourceCode);
}
