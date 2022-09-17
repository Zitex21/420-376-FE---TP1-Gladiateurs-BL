package jeugladiateurs;

import personnages.Personnage;
import combat.CompteurDeTour;
import combat.AffichageEcran;
import personnages.mirmillon;

public class JeuGladiateurs {

    public static void main(String[] args) {

        // **************************************************************************
        // **************************************************************************
        // **************************************************************************
        // <editor-fold defaultstate="collapsed" desc="Instanciation des objets">
        CompteurDeTour tour = new CompteurDeTour();
        AffichageEcran affichage = new AffichageEcran();
//        Personnage bob = new Personnage("Bob le malchanceux", 15, 15, 70, 1, "mirmillon");
        Personnage igor = new Personnage("Igor l'empaleur", 25, 5, 100, 3, "retiaire");
        affichage.afficherDebutCombat();
        mirmillon bob = new mirmillon("Bob le malchanceux", 15, 15, 70);
        
        

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
        // <editor-fold defaultstate="collapsed" desc="Affichage pré-combat">
        // TODO : Afficher les infos de chaque personnage
        // TODO : Afficher le message du début du combat
        // </editor-fold>
        // **************************************************************************
        // **************************************************************************
        // **************************************************************************
        // <editor-fold defaultstate="collapsed" desc="Mécanique de combat">
        // TODO : La boucle contenant les étapes du combat
        // TODO : Après la boucle, afficher le résultat du combat
        // </editor-fold>
    }

}
