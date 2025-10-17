package L3T3;

public class task6 {
    public static void main(String[] args) {
        /// Palindrome: tərsinə oxunduqda da eyni olan söz.
        /// Nümunə:
        /// String word = "madam";
        /// Gözlənilən çıxış:
        /// madam palindrome-dur.
        String input = "madam";
        String lower = input.toLowerCase();
        String i = new StringBuilder(lower).reverse().toString();
        if (lower.equals(i)) {
            System.out.println("bu soz polindromdur" + "=" + i);

        } else {
            System.out.println("polindrom soz deyil"+"="+i);
        }
    }
}
