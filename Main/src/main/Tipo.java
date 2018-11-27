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
 * @author Supervisor
 */
public abstract class Tipo{
     String nome;
    List<Tipo> vantagens = new ArrayList<>(); 
    
    public abstract void setVantagens();
    
    public List<Tipo> getVantagens(){
        return this.vantagens;
    

}
    
    
}
