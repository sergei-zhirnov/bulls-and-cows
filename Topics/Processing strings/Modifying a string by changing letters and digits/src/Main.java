import java.util.Scanner;

public class Main {
    public static String transformString(String s) {
        char[] inputArr = s.toCharArray();
        String result = "";
        char ch = 0;
        for (char inputChar : inputArr) {
            if (inputChar >= 'a' && inputChar < 'z') {
                ch = ++inputChar;
            } else if (inputChar == 'z') {
                ch = 'a';
            } else if (inputChar > '0' && inputChar <= '9') {
                ch = --inputChar;
            } else if (inputChar == '0') {
                ch = '9';
            }
            result += ch;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        System.out.println(transformString(s));
    }
}