/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personnages;

import java.util.Random;

/**
 *
 * @author ETI
 */
public class Mirmillon extends Personnage {

    public Mirmillon(String nom, int attaqueMax, int defense, int pvs) {

        super(nom, attaqueMax, defense, pvs, 30, "Mirmillon");
        //test

    }

    @Override
    public void setNewInitiativeRandom() {
        // TODO : Modifier de façon aléatoire la valeur INI du personnage.
        Random rand = new Random();
        int min = 0;
        int max = 30;
        int nombRandIni = rand.nextInt(max - min) + min;
        Mirmillon.this.setInitiative(nombRandIni);
    }

    @Override
    public void frapperPersonnage(Personnage personnageCible) {
        super.frapperPersonnage(personnageCible);
        System.out.println();
        if (personnageCible.getPointsDeVie() > 0) {
            System.out.println("Bob le malchanceux frappe de nouveau");
            super.frapperPersonnage(personnageCible);
        } else {
            System.out.println("Bob le malchanceux decapite son adversaire");
        }

    }
}
