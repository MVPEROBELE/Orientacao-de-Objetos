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
public class AulaBozo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bozo bozo = new Bozo ();
    Scanner leitor = new Scanner (System.in);
        System.out.println("Digite o numero de jogadores: ");
       int num = leitor.nextInt();
    bozo.setNumJogadores(num);

    for (int i=0; i<bozo.getNumJogadores(); i++){
        System.out.println("Digite o nome do "+i+"o jogador: ");
        String nome = leitor.next();
        bozo.getJogadores().add(new Jogador(nome));
    }
    bozo.jogar();

    }
    
}
