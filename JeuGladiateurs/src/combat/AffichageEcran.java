package combat;

import personnages.Personnage;

public class AffichageEcran {

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Méthodes d'affichage">
    public void afficherDebutCombat() {
        // TODO : Afficher le message du début du combat, tel que montré dans l'énoncé
        
        System.out.println("");
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        System.out.println(">>>>> Que le combat commence ! <<<<<");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    }
    
    public void afficherSeparateurDeTour() {
        // TODO : Afficher un retour à la ligne, suivi d'une ligne d'astérisques, tel que montré dans l'énoncé
        System.out.println();
        System.out.println("************************************************");
    }

    public void afficherSeparateurInfosPerso() {
        // TODO : Afficher un retour à la ligne, suivi du séparateur "infos personnages", tel que montré dans l'énoncé
        System.out.println();
        System.out.println("-----------------");
        System.out.println("INFOS PERSONNAGES");
        System.out.println("-----------------");
    }

    public void afficheVictoire(Personnage bob, Personnage igor) {
        // TODO : Afficher le gagnant du combat, tel que montré dans l'énoncé
        if (bob.getPointsDeVie() <= 0 && igor.getPointsDeVie() > 0) {
            System.out.println("Igor l'empaleur gagne le combat !!! ");
        }
        else{
            System.out.println();
            System.out.println("Bob le malchanceux gagne le combat !!! ");
        }
    }
    // </editor-fold>
}
