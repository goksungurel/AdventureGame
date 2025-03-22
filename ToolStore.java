public class ToolStore extends NormalLoc{
    public ToolStore(Player player){
        super(player,"Tool Store");

    }
    public boolean onLocation(){
        System.out.println("Welcome to Tool Store");
        System.out.println("1-Weapons");
        System.out.println("2-Armor");
        System.out.println("3-Exit");
        int selectCase=scanner.nextInt();
        while(selectCase<1 || selectCase>3){
            System.out.println("You have entered an invalid option! Please enter a valid option.");
            selectCase=scanner.nextInt();
        }
        switch(selectCase){
            case 1:
                printWeapon();
                break;
            case 2:
                printArmor();
                break;
            case 3:
                return true;
        }


        return true;
    }
    public void printWeapon(){
        System.out.println("Weapons");
    }
    public void printArmor(){
        System.out.println("Armor");
    }

}
