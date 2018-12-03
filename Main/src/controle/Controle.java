package controle;

/**
 *
 * @author Millena Venturini
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import main.Batalha;
import main.Pokemon;
import main.TipoAgua;
import main.TipoDragao;
import main.TipoEletrico;
import main.TipoFada;
import main.TipoFantasma;
import main.TipoFogo;
import main.TipoGelo;
import main.TipoInseto;
import main.TipoLutador;
import main.TipoNoturno;
import main.TipoPedra;
import main.TipoPlanta;
import main.TipoPsiquico;
import main.TipoTerra;
import main.TipoVenenoso;
import main.TipoVoador;

public class Controle {
    //inicializa listas de rounds, varivaveis e uma lista vazia.
    private static Controle control = null;
    List<Pokemon> todosPokemons = new ArrayList();
    private List<Pokemon> participantes = new ArrayList(); 
    private List<Pokemon> round1 = new ArrayList(); 
    private List<Pokemon> round2 = new ArrayList(); 
    private List<Pokemon> vazio = new ArrayList();
    private Pokemon ganhador;
    private Pokemon escolhaCampeao;
    private List<String> gravaGanhadores = new ArrayList();
    // Inicializa batalha
    Batalha batalha = new Batalha();
    //altera campeão
    public void setEscolhaCampeao(Pokemon escolhaCampeao) {
        this.escolhaCampeao = escolhaCampeao;
    //retorna campeão
    }

    public List<String> getGravaGanhadores() {
        return gravaGanhadores;
    }

    public void setGravaGanhadores(String gravaGanhadores) {
        this.gravaGanhadores.add(gravaGanhadores);
    }
    public Pokemon getEscolhaCampeao() {
        return escolhaCampeao;
    //altera controle
    }
    public static void setControl(Controle control) {
        Controle.control = control;
    }
    // altera participantes
    public void setParticipantes(List<Pokemon> participantes) {
        this.participantes = participantes;
    }
    //altera round 1
    public void setRound1(List<Pokemon> round1) {
        this.round1 = round1;
    }
    //adiciona ao round 1
    public void addRound1 (Pokemon r){
        round1.add(r);              
    }
    //adiciona ao round 2
    public void addRound2 (Pokemon r){
        round1.add(r);              
    }
    //adiciona ao round 3
    public void addRound3 (Pokemon r){
        round1.add(r);    
    }
    //retorna batalha
    public Batalha getBatalha() {
        return batalha;
    }
    //altera round 2
    public void setRound2(List<Pokemon> round2) {
        this.round2 = round2;
    }
    //altera ganhador
    public void setGanhador(Pokemon ganhador) {
        this.ganhador = ganhador;
    }
    //retorna controle
    public static Controle getControle(){
        if (control == null){
            control = new Controle();
        }
        return control;
    }
    //retorna participantes
    public List<Pokemon> getParticipantes() {
        return participantes;
    }
    //retorna  round1
    public List<Pokemon> getRound1() {
        return round1;
    }
    //retorna round2
    public List<Pokemon> getRound2() {
        return round2;
    }
    //retorna ganhador
    public Pokemon getGanhador() {
        return ganhador;
    }
    //inicializa dados
    public void inicializarDados(){
        
        Pokemon p1 = new Pokemon();
        p1.setTipo(new TipoAgua());
        p1.setNome("AquaPoke");

        Pokemon p2 = new Pokemon();
        p2.setTipo(new TipoFogo());
        p2.setNome("FireGrey");

        Pokemon p3 = new Pokemon();
        p3.setTipo(new TipoVoador());
        p3.setNome("Guifrint");

        Pokemon p4 = new Pokemon();
        p4.setTipo(new TipoTerra());
        p4.setNome("Browser");

        Pokemon p5 = new Pokemon();
        p5.setTipo(new TipoLutador());
        p5.setNome("Spopovite");

        Pokemon p6 = new Pokemon();
        p6.setTipo(new TipoEletrico());
        p6.setNome("Concker");

        Pokemon p7 = new Pokemon();
        p7.setTipo(new TipoVenenoso());
        p7.setNome("Orochibuto");

        Pokemon p8 = new Pokemon();
        p8.setTipo(new TipoInseto());
        p8.setNome("Kabuterion");

        Pokemon p9 = new Pokemon();
        p9.setTipo(new TipoPedra());
        p9.setNome("Growker");

        Pokemon p10 = new Pokemon();
        p10.setTipo(new TipoFantasma());
        p10.setNome("Demoghost");

        Pokemon p11 = new Pokemon();
        p11.setTipo(new TipoNoturno());
        p11.setNome("Darkvaser");

        Pokemon p12 = new Pokemon();
        p12.setTipo(new TipoPsiquico());
        p12.setNome("Shakasky");

        Pokemon p13 = new Pokemon();
        p13.setTipo(new TipoGelo());
        p13.setNome("Nevasca");

        Pokemon p14 = new Pokemon();
        p14.setTipo(new TipoPlanta());
        p14.setNome("Grooth");

        Pokemon p15 = new Pokemon();
        p15.setTipo(new TipoFada());
        p15.setNome("Sowinx");

        Pokemon p16 = new Pokemon();
        p16.setTipo(new TipoDragao());
        p16.setNome("Drogonar");

        todosPokemons.add(p1);
        todosPokemons.add(p2);
        todosPokemons.add(p3);
        todosPokemons.add(p4);
        todosPokemons.add(p5);
        todosPokemons.add(p6);
        todosPokemons.add(p7);
        todosPokemons.add(p8);
        todosPokemons.add(p9);
        todosPokemons.add(p10);
        todosPokemons.add(p11);
        todosPokemons.add(p12);
        todosPokemons.add(p13);
        todosPokemons.add(p14);
        todosPokemons.add(p15);
        todosPokemons.add(p16);

                
    }
    //mistura a lista de pokemons, para gerar a lista de participantes de forma aleatória
    public void misturarPokes(){
        participantes = vazio;        
        Collections.shuffle(todosPokemons);
        participantes.add(todosPokemons.get(0));
        participantes.add(todosPokemons.get(1));
        participantes.add(todosPokemons.get(2));
        participantes.add(todosPokemons.get(3));
        participantes.add(todosPokemons.get(4));
        participantes.add(todosPokemons.get(5));
        participantes.add(todosPokemons.get(6));
        participantes.add(todosPokemons.get(7));
    }
    //Limpa os dados, inicializa-os, mistura os pokemons e seleciona os participantes, e gera batalha.
    public void Jogar (){
       batalha.limparBatalha();
       inicializarDados();
       misturarPokes();
       batalha.gerarBatalha();
        
    }
   
}
