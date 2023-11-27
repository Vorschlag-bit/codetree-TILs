import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] arrA = new int[100];
        int[] arrB = new int[100];
        int cnt = 0;

        for(int i = 0; i<a; i++){
            arrA[i] = sc.nextInt();
        }
        for(int i = 0; i<b; i++){
            arrB[i] = sc.nextInt();
        }

        for(int i = 0; i<a; i++){
          boolean success = true;

          for(int j = 0; j<b; j++){

            if(i+j>=a){
              success = false;
              break;
            }

            if(arrA[i+j]!=arrB[j]){
              success = false;
              break;
            }
          }

          if(success){
            System.out.print("Yes");
            System.exit(0);
          }
        }
System.out.print("No");
    }
}