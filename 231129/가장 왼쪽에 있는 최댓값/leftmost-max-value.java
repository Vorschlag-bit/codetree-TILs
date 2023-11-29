import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc= new Scanner(System.in);

        int n = sc.nextInt();
        int[] idx = new int[1000]; //arr배열의 index를 담아두는 배열
        int[] arr = new int[1000]; 
        int cnt = 0; //index 배열의 크기 측정

        for(int i = 0; i<n; i++)
            arr[i] = sc.nextInt();

            idx[cnt++] = 0; //arr의 첫 번째 원소는 마지막에 출력되므로
        
        for(int i = 0; i<n; i++){
               int lastidx = idx[cnt-1]; //비교를 하기 위한 가장 최근 idx값 지정
               if(arr[i]>arr[lastidx])
               idx[cnt++] = i; //마지막 idx보다 크다면 그때의 i값을 idx에 저장
            }

            for(int i = cnt - 1; i>=0; i--){
                int index = idx[i]; //내림차순으로 정렬
                System.out.print((index+1)+" ");//idx 마지막이 1이 되야하므로
            }
    }
}