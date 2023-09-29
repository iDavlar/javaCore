package Module3OOP.OOP.Exercise3;

public abstract class KeywordAnalyzer implements TextAnalyzer {
    @Override
    public Label processText(String text) {
        String regex = "(.*)(" + String.join("|", this.getKeywords()) + ")(.*)";
        if (text.matches(regex)) {
            return this.getlabel();
        }
        return Label.OK;
    }

    public abstract Label getlabel();

    public abstract String[] getKeywords();
}
