package Module3OOP.OOP.Exercise3;

public class SpamAnalyzer extends KeywordAnalyzer {

    private String[] keywords;

    public SpamAnalyzer(String[] keywords) {
        this.keywords = keywords;
    }

    @Override
    public Label getlabel() {
        return Label.SPAM;
    }

    @Override
    public String[] getKeywords() {
        return keywords;
    }
}
