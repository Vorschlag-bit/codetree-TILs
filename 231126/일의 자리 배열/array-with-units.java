import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] arr = new int[10];
        arr[0]=a;
        arr[1]=b;
        System.out.print(arr[0]+" "+arr[1]+" ");
        for(int i =2; i<10; i++){
            arr[i]=arr[i-2]+arr[i-1];
            System.out.print(arr[i]%10+" ");
        }
    }
}