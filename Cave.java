public class Cave extends BattleLoc {
public Cave(Player player){
    super(new Zombie(),player,"Cave","food",3);
    }
}
class Forest extends BattleLoc {
    public Forest(Player player){
        super(new Vampire(),player,"Forest","firewood",3);
    }
}
class River extends BattleLoc {
    public River(Player player){
        super(new Bear(),player,"River","water",2);
    }
}
