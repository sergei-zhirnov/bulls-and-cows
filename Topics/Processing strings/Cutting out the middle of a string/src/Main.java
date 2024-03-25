import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int len = input.length();
        if (len % 2 == 0) {
            System.out.println(input.substring(0, len / 2 - 1) +
                    input.substring(len / 2 + 1));
        } else {
            System.out.println(input.substring(0, len / 2) +
                    input.substring(len / 2 + 1));
        }
    }
}