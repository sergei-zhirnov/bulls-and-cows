import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        try {
            if (input < 0) {
                throw new ArithmeticException();
            } else if (input <= 100) {
                throw new ArrayIndexOutOfBoundsException();
            } else {
                System.out.println(input);
            }
        }
        catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}