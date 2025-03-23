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
                buyWeapon();
                break;
            case 2:
                printArmor();
                buyWeapon();
                break;
            case 3:
                return false;
        }


        return true;
    }
       public void printWeapon(){
        System.out.println("Weapons");
        System.out.println();
        for(Weapon w: Weapon.weapons()){
            System.out.println("ID: " + w.getId() +
                    " | Name: " + w.getName() +
                    " | Damage: " + w.getDamage() +
                    " | Price: " + w.getPrice());

        }

    }
    public void buyWeapon(){
        System.out.println("Please choose a weapon by entering its ID");
        int selectWeaponID=scanner.nextInt();
        while(selectWeaponID <1 || selectWeaponID >Weapon.weapons().length){
            System.out.println("You have entered an invalid option! Please enter a valid option.");
            selectWeaponID =scanner.nextInt();
        }

        Weapon selectedWeapon =Weapon.getWeaponObjByID(selectWeaponID);
        if(selectedWeapon !=null) {
            if (selectedWeapon.getPrice() > this.getPlayer().getMoney()) {
                System.out.println("You have not a enough money! ");
            } else {
                //Purchase logic
                System.out.println(selectedWeapon.getName() + "You have purchased the  weapon");
                double balance = this.getPlayer().getMoney() - selectedWeapon.getPrice();
                this.getPlayer().setMoney(balance);
                System.out.println("Your remaining money is: " + this.getPlayer().getMoney());
                System.out.println("Previous weapon is: "+this.getPlayer().getInventory().getWeapon().getName());
                this.getPlayer().getInventory().setWeapon(selectedWeapon);
                System.out.println("New weapon is: "+this.getPlayer().getInventory().getWeapon().getName());

            }
        }
    }
    public void printArmor(){
        System.out.println("Armor");
    }

}
