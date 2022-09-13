package personnages;

import java.util.Random;

public class Personnage {

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Attributs">
    // TODO : Mettre vos attributs ici
    private String nom;
    private int pointsDeVie;
    private int valeurMaxAttaque;
    private int valeurDefense;
    private int initiative;

    // </editor-fold>
    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Constructeurs et initialisation">
    public Personnage(String nom, int attaqueMax, int defense, int pvs, int ini) {
        // TODO : Constructeur AVEC paramètres
        this.nom = nom;
        pointsDeVie = pvs;
        valeurMaxAttaque = attaqueMax;
        valeurDefense = defense;
        initiative = ini;

        afficherInfosPersonnage();
    }

    public Personnage() {
        // TODO : Constructeur SANS paramètres qui initialise à ZÉRO ou à ""
        nom = "";
        pointsDeVie = 0;
        valeurMaxAttaque = 0;
        valeurDefense = 0;
        initiative = 0;
    }

    // </editor-fold>
    public String getNom() {
        return nom;
    }

    public int getPointsDeVie() {
        return pointsDeVie;
    }

    public int getValeurMaxAttaque() {
        return valeurMaxAttaque;
    }

    public int getValeurDefense() {
        return valeurDefense;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPointsDeVie(int pointsDeVie) {
        this.pointsDeVie = pointsDeVie;
    }

    public void setValeurMaxAttaque(int valeurMaxAttaque) {
        this.valeurMaxAttaque = valeurMaxAttaque;
    }

    public void setValeurDefense(int valeurDefense) {
        this.valeurDefense = valeurDefense;
    }

    public void setInitiative(int initiative) {
        this.initiative = initiative;
    }

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Getters et setters">
    // TODO : Les getters
    public int getInitiative() {
        return initiative;
    }

    // TODO : Les setters
    // </editor-fold>
    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Mécanique de jeu">
    public void afficherInfosPersonnage() {
        // TODO : Afficher les infos du personnage, tel que montré dans l'énoncé

        System.out.println("");
        System.out.println(getNom());
        System.out.println("    Attaque : " + getValeurMaxAttaque());
        System.out.println("    Defense : " + getValeurDefense());
        System.out.println("    Points de vie : " + getPointsDeVie());
        System.out.println("    Initiative : " + getInitiative());

        if (pointsDeVie <= 0) {
            System.out.println("    Statue : Mort");
        } else {
            System.out.println("    Statue : Vivant");
        }

    }

    private int attaqueCalcul() {
        // TODO : Retourner la valeur de l'attaque du personnage.
        // Cette valeur est trouvée aléatoirement et doit se situer entre ZÉRO et valeurMaxAttaque.
        Random rand = new Random();
        int min = 0;
        int max = Personnage.this.getValeurMaxAttaque();
        int nombRand = rand.nextInt(max - min) + min;
        return nombRand;
    }

    public void frapperPersonnage(Personnage personnageCible) {
        // TODO : Récupérer la valeur d'attaque pour ce tour, calculer les dégats,
        int forceDeFrappe = attaqueCalcul();
        int valeurDefense = personnageCible.getValeurDefense();
        int dommages = forceDeFrappe - valeurDefense;
        
        if (dommages < 0) {
            dommages = 0;
        }
        personnageCible.setPointsDeVie(pointsDeVie - dommages);
        
        if (personnageCible.getPointsDeVie() < 0) {
            personnageCible.setPointsDeVie(0);
        }
        //modifier les points de vie du personnage cible, afficher les détails
        // sur l'attaque, tel que montré dans l'énoncé.
        
        System.out.println();
        System.out.println(Personnage.this.getNom() + " attaque avec une puissance de : " + forceDeFrappe);
        System.out.println(personnageCible.getNom() + " a une defense de : " + valeurDefense);
        System.out.println("Les dommages sont donc de : " + dommages);
    }

    public void setNewInitiativeRandom() {
        // TODO : Modifier de façon aléatoire la valeur INI du personnage.
    }
    // </editor-fold>
}
