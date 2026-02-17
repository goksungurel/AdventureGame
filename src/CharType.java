public enum CharType {
    SAMURAI(1, "Samuray", 5, 21, 1500),
    ARCHER(2, "Okçu", 7, 18, 2000),
    KNIGHT(3, "Şövalye", 8, 24, 1700);

    private final int id;
    private final String name;
    private final int damage;
    private final int health;
    private final int money;

    CharType(int id, String name, int damage, int health, int money) {
        this.id = id;
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.money = money;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public int getDamage() { return damage; }
    public int getHealth() { return health; }
    public int getMoney() { return money; }
}
