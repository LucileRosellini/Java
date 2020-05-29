package buff;

import Perso.Personnage;
import ProjetWarrior.IEvent;

public abstract class BonusDef implements IEvent {
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

    @Override
    public void interaction(Personnage player) {

        //si cet obet là
      // if( this instanceof GrandBouclier)
        //if( this instanceof GrandBouclier)
        //if( this instanceof GrandBouclier)
        //if( this instanceof GrandBouclier)
        // {
//impression stringScanner sc = new Scanner(System.in);
//                System.out.println("Distribution de baffes! Et BAM! Dans sa mouille!")
    }


    //methode interact
}

