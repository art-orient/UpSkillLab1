package Strings.RegularExpressions;

import java.util.Arrays;
import java.util.Scanner;

// 1. Cоздать приложение, разбирающее текст (текст хранится в строке) и позволяющее
// выполнять с текстом три различных операции: отсортировать абзацы по количеству предложений;
// в каждом предложении отсортировать слова по длине; отсортировать лексемы в предложении
// по убыванию количества вхождений заданного символа, а в случае равенства – по алфавиту.
public class Task1 {
    public static String sortParagraphs(String str) {
        String[] paragraphs = str.split("\\n{2,}|\\n\\t");
        for (int i = 0; i < paragraphs.length; i++) {
        }
        String[][] sentences = new String[paragraphs.length][];
        for (int i = 0; i < paragraphs.length; i++) {
            sentences[i] = paragraphs[i].split("[.!?]\\s+");
        }
        for (int i = 0; i < paragraphs.length; i++) {
            for (int j = 1; j < paragraphs.length; j++) {
                if (sentences[j].length < sentences[i].length) {
                    String temp = paragraphs[i];
                    paragraphs[i] = paragraphs[j];
                    paragraphs[j] = temp;
                }
            }
        }
        StringBuilder textSort = new StringBuilder();
        for (int i = 0; i < paragraphs.length; i++) {
            textSort.append(paragraphs[i]).append("\n\n");
        }
        return textSort.toString();
    }

    public static String sortWordLength(String str) {
        String[] sentences = str.split("[.!?]\\s+");
        String[][] words = new String[sentences.length][];
        for (int i = 0; i < sentences.length; i++) {
            words[i] = sentences[i].replaceAll("\\p{Punct}", "").split("[\\s.]+");
        }
        for (int i = 0; i < sentences.length; i++) {
            for (int j = 0; j < words[i].length; j++) {
                for (int k = j+1; k < words[i].length; k++) {
                    if (words[i][k].length() < words[i][j].length()) {
                        String temp = words[i][j];
                        words[i][j] = words[i][k];
                        words[i][k] = temp;
                    }
                }
            }
        }
        return writeString(words);
    }


    public static String sortSumChar (String str) {
        String[] sentences = str.split("[.!?]\\s+");
        String[][] words = new String[sentences.length][];
        for (int i = 0; i < sentences.length; i++) {
            words[i] = sentences[i].replaceAll("\\p{Punct}", "").split("[\\s.]+");
        }
        System.out.print("Input your symbol for check: ");
        Scanner scanner = new Scanner(System.in);
        String symbol = scanner.next();
        System.out.println("Sorting words in a sentence in descending order of the number of occurrences of a given character,\n" +
                "and in case of equality - alphabetically:\n");

        for (int i = 0; i < words.length; i++) {
            sortAlphabet(words[i]);
            int[] repeat = new int[words[i].length];
            for (int j = 0; j < words[i].length; j++) {
                repeat[j] = words[i][j].length() - words[i][j].replaceAll(symbol, "").length();
            }
            for (int j = 0; j < words[i].length; j++) {
                for (int k = j+1; k < words[i].length; k++) {
                    if (repeat[k] > repeat[j]) {
                        int tempSum = repeat[k];
                        repeat[k] = repeat[j];
                        repeat[j] = tempSum;
                        String tempWord = words[i][j];
                        words[i][j] = words[i][k];
                        words[i][k] = tempWord;
                    }
                }
            }
        }
        return writeString(words);
    }

    private static String[] sortAlphabet (String[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                 if (array[j].toLowerCase().compareTo(array[i].toLowerCase()) < 0) {
                 String temp = array[i];
                 array[i] = array[j];
                 array[j] = temp;
                 }
            }
        }
        return array;
    }

    private static String writeString (String[][] words) {
        StringBuilder wordsSort = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length; j++) {
                wordsSort.append(words[i][j]).append(" ");
            }
            wordsSort.append("\n");
        }
        return wordsSort.toString();
    }
}
