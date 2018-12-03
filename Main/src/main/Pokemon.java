/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Millena Venturini
 */
public class Pokemon {
    //cria nome e tipo
    private String nome;
    private Tipo tipo;
  

    public Pokemon() {
        
    }
    //altera tipo
    public void setTipo (Tipo tipo){
    this.tipo = tipo;
    
    }
    //retorna tipo
    Tipo getTipo (){  
    return tipo;
    }
    //altera nome
    public void setNome (String nome){
        this.nome = nome;
    }
    //retorna nome
    public String getNome() {
        return nome;
    }
   
    
  
}
