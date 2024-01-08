import java.util.*;
class Agent {
    String name;
    int score;
    public Agent(String name, int score){
        this.name = name;
        this.score = score;
    }
}
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        Agent[] agents = new Agent[5];
        int Min = 100;
        int index = 0;

        for(int i = 0; i < 5; i++){
            String s = sc.next();
            int n = sc.nextInt();
            if(n<Min){
                Min = n;
                index = i;
            }
            agents[i] = new Agent(s, n);
        }
        Agent agentmin = agents[index];
        System.out.println(agentmin.name+" "+agentmin.score);
    }
}