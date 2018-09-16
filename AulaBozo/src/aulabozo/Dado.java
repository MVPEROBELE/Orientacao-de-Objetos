/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulabozo;
import java.util.Random;
/**
 *
 * @author Supervisor
 */
public class Dado {
    private int faceCima;

    public void rolar(){
Random ran = new Random();
faceCima = ran.nextInt(6) +1;
}
    
public void imprimeValor () {
    
    System.out.println(faceCima + " ");
}

public int retornaValor () {
    return faceCima;
}
}
