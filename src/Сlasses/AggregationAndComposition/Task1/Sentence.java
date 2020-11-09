package Сlasses.AggregationAndComposition.Task1;

public class Sentence {

    private String sentence = "";

    public Sentence() {
    }

    public Sentence(String sentence) {
        this.sentence = sentence;
    }

    public String addWord (Word word){
        if (sentence == null || sentence.length() == 0){
            String wordStr = word.toString();
            wordStr = wordStr.substring(0, 1).toUpperCase() + wordStr.substring(1);
            sentence += wordStr;
            return sentence;
        }
        sentence += " " + word;
        return sentence;
    }

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    @Override
    public String toString(){
        return sentence;
    }
}
