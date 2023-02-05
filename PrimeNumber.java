import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumber {

    public static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(primeNumber());
    }

    public static List<Integer> list = new ArrayList<>();

    private static List<Integer> primeNumber() {
        System.out.println("Please enter a number");

        int a = input.nextInt();


        for (int i = 2; i <= a; i++) {

            while (a % i == 0) {
                a = a / i;
                list.add(i);

            }
        }
        return list;
    }


}