import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int num = scanner.nextInt();

        if (num > str.length()) {
            System.out.println(str);
            return;
        }

        String toMove = str.substring(0, num);
        String toStay = str.substring(num);

        System.out.println(toStay + toMove);


    }
}