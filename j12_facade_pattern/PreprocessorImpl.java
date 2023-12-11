package j12_facade_pattern;

public class PreprocessorImpl implements Preprocessor {

    @Override
    public SourceCode preprocess(SourceCode sourceCode) {
        System.out.println("Preprocessing code: " + sourceCode.getFilename());
        String filename = "preprocessed_" + sourceCode.getFilename();
        System.out.println("Generating a new C code: " + filename);
        return new SourceCode(filename);

    }
}
