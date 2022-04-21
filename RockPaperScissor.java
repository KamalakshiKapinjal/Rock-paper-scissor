import java.util.*;
public class RockPaperScissor {
    public static void main(String[] args){
        int n=1;
        while(n<=5){
        System.out.println("\t\t\tWelcome to Rock,Paper,Scissor!\n");
        //To get randome input by comuter
        Random randome=new Random();
        int r=randome.nextInt(4);
            //Introduction to Game
            System.out.println("1.Rock \n2.Scissor \n3.Paper \n4.Quit");
            System.out.println("Enter your choice: ");
            Scanner sc=new Scanner(System.in);
            int choice=sc.nextInt();
            if(choice==r){
                System.out.println("Match draw!"); //if user and machine choice is same
            }
            else{
            switch(choice){
                case 1:if(r==2){ //if machine chooses Scissor
                    System.out.println("You win!");
                }
                else{
                    System.out.println("You lose!"); //if machine chooses Paper
                }
                break;
                case 2:if(r==3){ //if machine chooses Paper
                    System.out.println("You win!");
                }
                else{
                    System.out.println("You lose!"); //if machine chooses Rock
                }
                break;
                case 3:if(r==1){
                    System.out.println("You win!"); //if machine chooses Rock
                }
                else{
                    System.out.println("You lose!"); //if machine chooses Scissor
                }
                break;
                case 4:System.exit(0);
                default:System.out.println("Invalid choice!!");
                }
            }
            n++;
        }
    }
}    
