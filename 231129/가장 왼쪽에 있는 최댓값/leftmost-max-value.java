import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc= new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[1000]; 

        for(int i = 0; i<n; i++)
            arr[i] = sc.nextInt();
        
        int preMaxidx = n; //가장 처음 탐색할 때는 최대크기까지 훑기

        while(true){

            int maxidx = 0; //시작은 항상 왼쪽(= 첫 번째)부터

            for(int i = 0; i<preMaxidx; i++)
                if(arr[i]>arr[maxidx])
                maxidx = i;
            System.out.print((maxidx+1)+" ");

            if(maxidx == 0)
            break;

            preMaxidx = maxidx;
            
        }
    }
}