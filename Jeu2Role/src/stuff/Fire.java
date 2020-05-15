package stuff;

public class Fire {
    private  String name ;
    private int stuffBonus;

    public Fire() {
        this.name = " feu " ;
        this.stuffBonus = 7 ;
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
