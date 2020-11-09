package Сlasses.AggregationAndComposition.Task1;

public class Text {
    private Sentence heading;
    private StringBuilder text;

    public Text(Sentence heading) {
        this.heading = heading;
        this.text = new StringBuilder();
    }

    public Text(Sentence heading, StringBuilder text) {
        this.heading = heading;
        this.text = text;
    }

    public void printHeading(){
        System.out.println(heading.toString().toUpperCase() + "\n");
    }

    public void printText(){
        System.out.println(text);
    }

    public void addSentence(Sentence sentence){
        text.append(sentence).append(". ");
    }

    public Sentence getHeading() {
        return heading;
    }

    public void setHeading(Sentence heading) {
        this.heading = heading;
    }

    public StringBuilder getText() {
        return text;
    }

    public void setText(StringBuilder text) {
        this.text = text;
    }
}
