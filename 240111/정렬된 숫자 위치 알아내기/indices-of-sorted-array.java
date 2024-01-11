import java.util.*;
import java.io.*;
import java.util.Arrays;

class Number {
    int Number;
    int Order;

    public Number(int Number, int Order) {
        this.Number = Number;
        this.Order = Order;

    }
}
public class Main {
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Number[] numbers = new Number[n];

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            int Number = sc.nextInt();

            numbers[i] = new Number(Number, i);
        }

        Arrays.sort(numbers, new Comparator<Number>() {
            @Override
            public int compare(Number a, Number b) {
                if(a.Number == b.Number)
                return a.Order - b.Order;

                return a.Number - b.Number;
            }
        });

        for(int i = 0; i < n; i++) {
            arr[numbers[i].Order] = i + 1;
        }

        for(int i = 0; i < n; i++)
        System.out.print(arr[i] + " ");
    }
}