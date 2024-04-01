import java.util.*;
import java.io.*;
class Product {
    int P;
    int S;

    public Product(int P, int S) {
        this.P = P;
        this.S = S;
    }
}

public class Main {
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        Product[] arr = new Product[n];

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i] = new Product(Integer.parseInt(st.nextToken()),
             Integer.parseInt(st.nextToken()));
        }
        //상품가격 + 배송비 오름차순으로 정렬.
        Arrays.sort(arr, comp);

        int ans = 0;
        //첫번째 상품부터 반값한다고 가정, 최대 명수 구하기.
        for(int i = 0; i < n; i++) {
            int budget = b - (arr[i].P/2 + arr[i].S);
            if(budget < 0) continue;
            int cnt = 1;
            for(int j = 0; j < n; j++) {
                if(i == j) continue;

                if(budget - (arr[j].S + arr[j].P) < 0)
                continue;

                budget -= (arr[j].S + arr[j].P);
                cnt++;
            }
            ans = Math.max(ans, cnt);
        }
        System.out.println(ans);
    }
    static Comparator<Product> comp = new Comparator<Product>() {

    @Override
    public int compare(Product o1, Product o2) {
        int CostPer1 = o1.P + o1.S;
        int CostPer2 = o2.P + o2.S;

        return CostPer1 - CostPer2;
    }
};
}