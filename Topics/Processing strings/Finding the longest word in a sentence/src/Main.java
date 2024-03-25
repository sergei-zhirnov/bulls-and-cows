import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        String[] sentenceArr = sentence.split(" ");
        String result = sentenceArr[0];
        for (String s : sentenceArr) {
            if (s.length() > result.length()) {
                result = s;
            }
        }

        System.out.println(result);
    }
}