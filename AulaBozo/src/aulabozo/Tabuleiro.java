/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulabozo;

/**
 *
 * @author Supervisor
 */
public class Tabuleiro {
    private int tabuleiro[] = new int[10];
	
    public Tabuleiro(){
    for (int i=0; i<10; i++){
        this.tabuleiro[i]=-1;
    }
}

    public int calculaPontuacao(){
    int pontuacao = 0;
    for (int i=0; i<10; i++)
    {
	pontuacao += this.tabuleiro[i];
    }
    return pontuacao;
}
    
    public int retornaPont (int posicao)
    {
    return tabuleiro[posicao];
    }
    public void inserePontuacao (int posição, int valor){
        this.tabuleiro[posição]=valor;
    }
    
    public void mostrarTabuleiro (){
    
    for (int i=0; i<10; i++){
        System.out.println(tabuleiro[i] + " ");
        }
    
}
}

