import java.util.Arrays;
public class App {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int sum = Arrays.stream(arr)
                        .flatMapToInt(Arrays::stream)
                        .sum();
        System.out.println("Sum of elements in 2D array: " + sum);
    }
}