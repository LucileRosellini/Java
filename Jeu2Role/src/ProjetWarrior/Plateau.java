package ProjetWarrior;
import java.util.Scanner;


public class Plateau {
    String plateau_de_jeu[] = new String[64];
    plateau_de_jeu[0] = new plateau_de_jeu("Départ");
    plateau_de_jeu[1] = new plateau_de_jeu("Vous êtes perdu dans le donjon. Vous pleurez à chaude larme en priant pour que vôtre maman vienne vous cherchez.");
    plateau_de_jeu[2] = new plateau_de_jeu("Vous trouvez un bout de bois! Ne vous encombrez pas avec ce truc!");
    plateau_de_jeu[3] = new plateau_de_jeu("Gobelin!");
    plateau_de_jeu[4] = new plateau_de_jeu("Vous êtes perdu dans le donjon. Vous pleurez à chaude larme en priant pour que vôtre maman vienne vous cherchez.");
    plateau_de_jeu[5] = new plateau_de_jeu("Vous trouvez un bout de bois! Ne vous encombrez pas avec ce truc!")
    plateau_de_jeu[6] = new plateau_de_jeu("Gobelin!");
    plateau_de_jeu[7] = new plateau_de_jeu("Un p'tit cookies pour la route?");
    plateau_de_jeu[8] = new plateau_de_jeu("Vous êtes perdu dans le donjon. Vous pleurez à chaude larme en priant pour que vôtre maman vienne vous cherchez.");
    plateau_de_jeu[9] = new plateau_de_jeu("Gobelin!");
    plateau_de_jeu[10] = new plateau_de_jeu("Sorcier!");
    plateau_de_jeu[11] = new plateau_de_jeu("Vous trouvez un bout de bois! Ne vous encombrez pas avec ce truc!");
    plateau_de_jeu[12] = new plateau_de_jeu("Gobelin!");
    plateau_de_jeu[13] = new plateau_de_jeu("Un p'tit cookies pour la route?");
    plateau_de_jeu[14] = new plateau_de_jeu("Nop! Nop... Demi-tour, ça pue trop!");
    plateau_de_jeu[15] = new plateau_de_jeu("Gobelin!");
    plateau_de_jeu[16] = new plateau_de_jeu("Nop! Nop... Demi-tour, ça pue trop!");
    plateau_de_jeu[17] = new plateau_de_jeu("Vous êtes perdu dans le donjon. Vous pleurez à chaude larme en priant pour que vôtre maman vienne vous cherchez.");
    plateau_de_jeu[18] = new plateau_de_jeu("Gobelin!");
    plateau_de_jeu[19] = new plateau_de_jeu("Vous trouvez une bourse remplit d'or! Et hop! In The pocket!");
    plateau_de_jeu[20] = new plateau_de_jeu("Sorcier!");
    plateau_de_jeu[21] = new plateau_de_jeu("Gobelin!");
    plateau_de_jeu[22] = new plateau_de_jeu("Vous trouvez un bout de bois! Ne vous encombrez pas avec ce truc!")
    plateau_de_jeu[23] = new plateau_de_jeu("Vous êtes perdu dans le donjon. Vous pleurez à chaude larme en priant pour que vôtre maman vienne vous cherchez.");
    plateau_de_jeu[24] = new plateau_de_jeu("Gobelin!");
    plateau_de_jeu[25] = new plateau_de_jeu("Sorcier!");
    plateau_de_jeu[26] = new plateau_de_jeu("Vous trouvez une bourse remplit d'or! Et hop! In The pocket!");
    plateau_de_jeu[27] = new plateau_de_jeu("Gobelin!");
    plateau_de_jeu[28] = new plateau_de_jeu("Vous vous faites des grillades et reprennez des forces!");
    plateau_de_jeu[29] = new plateau_de_jeu("Nop! Nop... Demi-tour, ça pue trop!");
    plateau_de_jeu[30] = new plateau_de_jeu("Nop! Nop... Demi-tour, ça pue trop!");
    plateau_de_jeu[31] = new plateau_de_jeu("Un p'tit cookies pour la route?");
    plateau_de_jeu[32] = new plateau_de_jeu("Sorcier!");
    plateau_de_jeu[33] = new plateau_de_jeu("Un p'tit cookies pour la route?");
    plateau_de_jeu[34] = new plateau_de_jeu("Nop! Nop... Demi-tour, ça pue trop!");
    plateau_de_jeu[35] = new plateau_de_jeu("Nop! Nop... Demi-tour, ça pue trop!");
    plateau_de_jeu[36] = new plateau_de_jeu("Sorcier!");
    plateau_de_jeu[37] = new plateau_de_jeu("Sorcier!");
    plateau_de_jeu[38] = new plateau_de_jeu("Vous trouvez un bout de bois! Ne vous encombrez pas avec ce truc!")
    plateau_de_jeu[39] = new plateau_de_jeu("Un p'tit cookies pour la route?");
    plateau_de_jeu[40] = new plateau_de_jeu("Sorcier!");
    plateau_de_jeu[41] = new plateau_de_jeu("Vous vous faites des grillades et reprennez des forces!");
    plateau_de_jeu[42] = new plateau_de_jeu("Vous trouvez une bourse remplit d'or! Et hop! In The pocket!");
    plateau_de_jeu[43] = new plateau_de_jeu("Un p'tit cookies pour la route?");
    plateau_de_jeu[44] = new plateau_de_jeu("Sorcier!");
    plateau_de_jeu[45] = new plateau_de_jeu("Dragons!");
    plateau_de_jeu[46] = new plateau_de_jeu("Nop! Nop... Demi-tour, ça pue trop!");
    plateau_de_jeu[47] = new plateau_de_jeu("Sorcier!");
    plateau_de_jeu[48] = new plateau_de_jeu("Vous piquez un p'tit roupillon. Vous vous sentez frais et dispo!");
    plateau_de_jeu[49] = new plateau_de_jeu("Vous piquez un p'tit roupillon. Vous vous sentez frais et dispo!");
    plateau_de_jeu[50] = new plateau_de_jeu("Nop! Nop... Demi-tour, ça pue trop!");
    plateau_de_jeu[51] = new plateau_de_jeu("Nop! Nop... Demi-tour, ça pue trop!");
    plateau_de_jeu[52] = new plateau_de_jeu("Dragons!");
    plateau_de_jeu[53] = new plateau_de_jeu("Vous trouvez une bourse remplit d'or! Et hop! In The pocket!");
    plateau_de_jeu[54] = new plateau_de_jeu("Nop! Nop... Demi-tour, ça pue trop!");
    plateau_de_jeu[55] = new plateau_de_jeu("Nop! Nop... Demi-tour, ça pue trop!");
    plateau_de_jeu[56] = new plateau_de_jeu("Dragons!");
    plateau_de_jeu[57] = new plateau_de_jeu("Nop! Nop... Demi-tour, ça pue trop!");
    plateau_de_jeu[58] = new plateau_de_jeu("Nop! Nop... Demi-tour, ça pue trop!");
    plateau_de_jeu[59] = new plateau_de_jeu("Nop! Nop... Demi-tour, ça pue trop!");
    plateau_de_jeu[60] = new plateau_de_jeu("Nop! Nop... Demi-tour, ça pue trop!");
    plateau_de_jeu[61] = new plateau_de_jeu("Nop! Nop... Demi-tour, ça pue trop!");
    plateau_de_jeu[62] = new plateau_de_jeu("Nop! Nop... Demi-tour, ça pue trop!");
    plateau_de_jeu[63] = new plateau_de_jeu("Nop! Nop... Demi-tour, ça pue trop!");

}
