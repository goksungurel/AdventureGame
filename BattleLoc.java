public abstract class BattleLoc extends Location {
    private Obstacle obstacle;
    private String award; // nehir bitince ödül



    public BattleLoc(Obstacle obstacle,Player player,String name,String award) {
        super(player,name);
        this.setObstacle(obstacle); //içerdeki obstacle this yani-dışardaki obstacle a eşitliyoruz
        this.setAward(award);
    }
    public boolean onLocation(){
        System.out.println("You are here right know: "+this.getName());
        System.out.println("be careful! "+this.getObstacle().getName()+"living here");
        return true;
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
