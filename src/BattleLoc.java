import java.util.Random;

public abstract class BattleLoc extends Location {
    private Obstacle obstacle;
    private String award;
    private int maxObstacle;


    public BattleLoc(Obstacle obstacle,Player player,String name,String award,int maxObstacle) {
        super(player,name);
        this.setObstacle(obstacle); //içerdeki obstacle this yani-dışardaki obstacle a eşitliyoruz
        this.setAward(award);
        this.maxObstacle = maxObstacle;
    }

    public boolean onLocation(){
        int obsNumber=this.randomObstacleNumber();
        System.out.println("You are here right know: "+this.getName());
        System.out.println("be careful! There are "+obsNumber +" "+this.getObstacle().getName()+" living here");
        System.out.println("Choose: <F>ight or <R>un");

        String selectCase=scanner.nextLine();
        selectCase=selectCase.toUpperCase();

        if("F".equals(selectCase)){
            System.out.println("İts gonna be fight!");
            combat(obsNumber);
        }
        else if("R".equals(selectCase)){
            System.out.println("You decided to run away");
            return true;
        }
        return true;
    }
    public boolean combat(int obsNumber){
        //Get the enemy (obstacle)
        Obstacle obstacle=this.getObstacle();
        if(obstacle==null){
            return false;
        }


        int enemyHealth=obstacle.getHealth();
        System.out.println("The fight begins!");

        //Loop continues until either the player or the enemy's health reaches zero
        while(enemyHealth>0 && this.getPlayer().getHealth()>0){
            //Player attacks
            double playerDamage=this.getPlayer().getDamage() - obstacle.getDamage();

            if(playerDamage>0){
                enemyHealth -=playerDamage;
                System.out.println("You dealt " + playerDamage + " damage to the " + obstacle.getName());
            } else {
                System.out.println("Your attack had no effect on the " + obstacle.getName() + ".");
            }
            printPlayerStats();

            if(enemyHealth <=0){
                System.out.println("You have defeated the " + obstacle.getName() +"!");
                this.getPlayer().setMoney(this.getPlayer().getMoney()+50);
                break;

            }
            int enemyDamage=obstacle.getDamage()-this.getPlayer().getInventory().getArmor().getBlock();
            if(enemyDamage>0){
                this.getPlayer().setHealth(this.getPlayer().getHealth()-enemyDamage);
                System.out.println("The "+obstacle.getName()+" dealt "+enemyDamage+"damage to you.");
            }else{
                System.out.println("The " + obstacle.getName() + "'s attack was blocked!");
            }
            printPlayerStats();
            if(this.getPlayer().getHealth()<=0){
                System.out.println("You have defeated by  the " + obstacle.getName() +"!");
                break;
            }
        }
        return true;
    }
    public void printPlayerStats() {
        System.out.println("\nPlayer Stats:");
        System.out.println("Name: " + this.getPlayer().getName());
        System.out.println("Health: " + this.getPlayer().getHealth());
        System.out.println("Damage: " + this.getPlayer().getDamage());
        System.out.println("Money: " + this.getPlayer().getMoney());

        // Weapon Info
        System.out.println("Weapon: " + this.getPlayer().getInventory().getWeapon().getName());
        System.out.println("Weapon Damage: " + this.getPlayer().getInventory().getWeapon().getDamage());

        // Armor Info
        System.out.println("Armor: " + this.getPlayer().getInventory().getArmor().getName());
        System.out.println("Armor Block: " + this.getPlayer().getInventory().getArmor().getBlock());
    }

    public int randomObstacleNumber(){
        Random rand = new Random();
        return rand.nextInt(this.getMaxObstacle())+1;

    }
    public int getMaxObstacle() {
        return maxObstacle;
    }
    public void setMaxObstacle(int maxObstacle) {
        this.maxObstacle = maxObstacle;
    }

    public Obstacle getObstacle() {
        return obstacle;
    }

    public void setObstacle(Obstacle obstacle) {
        this.obstacle = obstacle;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }
}
