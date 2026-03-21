import java.util.*;
public class NextRound{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        int[] scores = new int[n];
        
        for(int i = 0; i < n; i++){
            scores[i] = input.nextInt();
        }
        
        int kthscore = scores[k-1];
        int count = 0;
        
        for(int i = 0;  i < n; i++){
            if(scores[i] >=  kthscore && scores[i] > 0){
                count++;
            }
        }
        
        System.out.println(count);
    }
}