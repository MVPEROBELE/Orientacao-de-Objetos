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
public class TipoVenenoso extends Tipo {
      @Override
    public void setVantagens() {
        this.vantagens.add(new TipoFada());
        this.vantagens.add(new TipoPlanta());
        this.vantagens.add(new TipoInseto());
        this.vantagens.add(new TipoLutador());
  
    }
    
}
