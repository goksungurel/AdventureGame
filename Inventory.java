public class Inventory {
    private Weapon weapon;
    private boolean food;
    private boolean water;
    private boolean firewood;
    private String armorName;
    private int weaponDamage;
    private int armorDefence;

    public Inventory() {
        this.weapon=new Weapon("Yumruk ",2,56,40);
        this.food = false;
        this.water = false;
        this.firewood = false;
        this.armorName = "Yok";
        this.weaponDamage = weapon.getDamage();
        this.armorDefence = 0;
    }


    public Inventory(boolean food,boolean water,boolean firewood,String weaponName,String armorName,int weaponDamage,int armorDefence) {
        this.food = food;
        this.water = water;
        this.firewood = firewood;
        this.armorName=armorName;
        this.weaponDamage=weaponDamage;
        this.armorDefence=armorDefence;
    }
    public Weapon getWeapon(){
        return weapon;
    }
    public void setWeapon(Weapon weapon){
        this.weapon=weapon;
        this.weaponDamage=weapon.getDamage();
    }
    
    public boolean isFood(){
        return food;
    }
    public void setFood(boolean food){
        this.food=food;
    }
    public boolean isWater(){
        return water;
    }
    public void setWater(boolean water){
        this.water=water;
    }
    public boolean isFirewood(){
        return firewood;
    }
    public void setFirewoord(boolean firewood){
        this.firewood=firewood;
    }
    public String getWeaponName(){
        return weaponName;
    }
    public String getArmorName(){
        return armorName;
    }
    public void setArmorName(String armorName){
        this.armorName=armorName;
    }
    public int getWeaponDamage() {
        return weaponDamage;
    }

    public void setWeaponDamage(int weaponDamage) {
        this.weaponDamage = weaponDamage;
    }

    public int getArmorDefence() {
        return armorDefence;
    }

    public void setArmorDefence(int armorDefence) {
        this.armorDefence = armorDefence;
    }



}
