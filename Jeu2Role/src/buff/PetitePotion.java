package buff;

import Perso.Personnage;

public class PetitePotion extends BonusDef{
    public PetitePotion() {
        super("Petite potion de vie", 2);
    }

    @Override
    public void interaction(Personnage player) {
        player.setHealth(player.getHealth()+2);
        System.out.println("vous prennez un cookie et vous gagnez deux points de vie.");
    }
}
