class EnglishAlphabet {

    public static StringBuilder createEnglishAlphabet() {
        StringBuilder alphabet = new StringBuilder();

        final char start = 'A';
        final char fin = 'Z';

        for (char c = start; c < fin; c++) {
            alphabet.append(c).append(" ");
        }
        alphabet.append(fin);

        return alphabet;
    }
}