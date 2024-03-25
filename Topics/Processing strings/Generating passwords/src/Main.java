import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int up = scanner.nextInt();
        int low = scanner.nextInt();
        int dig = scanner.nextInt();
        int size = scanner.nextInt();

        String strUp = "";
        String strLow = "";
        String strDig = "";

        for (int i = 0; i < up; i++) {
            char ch = getRandomChar(CharType.UPPER, strUp);
            strUp += ch;
        }

        for (int i = 0; i < low; i++) {
            char ch = getRandomChar(CharType.LOWER, strLow);
            strLow += ch;
        }

        for (int i = 0; i < dig; i++) {
            char ch = getRandomChar(CharType.DIGIT, strDig);
            strDig += ch;
        }

        String password = strUp + strLow + strDig;
        int len = password.length();
        if (password.length() < size) {
            for (int i = 0; i < size - len; i++) {
                char ch = getRandomChar(CharType.LOWER, password);
                password += ch;
            }
        }

        System.out.println(password);

    }


    static char getRandomChar(CharType type, String str) {
        Random random = new Random();
        char result = 0;

        do {
            switch (type) {
                case UPPER -> result = (char) random.nextInt(65, 91);
                case LOWER -> result = (char) random.nextInt(97, 123);
                case DIGIT -> result = (char) random.nextInt(48, 58);
                default -> {
                    break;
                }
            }
        } while (!str.isEmpty() && str.toCharArray()[str.length() - 1] == result);

        return result;
    }

    enum CharType {
        UPPER, LOWER, DIGIT
    }
}