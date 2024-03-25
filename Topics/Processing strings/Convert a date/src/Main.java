import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] terms = input.split("-");
        System.out.printf("%s/%s/%s", terms[1], terms[2], terms[0]);
    }
}