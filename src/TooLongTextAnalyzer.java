public class TooLongTextAnalyzer implements TextAnalyzer {
    private int maxLength;

    public TooLongTextAnalyzer(int maxLength) {
    }

    @Override
    public Label processText(String text) {
        return null;
    }
}


