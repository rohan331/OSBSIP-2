
import java.util.Scanner;
import java.util.Random;

public class numberguessinggame{

    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        String play="yes";
        int round=0, totalplay=0,totaltries=0,totalscores=0;
        System.out.println();
        System.out.println("a number between 1 to 100. Guess the number within 5 tries.");
        
        while(play.equals( "yes"))
        {

           ++round;
           int  guess,i,k=5, tries=0,score=5;
           Random rand= new Random();
           int number=rand.nextInt( 100);
    
            for(i=0;i<k;i++){
            System.out.println();
            System.out.println("guess the number");
            guess=sc.nextInt();

            
                 if(number==guess){
                tries++;
                System.out.println("congratulations you guess right");
                System.out.println();
                totaltries += tries;
                totalscores += score;
                System.out.println();
                System.out.println("would you like to play again");
                play =sc.next().toLowerCase();
                break;

               }
               else if (number>guess && i!=k-1){
                System.out.println("the number is greater then guess");
                tries ++;
                score --;
               }
           }
    
            if(i==k){
                System.out.println( "you have exhausted 5 tries");
                System.out.println("the number was"+ number);
                totalscores +=score;
                System.out.println();
                System.out.println( "--------------------------");
                System.out.println( "|   TRIES     |  SCORES   ");
                System.out.println("|    "+tries+ "       |"   +score+ "     | ");
                System.out.println("-----------------------------");
                System.out.println();
                System.out.println("would you like to play again? yes or no: ");
                play =sc.next().toLowerCase();
             }



         }

         System.out.println("  | " +round+   "     |    "  +totaltries+   "   |    " +totalscores+ "  |");
         

}
}