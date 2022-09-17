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
public class Retiaire extends Personnage {
    
    private boolean filet = true;    

    public Retiaire(String nom, int attaqueMax, int defense, int pvs) {

        super(nom, attaqueMax, defense, pvs, 30, "Retiaire");        

    }

    @Override
    public void frapperPersonnage(Personnage personnageCible) {

        

        Random rand = new Random();
        int min = 0;
        int max = 100;
        int nombRandIni = rand.nextInt(max - min) + min;

        if (this.filet == true) {
            System.out.println();
            System.out.println("Igor l'empaleur lance son filet");
            this.filet = false;

            if (nombRandIni <= 10) {
                System.out.println();
                System.out.println("Son filet attrape Bob le malchanceux et il l'empale sauvagement avec sa lance");
                personnageCible.setPointsDeVie(0);
            } else {
                System.out.println();
                System.out.println("Le filet n'atteint pas sa cible");
            }

        } else {
            System.out.println();
            System.out.println("Igor l'empaleur ramasse son filet et en profite pour attaquer");
            super.frapperPersonnage(personnageCible);

            filet = true;
        }
    }

}
