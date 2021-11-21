public abstract class KeywordAnalyzer implements TextAnalyzer {
    protected abstract void getKeywords();
    protected abstract void getLabel();
    @Override
    public Label processText(String text) {
        return null;
    }
}
