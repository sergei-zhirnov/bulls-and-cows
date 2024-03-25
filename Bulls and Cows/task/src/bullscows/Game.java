package bullscows;

import java.util.Random;

public class Game {
    public int bulls = 0;
    public int cows = 0;
    public String code;
    public StringBuilder digits = new StringBuilder("0123456789");
    public StringBuilder letters = new StringBuilder("abcdefghijklmnopqrstuvwxyz");



    public void grade(String attempt) {
        char[] attemptArr = attempt.toCharArray();
        char[] codeArr = this.code.toCharArray();
        this.bulls = 0;
        this.cows = 0;

        for (int i = 0; i < this.code.length(); i++) {
            if (attemptArr[i] == codeArr[i]) {
                this.bulls += 1;
            } else if (this.code.indexOf(attemptArr[i]) > -1) {
                this.cows += 1;
            }
        }

    }

    public String printGrade() {
        String result = "Grade: ";

        if (this.bulls > 0 && this.cows > 0) {
            result += String.format("%d bull(s) and %d cow(s). ", this.bulls, this.cows);
        } else if (this.bulls > 0) {
            result += String.format("%d bull(s). ", this.bulls);
        } else if (this.cows > 0) {
            result += String.format("%d cow(s). ", this.cows);
        } else {
            result += "None. ";
        }

        //result += String.format("The secret code is %s.", this.code);
        return result;
    }

    public String generateCode(int length, int range) {
        StringBuilder symbols = new StringBuilder();
        if (range < 10) {
            this.digits.delete(range, this.digits.length());
            symbols.append(this.digits);
        } else if (range == 10) {
            symbols.append(this.digits);
        } else {
            this.letters.delete(range - 10, this.letters.length());
            symbols.append(this.digits).append(this.letters);
        }


        StringBuilder code = new StringBuilder();
        Random random = new Random();
        char[] chArr = symbols.toString().toCharArray();
        System.out.println(symbols);

        while (code.length() < length) {
            int r = random.nextInt(symbols.length());
            String s = String.valueOf(chArr[r]);
            if (code.isEmpty() && s.equals("0")) {
                break;
            } else if (code.length() < length && code.indexOf(s) == -1) {
                code.append(s);
            }
        }
        return code.toString();
    }

    public String maskCode(String code, int range) {
        String stars = "*".repeat(code.length());
        String sRange;
        if (range <= 10) {
            sRange = String.format("(0-%d)", range - 1);
        } else {
            String lastLetter = String.valueOf(this.letters.substring(letters.length() - 1));
            sRange = String.format("(0-9, a-%s)", lastLetter);
        }

        return stars + " " + sRange + ".";

    }

}
