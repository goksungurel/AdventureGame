import java.util.Scanner;

public class Game {
    private Scanner scanner = new Scanner(System.in);
    public void start(){

        System.out.println("Welcome to the game");
        System.out.println("Please enter your name");
        String playerName = scanner.nextLine();
        Player player=new Player(playerName);
        System.out.println(player.getName() +" Welcome to this dark and foggy island!");
        System.out.println("Everything that happened here is real.");
        System.out.println("Please choose a character to play a game");
        player.selectChar();
        Location location=null;

        while(true){
            player.printInfo();
            System.out.println("Locations");
            System.out.println("1-Safe House");
            System.out.println("2-Tool Store ");
            System.out.println("3-Cave");
            System.out.println("4-Forest");
            System.out.println("5-River");
            System.out.println("0-Exit game");
            
            System.out.println("Where do you want to go? Choose:  ");
            int selectLoc=scanner.nextInt();

            switch (selectLoc) {
                case 1:
                    location=new SafeHouse(player);
                    break;
                case 2:

                    location=new ToolStore(player);
                    break;
                    
                 case 3:
                    location=new Cave(player);
                    break;

                case 4:
                     location=new Forest(player);
                     break;

                case 5:
                      location=new River(player);
                      break;
                default:
                    location =new SafeHouse(player);



            }
            if(!location.onLocation()){
                System.out.println("Game over");
                break;
            }

        }


    }
}
