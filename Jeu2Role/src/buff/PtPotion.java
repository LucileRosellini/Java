package buff;

public class PtPotion {
    private  String name ;
    private int buffBonus;

    public PtPotion() {
        this.name = " petite potion de vie " ;
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
