package stuff;

public abstract class BonusStuff {
    private  String name ;
    private int stuffBonus;

    public BonusStuff(String nomStuff, int BonusAttak ) {
        this.name = nomStuff ;
        this.stuffBonus = BonusAttak ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStuffBonus() {
        return stuffBonus;
    }

    public void setStuffBonus(int stuffBonus) {
        this.stuffBonus = stuffBonus;
    }

}
