import java.util.Arrays;

public class Minmax {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};

    int min = Arrays.stream(arr).min().getAsInt();
    int max = Arrays.stream(arr).max().getAsInt();
    double avg = Arrays.stream(arr).average().getAsDouble();

    System.out.println();
    System.out.println(min);
    System.out.println();
    System.out.println(max) ;
   
    System.out.println(avg);
  }
}