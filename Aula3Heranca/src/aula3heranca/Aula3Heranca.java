/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula3heranca;

import java.util.ArrayList;

/**
 *
 * @author Supervisor
 */
public class Aula3Heranca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Animal> animais = new ArrayList();
        animais.add(new Cachorro());
        animais.add(new Gato());
        animais.add(new Felino());
        animais.add(new Ave());
        Gato gato1 = new Gato();
        Gato gato2 = new Gato ();
        gato1.setNome ("Toby");
        gato2.setNome("Toby");
        animais.add(new Ave());
        
        for (int i=0; i<animais.size();i++)
        {
        animais.get(i).emitirSom();
            System.out.println(animais.get(i).toString());
        }
            
            System.out.println(gato1.equals(gato2));
       /// animais.get(i].)[]
        
        
      
    }
    
}
