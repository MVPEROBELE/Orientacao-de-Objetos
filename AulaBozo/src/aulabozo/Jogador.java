/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulabozo;
import java.util.Scanner;
/**
 *
 * @author Supervisor
 */
public class Jogador {
    private String nome;
    private int numJogadores;
    Tabuleiro tabuleiro = new Tabuleiro();
    
    public Jogador (String nome){   
    this.nome = nome;
    }
    
    public String retornaNome ()
    {
    return nome;
    }
}
    



