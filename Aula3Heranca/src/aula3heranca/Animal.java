/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula3heranca;

/**
 *
 * @author Supervisor
 */
public class Animal {
    private String nome;
    private int idade;
    private String raca;
    
    public void setNome (String nome){
        this.nome= nome;
}
    
    public void emitirSom()
    {
        System.out.println("O animal está emitindo som.");
    }
    
    public void dormir()
    {
        System.out.println("O animal está dormindo.");
    }
    public void comer()
    {
        System.out.println("O animal está se alimentando agora.");
    }
    
    
}
