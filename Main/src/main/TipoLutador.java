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
public class TipoLutador extends Tipo {
    
      @Override
    public void setVantagens() {

        this.vantagens.add(new TipoGelo());
        this.vantagens.add(new TipoPedra());

    }
    
}
