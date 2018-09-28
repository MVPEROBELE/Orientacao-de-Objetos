/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heranca2;

/**
 *
 * @author ice
 */
public class Animal {
    private int idade;
    private String raca;
    private String nome;
    
    public void som(){
       System.out.println("Estou emitindo som"); 
    }
    
    public void comer(String comida){
        System.out.println("Estou comendo " + comida);
    }
    
    public void comer(){
        System.out.println("Estou comendo");
    }
    
     public void dorme(){
        System.out.println("Estou dormindo");
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
     
     
}
