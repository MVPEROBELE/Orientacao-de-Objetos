/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemonheranca;

/**
 *
 * @author Supervisor
 */
public class PokemonHeranca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Eletrico pikachu = new Eletrico();
        Fogo charmander = new Fogo();
        Agua poliwag = new Agua();
        Psiquico abra = new Psiquico ();
        
        abra.setName("abra");
        pikachu.setName("pikachu");
    }
    
}
