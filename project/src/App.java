import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello! Welcome to guess!");
        System.out.println("You are given $20 and you are to do with it what you will.\nbut don't lose it all.");

        try (Scanner scanner = new Scanner(System.in)) {
            // Variables
            int randomNumber = getRandomNumber();
            float money = 20;
            boolean isPlaying = true;
            
            //Game
            while (isPlaying == true){
                if (money <= 0) {
                    System.out.println("You lost all your money! \nGo get some more so I can have it. hahaha");
                    break;
                }

                System.out.println("Enter your guess: ");
                int num = scanner.nextInt();
                System.out.println("Enter your bet: ");
                float bet = scanner.nextFloat();

                if (num != randomNumber){
                    if (num > randomNumber){
                        System.out.println("Too high!");
                        money = money - bet;
                        System.out.println(money);
                    }
                    else{
                
                        System.out.println("Too low!");
                        money = money - bet;
                        System.out.println(money);
                    }
                    
                }

                else{
                    money = money + bet;
                    System.out.println(money);
                    System.out.println("Continue?");
                    String go = scanner.next();
                    if (go.equals("n")){
                        isPlaying = false;
                    }

                }

            }
        }
        }
        
    
    

    public static int getRandomNumber(){
        Random d1 = new Random();
        int number = 1 + d1.nextInt(100);
        return number;
    }

}
