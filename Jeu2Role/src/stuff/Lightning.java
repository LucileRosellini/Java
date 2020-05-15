package stuff;

public class Lightning {
    private  String name ;
    private int stuffBonus;

    public Lightning() {
        this.name = " eclair " ;
        this.stuffBonus = 2 ;
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
