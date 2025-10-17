package L3T3;

public class task1 {
    /// task 1
    /// int[] numbers = {4, 7, -2, 15, 0, 99, -100};
    /// Gözlənilən çıxış:
    /// Ən böyük ədəd: 99
    /// Ən kiçik ədəd: -100
    public static void main(String[] args) {
        int[] numbers = {4, 7, -2, 15, 0, 99, -100};
        int max = numbers[0];
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < max) {
                min = numbers[i];
            }
        }
        System.out.println("en boyuk eded" + "=" + max);
        System.out.println("en kicik eded" + "=" + min);
    }

}
