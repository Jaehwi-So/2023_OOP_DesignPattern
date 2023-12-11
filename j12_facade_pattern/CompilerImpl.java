package j12_facade_pattern;

public class CompilerImpl implements Compiler {

    @Override
    public ObjectCode compile(SourceCode sourceCode) {
        String origin = sourceCode.getFilename();
        System.out.println("Compiling code: " + origin);
        String objName = origin.replace(".c", ".obj");
        ObjectCode obj =  new ObjectCode(objName);
        System.out.println("Generating object code: " + obj.getFilename());
        return obj;
    }
}
