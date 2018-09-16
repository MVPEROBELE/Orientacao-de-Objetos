package aulabozo;
import java.util.ArrayList;
import java.util.Scanner;


public class Bozo {
   
    private ArrayList<Jogador> jogadores = new ArrayList<Jogador>();
    private int numJogadores;
    int dados[]=new int [4];
    Dado dado = new Dado();

public void setNumJogadores (int num) {
    this.numJogadores = num;
}

public int getNumJogadores (){
    return this.numJogadores;
}

public ArrayList<Jogador>getJogadores(){
    return this.jogadores;
}

public void mostrarDados (){
    for (int i=0; i<5; i++) {
    dado.imprimeValor();
        System.out.println("\n");
}}
    
public void rolarDados(){
    for(int i=0; i<5; i++){
    dado.rolar();
    dados[i]= dado.retornaValor();
            
    }
}

public void alteraDados (int valor){
for (int i=0; i<5; i++)
{
    if (dados[i]==valor)
    {
        dado.rolar();
        dados[i]=dado.retornaValor();
        return;
    }
        }}

public void jogarNovamente(){
Scanner leitor = new Scanner (System.in);
char aux;
int nDados;
int dadoAlterar;

for (int j=0; j<2; j++){
    System.out.println("Gostaria de jogar dados novamente? S/N");
    aux = leitor.next().charAt(0);
    if (aux == 'N' || aux == 'n'){
        mostrarDados();
        return;
    }
    else if (aux != 'S' && aux != 's')
    {
        System.out.println("Operacao nao identificada. Selecione novamente.");
        j = j-1;
    }
    else
    {
        System.out.println("Informe quantos dados deseja jogar novamente: ");
        nDados = leitor.nextInt();
        for (int k=0; k < nDados; k++){
            System.out.println("Informe o valor do dado para joga-lo novamente:");
            dadoAlterar = leitor.nextInt();
            alteraDados (dadoAlterar);   
        }
    }   
}
mostrarDados();
}


public void calculaPlacar (int j)
{
    System.out.println("As Duque Terno Quadra Quina Sena Fu Seguida Quadrada Gerenal \n");
    System.out.println("Escolha a posicao no tabuleiro de 0 a 9: \n");
    Scanner leitor = new Scanner (System.in);
    int aux = leitor.nextInt();
    while (jogadores.get(j).tabuleiro.retornaPont(aux)!= (-1));{
            System.out.println("Posicao já preenchida. Escolha novamente: ");
            aux = leitor.nextInt();
}
    System.out.println("Marque sua pontuacao: ");
    int aux2 = leitor.nextInt();
    jogadores.get(j).tabuleiro.inserePontuacao(aux, aux2);
}

public void revelaPlacar(){
for (Jogador jogador: jogadores){
    System.out.println(jogador.retornaNome() + " = " + jogador.tabuleiro.calculaPontuacao() + "\n");
}

}
public void jogar (){
   
    for (int i=0; i<10; i++){
    System.out.println("Rodada " + (i+1) + "\n");
    int n= jogadores.size();
        for (int j=0; j<n; j++) {
        System.out.println("Jogador " + jogadores.get(j).retornaNome() + "\n");
        System.out.println("Dados: ");
        rolarDados(); 
        mostrarDados();
        jogarNovamente();
        calculaPlacar (j);
    }}
revelaPlacar();

}}

