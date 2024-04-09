import java.util.Arrays;
import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] hills = new int[n]; // 언덕의 높이 배열

        for(int i = 0; i < n; i++)
        hills[i] = Integer.parseInt(br.readLine());

        int minCost = findMinCost(hills);
        System.out.println(minCost);
    }

    public static int findMinCost(int[] hills) {
        Arrays.sort(hills); // 언덕의 높이를 오름차순으로 정렬

        int n = hills.length;
        int minHeight = hills[0]; // 가장 낮은 언덕의 높이
        int maxHeight = hills[n - 1]; // 가장 높은 언덕의 높이

        int minCost = Integer.MAX_VALUE;

        // 가장 높은 언덕과 가장 낮은 언덕의 높이 차이를 17 이하로 만들기 위한 모든 경우를 탐색
        for (int i = minHeight; i <= maxHeight - 17; i++) {
            int currentMaxHeight = i + 17; // 현재 높이로부터 17만큼 높은 언덕의 높이
            int cost = 0;

            // 각 언덕의 높이를 현재 높이로 조절하거나 높이 차이가 17 이하로 만들기 위해 조절한 비용 계산
            for (int j = 0; j < n; j++) {
                if (hills[j] > currentMaxHeight) {
                    int heightDiff = Math.abs(hills[j] - currentMaxHeight);
                    cost += heightDiff * heightDiff;
                }
                if(hills[j] < i) {
                    int diff = i - hills[j];
                    cost += diff * diff;
                }
            }

            minCost = Math.min(minCost, cost);
        }

        return minCost;
    }
}