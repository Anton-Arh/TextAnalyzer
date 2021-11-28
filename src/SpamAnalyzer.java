public class SpamAnalyzer extends KeywordAnalyzer{
    private String keywords;

    public SpamAnalyzer(String[] keywords) {
        super();
    }

    @Override
    protected String[] getKeywords() {
        return new String[0];
    }

    @Override
    protected Label getLabel() {
        return null;
    }
}
