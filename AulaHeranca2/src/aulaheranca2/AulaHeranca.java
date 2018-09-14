/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulaheranca2;

/**
 *
 * @author Supervisor
 */
public class AulaHeranca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Animal animal = new Animal();
        animal.comer();
        animal.dormir();
        animal.emitirSom();
        Gato gato = new Gato();
         gato.emitirSom();
         Cachorro cao = new Cachorro();
         cao.emitirSom();
         Felino felino = new Felino();
         felino.emitirSom();
    }
    
}
