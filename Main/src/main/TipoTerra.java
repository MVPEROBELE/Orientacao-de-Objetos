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
public class TipoTerra extends Tipo{
    
      @Override
    public void setVantagens() {
        this.vantagens.add(new TipoFogo());
        this.vantagens.add(new TipoEletrico());
        this.vantagens.add(new TipoPedra());
        this.vantagens.add(new TipoVenenoso());   
    }
    
}
