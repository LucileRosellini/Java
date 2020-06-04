package ProjetWarrior;

import Perso.Personnage;

import java.util.Random;

public class EmptyCase implements IEvent {

    private String name;

    public EmptyCase() {
        this.name = "porte";

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "EmptyCase{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void interaction(Personnage player) {

        Random random = new Random();
        int nb;
        nb = random.nextInt(9);

        switch (nb){
          case 0:
          System.out.println("Vous trouvez une bourse remplit d'or! Et hop! In The pocket!");
          break;

          case 1:
          System.out.println("Vous entrez dans une grande pièce remplit de toiles d'araignées, vous fouillez mais vous ne trouvez rien. Vous retournez dans la pièce principale.");
          break;

          case 2:
          System.out.println("Pouark!... Demi-tour, ça pue trop! vous vous jettez sur une autre porte!");
          break;

          case 3:
          System.out.println("Vous fouillez un ratelier d'arme et trouvez une épée rouillée, que comptez-vous faire avec ça?");
          break;

          case 4:
          System.out.println("Vous marchez dans une crotte de troll... Vous priez pour ne pas le rencontrer!");
          break;

          case 5:
          System.out.println("Vous trouvez une bourse remplit d'or! Et hop! In The pocket! ");
          break;

          case 6:
          System.out.println("Vous trouvez un bout de bois! Ne vous encombrez pas avec ce truc!");
          break;

          case 7:
          System.out.println("Vous avez pris le mauvais chemin. Bien joué! Vous êtes perdu. ( C'est pas la peine de pleurer! Vôtre môman ne viendra pas vous cherchez.)guerr");
          break;

          case 8:
          System.out.println("Vous avez trouvé un grimmoire trés ancien... Impecable pour aller aux latrines!");
          break;
          }

    }
}
