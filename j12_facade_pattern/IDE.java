package j12_facade_pattern;

import java.util.ArrayList;
import java.util.List;

public class IDE implements Builder{
    private String projectName;
    private Preprocessor preprocessor;
    private Compiler compiler;
    private Linker linker;

    public IDE(Preprocessor preprocessor, Compiler compiler, Linker linker){
        this.preprocessor = preprocessor;
        this.compiler = compiler;
        this.linker = linker;
    }
    @Override
    public void createProject(String projectName) {
        this.projectName = projectName;

    }

    @Override
    public Executable build(SourceCode[] sourceCodes) {
        List<ObjectCode> objList = new ArrayList<>();
        for(SourceCode code : sourceCodes){
            SourceCode pre = this.preprocessor.preprocess(code);
            ObjectCode comp = this.compiler.compile(pre);
            objList.add(comp);

        }
        Executable exec = this.linker.link(this.projectName, objList);
        return exec;
    }

    @Override
    public Executable build(List<SourceCode> sourceCodes) {
        List<ObjectCode> objList = new ArrayList<>();
        for(SourceCode code : sourceCodes){
            SourceCode pre = this.preprocessor.preprocess(code);
            ObjectCode comp = this.compiler.compile(pre);
            objList.add(comp);

        }
        Executable exec = this.linker.link(this.projectName, objList);

        return exec;
    }
}
