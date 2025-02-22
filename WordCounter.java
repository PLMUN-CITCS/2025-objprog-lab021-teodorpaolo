import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        String sentence = getSentenceInput();
        
        int wordCount = countWords(sentence);
        
        System.out.println("The sentence has " + wordCount + " words.");
    }

    public static String getSentenceInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        scanner.close();
        return sentence;
    }

    public static int countWords(String sentence) {
        if (sentence == null || sentence.trim().isEmpty()) {
            return 0;
        }
        String[] words = sentence.trim().split("\\s+");
        return words.length;
    }
}
