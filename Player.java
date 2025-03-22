import java.util.Scanner;

public class Player {
    private Inventory inventory;
    private String name;
    private double money;
    private String charName;
    private double damage;
    private int health;
    private Scanner scanner=new Scanner(System.in);


   public Player(String name){
       this.name = name;
   }
   public String getCharName() {
       return charName;
   }
   public void setCharName(String charName) {
       this.charName = charName;
   }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public double getMoney(){
        return money;
    }
    public void setMoney(double money){
        this.money=money;
    }
    public double getDamage(){
        return damage;
    }
    public void setDamage(double damage){
        this.damage=damage;
    }
    public int getHealth(){
        return health;
    }
    public void setHealth(int health){
        this.health=health;
    }

    public void selectChar(){
       GameChar[] charList={new Samurai(),new Archer(),new Knight()};
       System.out.println("----------------------------------------");
       for (GameChar gameChar : charList){
           System.out.println("ID: "+gameChar.getId() +"Character : "+ gameChar.getName() + " Damage: "+ gameChar.getDamage()+ " Health : "+ gameChar.getHealth() +" Money : "+gameChar.getMoney());

       }
       System.out.println("----------------------------------------");
       System.out.println("please choose a character");
       int selectChar=scanner.nextInt();
       switch (selectChar){
           case 1:
               initPlayer(new Samurai());
               break;
           case 2:
               initPlayer(new Archer());
               break;
           case 3:
               initPlayer(new Knight());
               break;
           default:
               initPlayer(new Samurai());

       }
       System.out.println("Character :"+this.getCharName()+
               "Damage: "+this.getDamage()+
               " Health: "+this.getHealth()+
               " Money: "+this.getMoney());



    }

    public void initPlayer(GameChar gameChar){
       this.setDamage(gameChar.getDamage());
       this.setHealth(gameChar.getHealth());
       this.setMoney(gameChar.getMoney());
       this.setCharName(gameChar.getName());


    }

}
