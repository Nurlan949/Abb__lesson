package L3T3;

public class task5 {
    public static void main(String[] args) {
        /// Yeni yaradılmış string-i çap et.
        ///
        /// Nümunə:
        ///
        /// String input = "OpenAI";
        ///
        /// Gözlənilən çıxış:
        ///
        /// İvers edilmiş string: IanepO

        String input = "OpenAI";
        String i=" ";
        for (int a=input.length()-1;a>=0;a--){
            i+=input.charAt(a);
        }
        System.out.println(i);
    }
}
