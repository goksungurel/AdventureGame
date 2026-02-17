public  abstract class GameChar {
    private int id;
    private String name;
    private int damage;
    private int health;
    private int money;

    public GameChar(CharType charType) {
        this.id = charType.getId();
        this.name = charType.getName();
        this.damage = charType.getDamage();
        this.health = charType.getHealth();
        this.money = charType.getMoney();
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getDamage() {
        return damage;
    }
    public int getHealth() {
        return health;

    }
    public int getMoney() {
        return money;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }
    public void setHealth(int health) {
        this.health = health;

    }
    public void setMoney(int money) {
        this.money = money;
    }


}
