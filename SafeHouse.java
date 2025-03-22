public class SafeHouse extends  NormalLoc{
    public SafeHouse(Player player) {
        super(player , "safe house");


    }
    public boolean onLocation(){
        System.out.println("You are in the Safe House!");
        System.out.println("Your health has been restored!");
        return true;
    }

}
