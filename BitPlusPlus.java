 import java.util.Scanner;
public class BitPlusPlus{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int x = 0;
        for(int i = 0; i < n; i++){
            String operation = input.next();
            if(operation.contains("++")){
                x++;
            }
            else{
                x--;
            }
        }
        System.out.println(x);
        input.close();
    }
} 
    

