package Module3OOP.OOP.Exercise3;

public class NegativeTextAnalyzer extends KeywordAnalyzer {
    @Override
    public Label getlabel() {
        return Label.NEGATIVE_TEXT;
    }

    @Override
    public String[] getKeywords() {
        return new String[]{":\\(", "=\\(", ":\\|", "=\\|"};
    }
}
