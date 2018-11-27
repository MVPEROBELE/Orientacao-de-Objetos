/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Supervisor
 */
public class Pokemon {
    
    private String nome;
    private Tipo tipo;
  

    public Pokemon() {
        
    }
    
    public void setTipo (Tipo tipo){
    this.tipo = tipo;
    
    }
    Tipo getTipo (){  
    return tipo;
    }
    public void setNome (String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
   
    
  
}
