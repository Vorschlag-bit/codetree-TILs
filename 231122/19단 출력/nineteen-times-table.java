public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        for(long i =1; i<=19;i++){
            for(long j =1; j<=19;j++){
                if(j%2==0||j==19){
                    System.out.print(i+" * "+j+" = "+i*j);
                    System.out.println();
                }
                else
                System.out.print(i+" * "+j+" = "+i*j+" / ");
            }
        }
    }
}