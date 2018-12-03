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
public class TipoNoturno extends Tipo {
      @Override
      
 /**
 *
 * define as vantagens do tipo
 */
    public void setVantagens() {
        this.vantagens.add(new TipoFantasma());
        this.vantagens.add(new TipoPsiquico());

    }
}
