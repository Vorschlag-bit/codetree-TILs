import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String A = sc.next();

        char[] arr = A.toCharArray();

        char a = arr[0];
        char b = arr[1];

        for(int i = 0; i<arr.length; i++){
            if(arr[i]== a){
                arr[i] = b;
                continue;
            }
            if(arr[i]== b)
            arr[i] = a;
        }

        A = String.valueOf(arr);

        System.out.println(A);
    }
}