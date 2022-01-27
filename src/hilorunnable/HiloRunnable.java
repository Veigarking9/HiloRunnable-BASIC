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
public class HiloRunnable implements Runnable{
    String saludo = "HOLA";
    
    public HiloRunnable(String saludo){
        saludo = saludo;
    }


    public void run() {
        for(int i=0;i<1;i++)
            System.out.println(saludo);
        
    }
    
    
    
}
