import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            for (int j = 0; j < 2; j++) {
                output += input.toCharArray()[i];
            }
        }

        System.out.println(output);
    }
}