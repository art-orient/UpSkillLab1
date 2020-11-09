package Сlasses.AggregationAndComposition.Task1;
/* 1. Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст,
   вывести на консоль текст, заголовок текста.*/
public class Main {
    public static void main(String[] args) {
        Sentence head = new Sentence("It is a heading of text.");
        Text text = new Text(head);
        Sentence sentence1 = new Sentence();
        Word word1 = new Word("kids");
        sentence1.addWord(word1);
        Word word2 = new Word("love");
        sentence1.addWord(word2);
        Word word3 = new Word("candy");
        sentence1.addWord(word3);
        Sentence sentence2 = new Sentence();
        Word word4 = new Word("i");
        sentence2.addWord(word4);
        Word word5 = new Word("need");
        sentence2.addWord(word5);
        Word word6 = new Word("to");
        sentence2.addWord(word6);
        Word word7 = new Word("study");
        sentence2.addWord(word7);
        Word word8 = new Word("Java");
        sentence2.addWord(word8);
        text.addSentence(sentence1);
        text.addSentence(sentence2);
        text.printHeading();
        text.printText();
    }
}
