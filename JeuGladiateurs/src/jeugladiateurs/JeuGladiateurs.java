package jeugladiateurs;

//import personnages.Personnage;
import combat.CompteurDeTour;
import combat.AffichageEcran;
import personnages.Mirmillon;
import personnages.Retiaire;



public class JeuGladiateurs {

    public static void main(String[] args) {

        // **************************************************************************
        // **************************************************************************
        // **************************************************************************
        // <CompteurDeToureditor-fold defaultstate="collapsed" desc="Instanciation des objets">
        CompteurDeTour tour = new CompteurDeTour();
        AffichageEcran affichage = new AffichageEcran();
//        Personnage bob = new Personnage("Bob le malchanceux", 15, 15, 70, 1, "mirmillon");
//        Personnage igor = new Personnage("Igor l'empaleur", 25, 5, 100, 3, "retiaire");
        affichage.afficherDebutCombat();
        Mirmillon bob = new Mirmillon("Bob le malchanceux", 15, 15, 70);
       
        Retiaire igor = new Retiaire("Igor l'empaleur", 25, 5, 100);
        
        

        for (int i = 0; i < 100; i++) {

            if (bob.getPointsDeVie() > 0 && igor.getPointsDeVie() > 0) {

                tour.afficheTour();
                if (bob.getInitiative() < igor.getInitiative()) {
                    igor.frapperPersonnage(bob);
                    bob.frapperPersonnage(igor);
                } else {
                    bob.frapperPersonnage(igor);
                    igor.frapperPersonnage(bob);
                }
                affichage.afficherSeparateurInfosPerso();
                bob.afficherInfosPersonnage();
                igor.afficherInfosPersonnage();
                bob.setNewInitiativeRandom();
                igor.setNewInitiativeRandom();
                tour.augmenteTour();
                affichage.afficherSeparateurDeTour();
            } else {
                i = 100;
                affichage.afficheVictoire(bob, igor);
            }
        }

        // </editor-fold>
        // **************************************************************************
        // **************************************************************************
        // **************************************************************************
        // <editor-fold defaultstate="collapsed" desc="Affichage pr??-combat">
        // TODO : Afficher les infos de chaque personnage
        // TODO : Afficher le message du d??but du combat
        // </editor-fold>
        // **************************************************************************
        // **************************************************************************
        // **************************************************************************
        // <editor-fold defaultstate="collapsed" desc="M??canique de combat">
        // TODO : La boucle contenant les ??tapes du combat
        // TODO : Apr??s la boucle, afficher le r??sultat du combat
        // </editor-fold>
    }

}
