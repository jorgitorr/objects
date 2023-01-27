/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package objetosEjercicio_II.juegos;

/**
 *
 * @author jorge
 */
public class Partida {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mano mano1 = new Mano();
        Mano mano2 = new Mano();
        
        mano1.setCarta(1);
        mano1.setCarta(2);
        mano1.setCarta(3);
        
        mano2.setCarta(1);
        mano2.setCarta(2);
        mano2.setCarta(3);
        
        System.out.println("mano 1: " + mano1);
        System.out.println("mano 2: " + mano2);
        mano1.manoGanadora(mano2);
        
    }
    
}
