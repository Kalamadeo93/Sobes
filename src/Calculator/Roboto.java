package Calculator;

import java.awt.*;
import java.util.Arrays;
import java.util.Objects;

public class Roboto{
    enum Label {
        SPAM, NEGATIVE_TEXT, TOO_LONG, OK
    }
    interface TextAnalyzer {
        Label processText(String text);
    }
    public static void main(String[] args) {

    }
    public Label checkLabels(TextAnalyzer[] analyzers, String text) {
        //Твой код здесь
        return Label.OK;
    }
    abstract public class KeywordAnalyzer implements TextAnalyzer{
        protected abstract String[] getKeywords();
        protected abstract Label getLabel();

        @Override
        public Label processText(String text) {
            for (String x : getKeywords()) {
                if (text.contains(x)) {
                    return getLabel();
                }
            }
            return Label.OK;
        }
    }
    public class SpamAnalyzer extends KeywordAnalyzer implements TextAnalyzer {
        private String[] keywords;
        public SpamAnalyzer(String[] keywords){
            this.keywords = keywords;
        }

        @Override
        protected String[] getKeywords() {
            return keywords;
        }

        @Override
        protected Label getLabel() {
            return Label.SPAM;
        }
    }
    public class NegativeTextAnalyzer extends KeywordAnalyzer implements TextAnalyzer{
        public final String[] keywords = {":(", "=(", ":|"};

        @Override
        protected String[] getKeywords() {
            return keywords;
        }

        @Override
        protected Label getLabel() {
            return Label.NEGATIVE_TEXT;
        }
    }
    public class TooLongTextAnalyzer implements TextAnalyzer{
        private int maxLength;
        public TooLongTextAnalyzer(int maxLength){
            this.maxLength = maxLength;
        }

        @Override
        public Label processText(String text) {
            if (text.length() < maxLength){
                return Label.OK;
            } else return Label.TOO_LONG;
        }
    }

    //Твой код здесь

//
}