package L3T3;

public class task2 {
    /// task 2
    /// int[][] matrix = {
    ///     {1, 2, 3},
    ///     {4, 5, 6},
    ///     {7, 8, 9}
    /// Gözlənilən çıxış:
    /// Əsas diaqonal cəmi: 15
    /// Köməkçi diaqonal cəmi: 15
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int a=0;
        int b=0;
        for (int i=0;i< matrix.length;i++){
            a+=matrix[i][i];
            b+=matrix[i][matrix.length-1-i];
        }
        System.out.println(a);
        System.out.println(b);
    }
}
