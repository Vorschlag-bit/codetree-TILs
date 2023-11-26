import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        int[] temp = new int[3];
        char[] sym = new char[3];

        for(int i = 0; i<3; i++){
            sym[i] = sc.next().charAt(0);
            temp[i] = sc.nextInt();
            if(sym[i]=='Y'&&temp[i]>=37)
            arr[1]++;
            else if(sym[i]=='N'&&temp[i]>=37)
            arr[2]++;
            else if(sym[i]=='Y'&&temp[i]<37)
            arr[3]++;
            else arr[4]++;
        }
        for(int i = 1; i<=4; i++){
            System.out.print(arr[i]+" ");
        }
        if(arr[1]>=2)
        System.out.print('E');
    }
}