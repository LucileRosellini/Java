package ProjetWarrior;
import Adversaire.Dragons;
import Adversaire.Gobelins;
import Adversaire.Sorciers;
import buff.GrandePotion;
import buff.PetitePotion;

import java.util.Scanner;
import java.util.ArrayList;

public class Plateau {

    public IEvent getCase(int position) {
        return al.get(position);
    }

    public ArrayList<IEvent> al;
    public Plateau(){
        this.al = new ArrayList<>();
        al.add(new EmptyCase());
        al.add(new EmptyCase());
        al.add(new EmptyCase());
        al.add(new Gobelins());
        al.add(new EmptyCase());
        al.add(new EmptyCase());
        al.add(new Gobelins());// al.add( Ievent=new gobelin() )
        al.add(new PetitePotion());
        al.add(new EmptyCase());
        al.add(new Gobelins());
        al.add(new Dragons());
        al.add(new EmptyCase());
        al.add(new Gobelins());
        al.add(new PetitePotion());
        al.add(new EmptyCase());
        al.add(new Gobelins());
        al.add(new EmptyCase());
        al.add(new EmptyCase());
        al.add(new Gobelins());
        al.add(new EmptyCase());
        al.add(new Sorciers());
        al.add(new Gobelins());
        al.add(new EmptyCase());
        al.add(new EmptyCase());
        al.add(new Gobelins());
        al.add(new Sorciers());
        al.add(new EmptyCase());
        al.add(new Gobelins());
        al.add(new GrandePotion());
        al.add(new EmptyCase());
        al.add(new EmptyCase());
        al.add(new PetitePotion());
        al.add(new Sorciers());
        al.add(new PetitePotion());
        al.add(new EmptyCase());
        al.add(new EmptyCase());
        al.add(new Sorciers());
        al.add(new Sorciers());
        al.add(new EmptyCase());
        al.add(new PetitePotion());
        al.add(new Sorciers());
        al.add(new GrandePotion());
        al.add(new EmptyCase());
        al.add(new PetitePotion());
        al.add(new Sorciers());
        al.add(new Dragons());
        al.add(new EmptyCase());
        al.add(new Sorciers());
        al.add(new GrandePotion());
        al.add(new PetitePotion());
        al.add(new EmptyCase());
        al.add(new EmptyCase());
        al.add(new Dragons());
        al.add(new EmptyCase());
        al.add(new PetitePotion());
        al.add(new EmptyCase());
        al.add(new Dragons());
        al.add(new EmptyCase());
        al.add(new EmptyCase());
        al.add(new EmptyCase());
        al.add(new EmptyCase());
        al.add(new EmptyCase());
        al.add(new EmptyCase());
        al.add(new EmptyCase());
    }
    public void addEmptyCase() {
        al.add(new EmptyCase());
    }
    public void deleteCase(int position) {
        al.remove(position);
    }
}

