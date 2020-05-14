package exoJava2;

public class Main {

    public static void main(String[] args) {
	// write your code here
    int localA=34;
    int localB=0;
    int voyage=0;
    int last;

        while (localA>=9){
            localA-=9;
            localB+=9;
            voyage+=1;

            System.out.println("Vous chargez 9 cartons dans le camion!");
            System.out.println("Vous avez embarqué "+ localB + " cartons à l\'entrepot de stockage");
            System.out.println("Il ne vous reste plus que " + localA + " cartons en tout dans les bureaux de vôtre entreprise.");
            System.out.println( "Nombre de voyage:" + voyage );
            System.out.println("\n");

        if (localA<=9){

          last=34-localB;
          voyage+=1;

            System.out.println("Vous ammenez "+ last + " cartons à l\'entrepot de stockage");
            System.out.println("Vos bureaux sont vides!");
            System.out.println( "Nombre de voyage:" + voyage );
            System.out.println("\n");
            System.out.println( "------------------------FIN--------------------------" );
            System.out.println("\n");
            System.out.println( "________$$$$$$$$______$$$$$$$$$___ " );
            System.out.println( "______$$$$$$$$$$$$__$$$$$$$$$$$$$_ " );
            System.out.println( "______$$$$$$$$$$$$$$$$$$$$$$$$$$$_ " );
            System.out.println( "_____$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ " );
            System.out.println( "_____$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ " );
            System.out.println( "______$$$$$$$$$$$$$$$$$$$$$$$$$$$ " );
            System.out.println( "_______$$$$$$$$$$$$$$$$$$$$$$$$__ " );
            System.out.println( "__________$$$$$$$$$$$$$$$$$$$______ " );
            System.out.println( "_____________$$$$$$$$$$$$$________ " );
            System.out.println( "________________$$$$$$$___________ " );
            System.out.println( "__________________$$$_____________ " );
            System.out.println( "___________________$_____________ " );


        }
        }
    }
}
