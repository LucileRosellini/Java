package ProjetWarrior;
import java.util.Scanner;
import java.util.ArrayList;

public class Plateau {

    public ArrayList<String> al;
    public Plateau(){
        al.add("Départ");
        al.add("Vous êtes perdu dans le donjon. Vous pleurez à chaude larme en priant pour que vôtre maman vienne vous cherchez.");
        al.add("Vous trouvez un bout de bois! Ne vous encombrez pas avec ce truc!");
        al.add("Gobelin!");
        al.add("Vous êtes perdu dans le donjon. Vous pleurez à chaude larme en priant pour que vôtre maman vienne vous cherchez.");
        al.add("Vous trouvez un bout de bois! Ne vous encombrez pas avec ce truc!");
        al.add("Gobelin!");// al.add( Ievent=new gobelin() )
        al.add("Un p'tit cookies pour la route?");
        al.add("Vous êtes perdu dans le donjon. Vous pleurez à chaude larme en priant pour que vôtre maman vienne vous cherchez.");
        al.add("Gobelin!");
        al.add("Sorcier!");
        al.add("Vous trouvez un bout de bois! Ne vous encombrez pas avec ce truc!");
        al.add("Gobelin!");
        al.add("Un p'tit cookies pour la route?");
        al.add("Nop! Rien ici!");
        al.add("Gobelin!");
        al.add("Nop! Rien ici!");
        al.add("Vous êtes perdu dans le donjon. Vous pleurez à chaude larme en priant pour que vôtre maman vienne vous cherchez.");
        al.add("Gobelin!");
        al.add("Vous trouvez une bourse remplit d'or! Et hop! In The pocket!");
        al.add("Sorcier!");
        al.add("Gobelin!");
        al.add("Vous trouvez un bout de bois! Ne vous encombrez pas avec ce truc!");
        al.add("Vous êtes perdu dans le donjon. Vous pleurez à chaude larme en priant pour que vôtre maman vienne vous cherchez.");
        al.add("Gobelin!");
        al.add("Sorcier!");
        al.add("Vous trouvez une bourse remplit d'or! Et hop! In The pocket!");
        al.add("Gobelin!");
        al.add("Vous vous faites des grillades et reprennez des forces!");
        al.add("Nop! Nop... Demi-tour, ça pue trop!");
        al.add("Nop! Nop... Demi-tour, ça pue trop!");
        al.add("Un p'tit cookies pour la route?");
        al.add("Sorcier!");
        al.add("Un p'tit cookies pour la route?");
        al.add("Nop! Nop... Demi-tour, ça pue trop!");
        al.add("Nop! Rien ici!");
        al.add("Sorcier!");
        al.add("Sorcier!");
        al.add("Vous trouvez un bout de bois! Ne vous encombrez pas avec ce truc!");
        al.add("Un p'tit cookies pour la route?");
        al.add("Sorcier!");
        al.add("Vous vous faites des grillades et reprennez des forces!");
        al.add("Vous trouvez une bourse remplit d'or! Et hop! In The pocket!");
        al.add("Un p'tit cookies pour la route?");
        al.add("Sorcier!");
        al.add("Dragons!");
        al.add("Nop! Nop... Demi-tour, ça pue trop!");
        al.add("Sorcier!");
        al.add("Vous piquez un p'tit roupillon. Vous vous sentez frais et dispo!");
        al.add("Vous piquez un p'tit roupillon. Vous vous sentez frais et dispo!");
        al.add("Nop! Rien ici!");
        al.add("Nop! Rien ici!");
        al.add("Dragons!");
        al.add("Vous trouvez une bourse remplit d'or! Et hop! In The pocket!");
        al.add("Nop! Nop... Demi-tour, ça pue trop!");
        al.add("Nop! Rien ici!");
        al.add("Dragons!");
        al.add("Nop! Rien ici!");
        al.add("Nop! Rien ici!");
        al.add("Nop! Rien ici!");
        al.add("Nop! Rien ici!");
        al.add("Nop! Rien ici!");
        al.add("Nop! Rien ici!");
        al.add("Nop! Rien ici!");
    }

    public boolean isMonster(int position) {
        switch(al.get(position)) {
            case "Sorcier!":
                return true;
            case "Gobelin!":
                return true;
            case "Dragons!":
                return true;
            default:
                return false;
        }
    }

    public String getMessage(int position) {
        return al.get(position);
    }
}

