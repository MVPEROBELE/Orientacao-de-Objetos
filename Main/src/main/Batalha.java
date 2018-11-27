/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import controle.Controle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Batalha extends Pokemon {

    List<Pokemon> misturarPokemon = new ArrayList();

    public void Round1() {

        for (int i = 0; i < 8; i++) {
            Controle.getControle().addRound1(Controle.getControle().getBatalha().batalhar(Controle.getControle().getParticipantes().get(i), Controle.getControle().getParticipantes().get(i + 1)));
            i++;
        }
    }

    public void Round2() {
        for (int i = 0; i < 4; i++) {
            Controle.getControle().addRound2(Controle.getControle().getBatalha().batalhar(Controle.getControle().getRound1().get(i), Controle.getControle().getRound1().get(i + 1)));
            i++;
        }
    }

    public void Round3() {

        Controle.getControle().setGanhador(Controle.getControle().getBatalha().batalhar(Controle.getControle().getRound2().get(0), Controle.getControle().getRound2().get(1)));
    }

    public Pokemon batalhar(Pokemon p1, Pokemon p2) {

        if (p1.getTipo().getVantagens().contains(p2.getTipo())) {
            return p1;
        } else if (p2.getTipo().getVantagens().contains(p1.getTipo())) {
            return p2;
        }
        misturarPokemon.add(p1);
        misturarPokemon.add(p2);
        Collections.shuffle(misturarPokemon);
        return misturarPokemon.get(0);

    }

    public void gerarBatalha() {
        Round1();
        Round2();
        Round3();
    }

    public void limparBatalha() {
        List<Pokemon> vazio = new ArrayList();
        Controle.getControle().setRound1(vazio);
        Controle.getControle().setRound2(vazio);
        misturarPokemon = vazio;

    }

}
