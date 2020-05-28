package buff;

public abstract class BonusDef {
    private  String name ;
    private int buffBonus;

    public BonusDef(String nomItem,int pvSauvegarde) {
        this.name = nomItem ;
        this.buffBonus = pvSauvegarde ;
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

