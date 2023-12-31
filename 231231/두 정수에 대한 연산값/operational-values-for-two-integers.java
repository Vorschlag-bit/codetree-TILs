import java.util.*;
public class Main {
    public static void cal(int[] arr){
        int a = arr[0];
        int b = arr[1];

        if(a>b){
            a += 25;
            b *= 2;
        }
        else{
            a *= 2;
            b += 25;
        }

        arr[0] = a;
        arr[1] = b;
    
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int[] arr = {a,b};

        cal(arr);

        System.out.println(arr[0]+" "+arr[1]);
    }
}