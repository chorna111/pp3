import java.util.Random;
import java.util.Arrays;
class Judge{
    public int score(){
        Random random=new Random();
        return random.nextInt(1,6);
    }

}


class Competitor{
    private int[] scores;
    public Competitor(){
        this.scores=new int[5];
        Judge judge=new Judge();
        for(int i=0;i<5;i++){
            scores[i]=judge.score();
        }
        Arrays.sort(scores);
    }
    public double calculateResult(){
        int sum=scores[1]+scores[2]+scores[3];
        return sum/3;
    }

}
public class Competition {
    public static void main(String[] args) {
        Competitor competitor1 = new Competitor();
        Competitor competitor2 = new Competitor();
        Competitor competitor3 = new Competitor();

        System.out.println("Competitor 1 Final Result: " + competitor1.calculateResult());
        System.out.println("Competitor 2 Final Result: " + competitor2.calculateResult());
        System.out.println("Competitor 3 Final Result: " + competitor3.calculateResult());
    }
}
    
    

