/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula3heranca;

/**
 *
 * @author Supervisor
 */
public class Cachorro extends Animal{
    @Override
    public void emitirSom(){
        super.emitirSom();
            System.out.println("Auau");
}
}
