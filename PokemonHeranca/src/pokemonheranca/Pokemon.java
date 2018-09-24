/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemonheranca;

/**
 *
 * @author Supervisor
 */
public abstract class Pokemon {
    private String nome;
    private int nivel;
    private int ataque;
    private int defesa;
    
     public void setName (String nome){
   this.nome = nome;
 /*  this.nivel = nivel;
   this.ataque = ataque;
   this.defesa = defesa;*/
    }
    
    public void imprimeNome (){
        System.out.println(nome);
    }
    public void imprimeNivel (){
        System.out.println(nivel);
    }
    public void imprimeAtaque (){
        System.out.println(ataque);
    }
    
    public void imprimeDefesa (){
       System.out.println(defesa);
    }
      
    public String retornaNome (){
    return nome;
    }
    
    public int retornaAtaque (){
        return ataque;
    }
    
    public int retornaDefesa (){
        return defesa;
    }
    
    public int retornaNivel (){
        return nivel;
    }

    
}
