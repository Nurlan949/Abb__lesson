package L3T3;

public class task7 {
    public static void main(String[] args) {
        /// Nümunə:
        /// String sentence = "Java is awesome";
        /// Gözlənilən çıxış (sadəcə nümunə):
        /// a - 3
        /// e - 2
        /// i - 1
        /// j - 1
        //
        String sentence = "Java is awesome";
        while (!sentence.isEmpty()) {
            char a = sentence.charAt(0);
            if (Character.isLetter(a)) {
                int count = 0;
                for (int i = 0; i < sentence.length(); i++) {
                    if (sentence.charAt(i) == a) {
                        count++;
                    }
                }
                System.out.println(a + "-" + count);
            }
            sentence = sentence.replaceAll(String.valueOf(a), "");

        }
    }
}
