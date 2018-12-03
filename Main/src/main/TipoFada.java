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
public class TipoFada extends Tipo{
      @Override

      
 /**
 *
 * define as vantagens do tipo
 */      
      public void setVantagens() {
        this.vantagens.add(new TipoNoturno());
        this.vantagens.add(new TipoDragao());
        this.vantagens.add(new TipoLutador());
        this.vantagens.add(new TipoInseto());
  
    }
    
}
