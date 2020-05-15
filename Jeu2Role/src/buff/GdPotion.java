package buff;

public class GdPotion {
    private  String name ;
    private int buffBonus;

    public GdPotion() {
        this.name = " grande potion de vie " ;
        this.buffBonus = 5 ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBuffBonus() {
        return buffBonus;
    }

    public void setBuffBonus(int buffBonus) {
        this.buffBonus = buffBonus;
    }
}
