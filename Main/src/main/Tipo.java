/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Millena Venturini
 */


public abstract class Tipo{
/**
 *
 * Define string nome, e inicializa Lista Vantagens.
 */
     String nome;
    List<Tipo> vantagens = new ArrayList<>(); 
/**
 *
 * altera vantagens
 */    
    public abstract void setVantagens();
/**
 *
 * retorna as vantagens
 */    
    public List<Tipo> getVantagens(){
        return this.vantagens;
    

}
    
    
}
