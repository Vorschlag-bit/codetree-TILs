public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        int[][] arr = new int[5][5];

        for(int i = 0; i<5; i++){
            arr[i][0] = 1;
        }
        for(int j = 0; j<5; j++){
            arr[0][j] = 1;
        }

        for(int row = 0; row<4; row++){
            for(int col = 0; col<4; col++){
                arr[row+1][col+1] = arr[row+1][col]+arr[row][col+1];
            }
        }

        for(int row = 0; row<5; row++){
            for(int col = 0; col<5; col++){
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }
    }
}