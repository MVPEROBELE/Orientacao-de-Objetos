/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heranca2;
import java.util.ArrayList;

/**
 *
 * @author ice
 */
public class Heranca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Gato g = new Gato();
        Cachorro c = new Cachorro();
        c.som();
        g.som();
        Leao l = new Leao();
        l.som();
        ArrayList <Animal> animais = new ArrayList <Animal>();
        animais.add(new Gato());
        animais.add(new Cachorro());
        animais.add(new Leao());
        
        animais.get(0).comer("atum");
        animais.get(1).comer("ração");
        animais.get(2).comer("bife");
        
        for (int i=0; i< animais.size(); i++)
        {
            
        animais.get(i).som();
        
        }
               
    }
    
}
