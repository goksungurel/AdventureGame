public class Inventory {
    private boolean food;
    private boolean water;
    private boolean firewood;
    private String weaponName;
    private String armorName;
    private int weaponDamage;
    private int armorDefence;

    public Inventory() {
        this.food = false;
        this.water = false;
        this.firewood = false;
        this.weaponName = "Yok";
        this.armorName = "Yok";
        this.weaponDamage = 0;
        this.armorDefence = 0;
    }


    public Inventory(boolean food,boolean water,boolean firewood,String weaponName,String armorName,int weaponDamage,int armorDefence) {
        this.food = food;
        this.water = water;
        this.firewood = firewood;
        this.weaponName=weaponName;
        this.armorName=armorName;
        this.weaponDamage=weaponDamage;
        this.armorDefence=armorDefence;
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



}
