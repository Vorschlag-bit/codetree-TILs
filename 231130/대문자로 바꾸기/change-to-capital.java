import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        char [][] arr = new char[5][3];
        
        for(int i = 0; i<5; i++){
            for(int j = 0; j<3; j++){
                arr[i][j] = sc.next().charAt(0);
                System.out.print(Character.toUpperCase(arr[i][j])+" ");
            }
            System.out.println();
        }
    }
}