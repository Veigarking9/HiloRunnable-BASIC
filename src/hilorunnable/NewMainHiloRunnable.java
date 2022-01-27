/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilorunnable;

/**
 *
 * @author xabier.barreiroalber
 */
public class NewMainHiloRunnable {
    public static void main(String[] args) {
        
        HiloRunnable Hilosaludo = new HiloRunnable("Hola");
        Thread hilo1 = new Thread(Hilosaludo);
        
        hilo1.start();

    }
    
}
