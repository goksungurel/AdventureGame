import java.util.Random;

public abstract class BattleLoc extends Location {
    private Obstacle obstacle;
    private String award;
    private int maxObstacle;


    public BattleLoc(Obstacle obstacle,Player player,String name,String award,int maxObstacle) {
        super(player,name);
        this.setObstacle(obstacle); 
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
        }
        return true;
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
