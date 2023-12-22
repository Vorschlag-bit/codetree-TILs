import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        int q = sc.nextInt();

        for(int i = 0 ; i<q; i++){
            int questionart = sc.nextInt();
            if(questionart == 1){
                int indexa = sc.nextInt();
                int indexb = sc.nextInt();
                char a = s.charAt(indexa-1);
                char b = s.charAt(indexb-1);

                char[] arr = s.toCharArray();

                arr[indexa-1] = b;
                arr[indexb-1] = a;

                s = String.valueOf(arr);

                System.out.println(s);                
            }
            else if(questionart == 2){
                char a = sc.next().charAt(0);
                char b = sc.next().charAt(0);
                
                char[] arr = s.toCharArray();

                for(int j = 0; j<arr.length; j++){
                    if(arr[j] == a)
                    arr[j] = b;
                }

                s = String.valueOf(arr);

                System.out.println(s);
            }
        }
    }
}