import java.util.*;

public class Main {
    public static boolean check(int[] a, int[] b) {
        
        for (int i = 0; i <= a.length-b.length; i++) {
            boolean check2 = true;
            for (int j = 0; j < b.length; j++) {
                if (a[i + j] != b[j]) {
                    check2 = false;
                    break;
                }
            }
            if (check2)
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];

        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        if (check(arr1, arr2))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}